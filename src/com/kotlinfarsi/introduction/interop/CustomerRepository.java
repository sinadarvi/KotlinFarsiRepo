package com.kotlinfarsi.introduction.interop;

import com.kotlinfarsi.introduction.classes.CustomerJava;

import java.util.List;

/**
 * Created by Sina on 8/6/2017.
 */
public interface CustomerRepository {
    CustomerJava getById(int id);
    List<CustomerJava> getAll();
}
