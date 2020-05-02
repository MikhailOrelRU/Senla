package com.yazykov.task_6;

public class Thing {
    private String name;
    private int weight;
    private  int cost;

    public Thing(String name, int weight, int cost) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    public int getWeight(){
        return weight;
    }

    public int getCost(){
        return cost;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return name + " weight: " + weight + ", cost: " + cost;
    }
}
