package com.huqingshan.LenMore.model.enums;

/**
 * 排序枚举
 */
public enum SortEnum {
    ASC("ASC"),
    DESC("DESC");

    private String enumValue;

    public String getValue(){
        return enumValue;
    }

    private SortEnum(String enumValue){
        this.enumValue = enumValue;
    }
}
