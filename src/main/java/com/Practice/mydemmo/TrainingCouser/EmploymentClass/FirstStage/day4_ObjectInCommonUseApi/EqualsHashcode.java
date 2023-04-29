package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day4_ObjectInCommonUseApi;

import java.util.Objects;

public class EqualsHashcode {
    private String name;
    private Integer num;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EqualsHashcode that)) return false;
        return Objects.equals(name, that.name) && Objects.equals(num, that.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, num);
    }

    @Override
    public String toString() {
        return "EqualsHashcode{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}
