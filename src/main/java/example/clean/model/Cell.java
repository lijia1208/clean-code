package example.clean.model;

import example.clean.consts.ConfigConsts;
import example.clean.enums.CellStatusEnum;

import java.util.Objects;

/**
 * @description
 * @author lijia
 * @date 2019-04-07 07:36
 */
public class Cell {

    private Object[] properties;

    /** 编程规约：POJO 类中布尔类型的变量，都不要加 is 前缀，否则部分框架解析会引起序列化错误 */
    private Boolean used;

    public Cell(CellStatusEnum status) {
        this.properties = new Object[]{status};
    }

    public boolean isFlagged() {
        return Objects.equals(CellStatusEnum.FLAGGED, properties[ConfigConsts.STATUS_VALUE]);
    }

    public Object[] getProperties() {
        return properties;
    }

    public void setProperties(Object[] properties) {
        this.properties = properties;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }
}
