package com.yazykov.task_6;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmsTest {

    public static void printResult(Packed packed, List<Thing> listThings){
        System.out.println("Из списка вещей:");
        for(Thing t: listThings){
            System.out.println(t);
        }
        System.out.printf("в %s, поместились вещи c общей максимальной ценностью - %s у.ед.",packed,(Algorithms.maxCost(packed, listThings)));
    }

    public static void main(String[] args) {
        Packed bag = new Packed("Рюкзак",10);

        Thing ball = new Thing("Клубок", 1, 1);
        Thing bow = new Thing("Бантик", 1, 2);
        Thing Wiskas = new Thing("Wiskas", 1, 3);
        Thing trout = new Thing("Форель", 4, 8);
        Thing cat = new Thing("Мурзик", 5, 100);

        List<Thing> listPred = new ArrayList();
        listPred.add(ball);
        listPred.add(bow);
        listPred.add(Wiskas);
        listPred.add(trout);
        listPred.add(cat);

        printResult(bag, listPred);
    }
}
