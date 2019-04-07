package example.dirty;

import java.util.ArrayList;
import java.util.List;

/**
 * @description
 * @author lijia
 * @date 2019-04-07 07:36
 */
public class DirtyCode {

    /**
     * 问题：1、theList中的类型 2、下标0  3、魔鬼数字4  4、如何使用返回的列表
     * @param theList param
     * @return List
     */
    public List<int[]> getThem(List<int[]> theList) {
        List<int[]> list1 = new ArrayList<>();
        for (int[] x: theList) {
            if(x[0] == 4) {
                list1.add(x);
            }
        }
        return list1;
    }

}
