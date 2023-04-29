package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day7_CollectionsGenericRedBlackTreeSet;

public class GenericInterfaceImpl<T> implements GenericInterface<T> {

    @Override
    public void getString(T t) {
        System.out.println(t.toString());
    }
}
