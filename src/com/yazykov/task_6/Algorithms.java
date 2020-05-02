package com.yazykov.task_6;

import java.util.List;

public class Algorithms {

    //return max cost from list things in Packed
    public static int maxCost(Packed p, List<Thing> list) {
        int n = list.size();
        int maxSize = p.getCapacity();
        int result[][] = new int[maxSize + 1][n + 1];
        for (int j = 1; j <= n; j++) {
            for (int w = 1; w <= maxSize; w++) {
                if (list.get(j - 1).getWeight() <= w) {
                    result[w][j] = Math.max(result[w][j - 1], result[w - list.get(j - 1).getWeight()][j - 1] + list.get(j - 1).getCost());
                } else {
                    result[w][j] = result[w][j - 1];
                }
            }
        }
        return result[maxSize][n];
    }
}
