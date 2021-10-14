package com.company;

import java.util.ArrayList;

public class GenericDataStore<T> implements  IGenericDataStore<T>{
    private ArrayList<T> arrayList;
    public GenericDataStore(){
        arrayList = new ArrayList<>();
    }
    @Override
    public T GetObject(int index) {
        return arrayList.get(index);
    }

    @Override
    public void AddObject(T t) {
        arrayList.add(t);
    }

    @Override
    public ArrayList<T> GetAll() {
        return arrayList;
    }
}
