package com.Practice.mydemmo.designMod.statePattern.lottery.extendsClass;

import com.Practice.mydemmo.designMod.statePattern.lottery.abstractClass.State;
import com.Practice.mydemmo.designMod.statePattern.lottery.context.RaffleActivity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 发放奖品的状态
 *
 * @author Administrator
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DispenseState extends State {

    // 初始化时传入活动引用，发放奖品后改变其状态
    private RaffleActivity activity;

    @Override
    public void deductMoney() {
        System.out.println("不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    //发放奖品
    @Override
    public void dispensePrize() {
        if (activity.getCount() > 0) {
            System.out.println("恭喜中奖了");
            // 改变状态为不能抽奖
            activity.setState(activity.getNoRafflleState());
        } else {
            System.out.println("很遗憾，奖品发送完了");
            // 改变状态为奖品发送完毕, 后面我们就不可以抽奖
            activity.setState(activity.getDispensOutState());
            //System.out.println("抽奖活动结束");
            //System.exit(0);
        }

    }
}