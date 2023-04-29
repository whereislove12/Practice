package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day5_Exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyException extends RuntimeException{
    String msg;

    public MyException(RuntimeException e) {

    }
}
