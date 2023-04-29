package com.Practice.mydemmo.designMod.statePattern.lottery.context;

import com.Practice.mydemmo.designMod.statePattern.lottery.abstractClass.State;
import com.Practice.mydemmo.designMod.statePattern.lottery.extendsClass.CanRaffleState;
import com.Practice.mydemmo.designMod.statePattern.lottery.extendsClass.DispenseOutState;
import com.Practice.mydemmo.designMod.statePattern.lottery.extendsClass.DispenseState;
import com.Practice.mydemmo.designMod.statePattern.lottery.extendsClass.NoRaffleState;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 抽奖活动 //
 *
 * @author Administrator
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RaffleActivity {

    // state 表示活动当前的状态，是变化
    private State state = null;
    // 奖品数量
    private int count = 0;

    // 四个属性，表示四种状态
    private State noRafflleState = new NoRaffleState(this);
    private State canRaffleState = new CanRaffleState(this);
    private State dispenseState = new DispenseState(this);
    private State dispensOutState = new DispenseOutState(this);

    //构造器
    //1. 初始化当前的状态为 noRafflleState（即不能抽奖的状态）
    //2. 初始化奖品的数量
    public RaffleActivity(int count) {
        this.state = getNoRafflleState();
        this.count = count;
    }

    //扣分, 调用当前状态的 deductMoney
    public void debuctMoney() {
        state.deductMoney();
    }

    //抽奖
    public void raffle() {
        // 如果当前的状态是抽奖成功
        if (state.raffle()) {
            //领取奖品
            state.dispensePrize();
        }

    }

    //这里请大家注意，每领取一次奖品，count--
    public int getCount() {
        int curCount = count;
        count--;
        return curCount;
    }

}