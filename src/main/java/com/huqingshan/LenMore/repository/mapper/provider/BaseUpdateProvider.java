package com.huqingshan.LenMore.repository.mapper.provider;

import org.apache.ibatis.mapping.MappedStatement;

public class BaseUpdateProvider {

    public String update(MappedStatement ms){
        StringBuilder sql = new StringBuilder();
        return sql.toString();
    }
}
