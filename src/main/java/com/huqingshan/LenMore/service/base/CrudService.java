package com.huqingshan.LenMore.service.base;

import com.huqingshan.LenMore.model.enums.SortEnum;

import java.util.List;

/**
 * 子接口依然要继承这个接口，否则调用的时候会找不到这些方法
 * 不能仅仅让子接口的实现类来继承抽象类
 *
 * 使用多态时，子类中不能有独立与父类接口的方法，否则父类会调用不到
 *
 * 实现的时候，把公共方法提取到抽象类中，然后子类继承抽象类
 * 重点在于，我们controller为了解耦使用了接口，为了让我们可以使用到提取的公共方法，每个接口都必须要拥有这几种方法的声明，所以必须提取出一个拥有这些方法声明的接口，再由所有接口继承
 * 所以，实现类不仅仅需要实现接口，还需要继承抽象类提供的公共方法，其实，抽象类不必继承公共方法的接口
 */
public interface CrudService<D> {

    int DeleteByPrimaryKey(int key);

    int add(D data);

    List<D> FindAll(SortEnum sortEnum);

    D FindByPrimaryKey(int key);

}
