package example.clean.model;

import example.clean.enums.CellStatusEnum;
import org.junit.Assert;
import org.junit.Test;

public class CellTest {

    @Test
    public void isFlagged() {
        Cell cell = new Cell(CellStatusEnum.FLAGGED);
        Assert.assertTrue(cell.isFlagged());

    }

    @Test
    public void isUnFlagged() {
        Cell cell = new Cell(CellStatusEnum.UNFLAGGED);
        Assert.assertFalse(cell.isFlagged());

    }
}
