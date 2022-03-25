package com.huqingshan.LenMore.repository.mapper.provider;

import org.apache.ibatis.builder.annotation.ProviderContext;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.mapping.MappedStatement;

public class BaseSelectProvider {

    public String findAll(ProviderContext context){
        return new SQL()
                .SELECT()
                .FROM()
                .toString();
    }

    public String findOne(MappedStatement ms){
        return new SQL()
                .SELECT()
                .FROM()
                .WHERE("id = #{id}")
                .toString();
    }
}
