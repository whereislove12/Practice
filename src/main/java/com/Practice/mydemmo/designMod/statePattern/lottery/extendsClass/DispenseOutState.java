package com.Practice.mydemmo.designMod.statePattern.lottery.extendsClass;

import com.Practice.mydemmo.designMod.statePattern.lottery.abstractClass.State;
import com.Practice.mydemmo.designMod.statePattern.lottery.context.RaffleActivity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 奖品发放完毕状态
 * 说明，当我们activity 改变成 DispenseOutState， 抽奖活动结束
 *
 * @author Administrator
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DispenseOutState extends State {

    // 初始化时传入活动引用
    private RaffleActivity activity;

    @Override
    public void deductMoney() {
        System.out.println("奖品发送完了，请下次再参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发送完了，请下次再参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发送完了，请下次再参加");
    }
}