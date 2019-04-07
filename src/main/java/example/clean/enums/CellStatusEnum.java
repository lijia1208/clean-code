package example.clean.enums;

/**
 * @description
 * @author lijia
 * @date 2019-04-07 07:36
 */
public enum CellStatusEnum {

    // 编程规约：如果变量值仅在一个固定范围内变化用 enum 类型来定义
    UNFLAGGED(3), FLAGGED(4);

    private int seq;
    CellStatusEnum(int seq) {
        this.seq = seq;
    }

}
