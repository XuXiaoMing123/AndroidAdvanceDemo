package com.xxm.testmodel.pattern.creational.factory.factory3;

import com.xxm.testmodel.pattern.creational.factory.IFactory;

/**
 * Created by xxm on 2019/3/9 0009
 */
public interface IAllFactory {

    IFactory createFactory();

    IFactory2 createFactory2();

}
