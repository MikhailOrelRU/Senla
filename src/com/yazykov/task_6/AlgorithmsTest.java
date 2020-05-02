package com.yazykov.task_6;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmsTest {

    public static void printResult(Packed packed, List<Thing> listThings){
        System.out.println("From things list:\n");
        for(Thing t: listThings){
            System.out.println(t);
        }
        System.out.printf("\nin %s, there are things total max cost - %s c.u.\n",packed,(Algorithms.maxCost(packed, listThings)));
    }

    public static void main(String[] args) {
        Packed bag = new Packed("Bag",10);

        Thing ball = new Thing("ball", 1, 1);
        Thing bow = new Thing("bow", 1, 2);
        Thing Wiskas = new Thing("wiskas", 1, 3);
        Thing trout = new Thing("trout", 4, 8);
        Thing cat = new Thing("Murzik", 5, 100);

        List<Thing> listPred = new ArrayList();
        listPred.add(ball);
        listPred.add(bow);
        listPred.add(Wiskas);
        listPred.add(trout);
        listPred.add(cat);

        printResult(bag, listPred);
    }
}
