package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day6_CollectionsIteratorArrayList;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * 斗地主
 * 按照斗地主的规则，完成洗牌发牌的动作。
 * 具体规则：
 * 使用54张牌打乱顺序,三个玩家参与游戏，三人交替摸牌，每人17张牌，最后三张留作底牌。
 */
public class LandLords {
    @Test
    public void testDealCard() {
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        ArrayList<String> c = new ArrayList<>();
        dealCard(a, b, c);
    }

    public static void dealCard(List<String> a, List<String> b, List<String> c) {
        //卡牌索引
        List<Integer> aCardIndex = new ArrayList<>();
        List<Integer> bCardIndex = new ArrayList<>();
        List<Integer> cCardIndex = new ArrayList<>();

        //底牌
        List<String> aceCards = new ArrayList<>();

        String numStr = "1,2,3,4,5,6,7,8,9,10,J,Q,K";
        String colorStr = "♠,♥,♦,♣";

        String[] nums = numStr.split(",");
        String[] colors = colorStr.split(",");

        /**
         * 所有扑克牌
         */
        Map<Integer, String> allCards = new HashMap<>();
        allCards.put(0, "大王");
        allCards.put(1, "小王");
        int index = 2;
        for (String num : nums) {
            for (String color : colors) {
                allCards.put(index, color + num);
                index++;
            }
        }

        /**
         * 扑克索引
         */
        Set<Integer> indexSet = allCards.keySet();
        List<Integer> indexList = new ArrayList<>(indexSet);
        Collections.shuffle(indexList);

        for (int i = 0; i <= 50; i++) {
            if (i % 3 == 0) {
                aCardIndex.add(indexList.get(i));
            }
            if (i % 3 == 1) {
                bCardIndex.add(indexList.get(i));
            }
            if (i % 3 == 2) {
                cCardIndex.add(indexList.get(i));
            }
        }

        Collections.sort(aCardIndex);
        Collections.sort(bCardIndex);
        Collections.sort(cCardIndex);

        for (Integer cardIndex : aCardIndex) {
            a.add(allCards.get(cardIndex));
        }
        for (Integer cardIndex : bCardIndex) {
            b.add(allCards.get(cardIndex));
        }
        for (Integer cardIndex : cCardIndex) {
            c.add(allCards.get(cardIndex));
        }
        for (int i = 51; i < 54; i++) {
            aceCards.add(allCards.get(indexList.get(i)));
        }

        System.out.println("玩家一的牌是:" + a.toString());
        System.out.println("玩家二的牌是:" + b.toString());
        System.out.println("玩家三的牌是:" + c.toString());
        System.out.println("底牌是:" + aceCards.toString());
    }
}
