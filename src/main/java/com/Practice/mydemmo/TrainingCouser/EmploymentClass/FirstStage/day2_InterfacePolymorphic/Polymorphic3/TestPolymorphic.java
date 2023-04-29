package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day2_InterfacePolymorphic.Polymorphic3;


import com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day2_InterfacePolymorphic.Polymorphic3.Abstract.Athletes;
import com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day2_InterfacePolymorphic.Polymorphic3.Abstract.Coach;
import org.junit.jupiter.api.Test;

public class TestPolymorphic {
    @Test
    public void test1() {
        Coach pingpangCoach = new PingPangCoach();
        pingpangCoach.setName("乒乓一号");
        pingpangCoach.setAge(50);
        pingpangCoach.trainStudent();
        pingpangCoach.eat();
        ((PingPangCoach) pingpangCoach).studyEnglish();
    }

    @Test
    public void test2() {
        Coach footballCoach = new FootballCoach();
        footballCoach.setName("香港脚一号");
        footballCoach.setAge(65);
        footballCoach.trainStudent();
        footballCoach.eat();
    }

    @Test
    public void test3() {
        Athletes pingpangAthletes = new PingPangAthletes();
        pingpangAthletes.setName("乒乓小将");
        pingpangAthletes.setAge(18);
        pingpangAthletes.eat();
        pingpangAthletes.runPrizes();
        ((PingPangAthletes) pingpangAthletes).studyEnglish();
    }

    @Test
    public void test4() {
        Athletes footballAthletes = new FootBallAthletes();
        footballAthletes.setName("香港脚小将");
        footballAthletes.setAge(38);
        footballAthletes.eat();
        footballAthletes.runPrizes();
    }
}
