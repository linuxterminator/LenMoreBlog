package com.huqingshan.LenMore.repository.mapper.provider;

import org.apache.ibatis.mapping.MappedStatement;

public class BaseInsertProvider {

    public String insert(MappedStatement ms){
        String tableName = "";
        StringBuilder sql = new StringBuilder();
        return sql.toString();
    }
}
