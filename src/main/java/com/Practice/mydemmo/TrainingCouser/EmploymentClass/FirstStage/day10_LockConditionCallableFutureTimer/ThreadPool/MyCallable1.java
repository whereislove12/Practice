package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day10_LockConditionCallableFutureTimer.ThreadPool;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.Callable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MyCallable1 implements Callable {
    private Integer a;
    private Integer b;

    @Override
    public Integer call() throws Exception {
        return a + b;
    }
}
