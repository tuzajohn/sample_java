package com.company;

import java.util.ArrayList;

public interface IGenericDataStore<T> {
    T GetObject(int index);
    void AddObject(T t);
    ArrayList<T> GetAll();
}
