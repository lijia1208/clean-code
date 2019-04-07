package example.dirty;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DirtyCodeTest {

    List<int[]> gameBoard = new ArrayList<>();
    DirtyCode dirtyCode = new DirtyCode();
    @Before
    public void setUp() throws Exception {

        gameBoard.add(new int[]{1});
        gameBoard.add(new int[]{2});
        gameBoard.add(new int[]{3});
        gameBoard.add(new int[]{4});
    }

    @Test
    public void getThem() {
        Assert.assertTrue(dirtyCode.getThem(gameBoard).size() == 1);
    }
}