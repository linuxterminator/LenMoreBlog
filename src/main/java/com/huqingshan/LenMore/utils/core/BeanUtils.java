package com.huqingshan.LenMore.utils.core;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

import java.util.List;

/**
 * 实体类属性复制
 * 一个方法就可以实现Bean转DTO和DTO转bean
 */
public class BeanUtils {

    public static final MapperFactory mapperFactory;
    public static final MapperFacade mapperFacade;

    static{
        mapperFactory = new DefaultMapperFactory.Builder().build();
        mapperFacade = mapperFactory.getMapperFacade();
    }

    public static <S,D> D map(S sources,Class<D> target){
        return mapperFacade.map(sources,target);
    }

    public static <S,D> List<D> mapAsList(Iterable<S> list,Class<D> target){
        return mapperFacade.mapAsList(list,target);
    }
}
