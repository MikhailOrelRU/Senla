package com.yazykov.task_6;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmsTest {

    public static void printResult(Packed packed, List<Thing> listThings){
        System.out.println("�� ������ �����:");
        for(Thing t: listThings){
            System.out.println(t);
        }
        System.out.printf("� %s, ����������� ���� c ����� ������������ ��������� - %s �.��.",packed,(Algorithms.maxCost(packed, listThings)));
    }

    public static void main(String[] args) {
        Packed bag = new Packed("������",10);

        Thing ball = new Thing("������", 1, 1);
        Thing bow = new Thing("������", 1, 2);
        Thing Wiskas = new Thing("Wiskas", 1, 3);
        Thing trout = new Thing("������", 4, 8);
        Thing cat = new Thing("������", 5, 100);

        List<Thing> listPred = new ArrayList();
        listPred.add(ball);
        listPred.add(bow);
        listPred.add(Wiskas);
        listPred.add(trout);
        listPred.add(cat);

        printResult(bag, listPred);
    }
}
