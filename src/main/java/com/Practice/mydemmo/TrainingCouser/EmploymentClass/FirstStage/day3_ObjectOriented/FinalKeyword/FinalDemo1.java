package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day3_ObjectOriented.FinalKeyword;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
//force：可以将所有 final 字段初始化为 0、null、false。默认为 false
@NoArgsConstructor(force = true)
public class FinalDemo1 {
    public final int a;
}
