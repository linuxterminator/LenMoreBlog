package com.huqingshan.LenMore.repository.mapper;

import com.huqingshan.LenMore.repository.mapper.provider.BaseDeleteProvider;
import com.huqingshan.LenMore.repository.mapper.provider.BaseInsertProvider;
import com.huqingshan.LenMore.repository.mapper.provider.BaseSelectProvider;
import com.huqingshan.LenMore.repository.mapper.provider.BaseUpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

/**
 * 基础curd接口
 *
 * dao中的接口需要继承该接口方可使用这些方法
 */
public interface CurdRepository<D> {

   @SelectProvider(type = BaseSelectProvider.class,method = "findAll")
   List<D> BasefindAll();

   @SelectProvider(type = BaseUpdateProvider.class,method = "update")
   D Baseupdate(int id);

   @InsertProvider(type = BaseInsertProvider.class,method="insert")
   int Baseinsert(D obj);

   @DeleteProvider(type = BaseDeleteProvider.class,method = "deleteOne")
   int BasedeleteById(int id);

   @SelectProvider(type = BaseSelectProvider.class,method = "findOne")
   D BasefindById(int id);
}
