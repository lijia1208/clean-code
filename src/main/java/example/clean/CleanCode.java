package example.clean;


import example.clean.model.Cell;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description
 * @author lijia
 * @date 2019-04-07 07:36
 */
public class CleanCode {

    private static final int STATUS_VALUE = 0;
    private static final int FLAGGED = 4;

    /***
     * 优化版本1
     * 扫雷游戏  int[] 表示一个单元格  0下标是状态值 未标记 已标记
     * @param gameBoard
     * @return
     */
    public List<int[]> getFlaggedCellsDemo1(List<int[]> gameBoard) {
        List<int[]> flaggedCells = new ArrayList<>();
        for (int[] cell : gameBoard) {
            if (cell[STATUS_VALUE] == FLAGGED) {
                flaggedCells.add(cell);
            }
        }

        return flaggedCells;
    }

    /***
     * 优化版本2
     * 用Cell表示单元格  将flagged判断抽取为函数
     * @param gameBoard
     * @return
     */
    public List<Cell> getFlaggedCellsDemo2(List<Cell> gameBoard) {
        List<Cell> flaggedCells = new ArrayList<>();
        for (Cell cell : gameBoard) {
            if (cell.isFlagged()) {
                flaggedCells.add(cell);
            }
        }
        return flaggedCells;
    }

    /***
     * 优化版本3
     * 用java8 流操作
     * 用Cell表示单元格  将flagged判断抽取为函数
     * @param gameBoard
     * @return
     */
    public List<Cell> getFlaggedCellsDemo3(List<Cell> gameBoard) {
        return gameBoard.stream().filter(cell->cell.isFlagged()).collect(Collectors.toList());
    }


}
