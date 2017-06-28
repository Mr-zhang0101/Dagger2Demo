package com.zhang.mymvp.injector.modules;

import com.zhang.mymvp.model.Person;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Project: MyMvp
 * Author:  张佳林
 * Version:  1.0
 * Date:    2017/6/27
 * Modify:  //TODO
 * Description: //TODO
 * Copyright notice:
 */

@Module
public class PersonModule {
    @Provides
    @Singleton
    Person providePerson() {
        return new Person();
    }
}
