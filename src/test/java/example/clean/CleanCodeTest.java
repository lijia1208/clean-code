package example.clean;


import example.clean.enums.CellStatusEnum;
import example.clean.model.Cell;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CleanCodeTest {
    List<int[]> intArrayGameBoard = new ArrayList<>();
    List<Cell> cellGameBoard = new ArrayList<>();
    CleanCode cleanCode = new CleanCode();

    @Before

    public void setUp() throws Exception {

        initIntArrayGameBoard();

        initCellGameBoard();
    }


    @Test
    public void getFlaggedCellsDemo1() {
        Assert.assertTrue(cleanCode.getFlaggedCellsDemo1(intArrayGameBoard).size() == 1);
    }

    @Test
    public void getFlaggedCellsDemo2() {
        Assert.assertTrue(cleanCode.getFlaggedCellsDemo2(cellGameBoard).size() == 2);
    }

    @Test
    public void getFlaggedCellsDemo3() {
        Assert.assertTrue(cleanCode.getFlaggedCellsDemo3(cellGameBoard).size() == 2);
    }

    private void initIntArrayGameBoard() {
        intArrayGameBoard.add(new int[]{1});
        intArrayGameBoard.add(new int[]{2});
        intArrayGameBoard.add(new int[]{3});
        intArrayGameBoard.add(new int[]{4});
    }

    private void initCellGameBoard() {
        cellGameBoard.add(new Cell(CellStatusEnum.FLAGGED));
        cellGameBoard.add(new Cell(CellStatusEnum.FLAGGED));
        cellGameBoard.add(new Cell(CellStatusEnum.UNFLAGGED));
        cellGameBoard.add(new Cell(CellStatusEnum.UNFLAGGED));
    }
}
