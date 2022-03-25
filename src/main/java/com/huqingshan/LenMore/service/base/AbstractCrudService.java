package com.huqingshan.LenMore.service.base;

import com.huqingshan.LenMore.model.enums.SortEnum;
import com.huqingshan.LenMore.repository.mapper.CurdRepository;

import java.util.List;

/**
 * 这里提供了对crud接口的一些实现，子类也可以直接继承这个抽象类来直接使用这些方法，也可以继承crud接口来自己实现
 *
 * 在这里实现一个接口是有必要的，对于为什么不直接把方法写到抽象类中给子类继承，如果子类直接继承抽象类的方法
 * 但是再controller中是面对接口的，接口中并没有提供子类方法的声明，所以再controller中无法调用子类的方法，
 * 所以需要把抽象类中的公共方法写成一个接口，子类如果想要使用抽象类的方法，需要同时实现接口和继承抽象类
 *
 * 子类也可以直接使用curdRepository中的方法，不继承
 */
public abstract class AbstractCrudService<D> implements CrudService<D> {

    private final CurdRepository<D> curdRepository;

    public AbstractCrudService(CurdRepository<D> curdRepository){
       this.curdRepository = curdRepository;
    }

    @Override
    public int DeleteByPrimaryKey(int id) {
//        return curdRepository.BasedeleteById(id);
        return 0;
    }

    @Override
    public List<D> FindAll(SortEnum sortEnum) {
        return curdRepository.BasefindAll();
    }

    @Override
    public int add(D data) {
//        return curdRepository.Baseinsert(data);
        return 0;
    }

    @Override
    public D FindByPrimaryKey(int id) {
//        return curdRepository.BasefindById(id);
        return null;
    }
}
