package com.huqingshan.LenMore.config.converter;

import com.huqingshan.LenMore.model.enums.SortEnum;
import org.springframework.core.convert.converter.Converter;

/**
 * 排序枚举类型转换
 */
public class EnumConverter implements Converter<String, SortEnum> {

    @Override
    public SortEnum convert(String string) {
        return SortEnum.valueOf(string.toUpperCase());
    }

}
