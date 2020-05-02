package com.yazykov.task_6;

public class Packed {
    private String namePacked;
    private int capacity;

    public Packed(String namePacked, int capacity){
        this.namePacked = namePacked;
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }

    public String getNamePacked(){
        return  namePacked;
    }


    @Override
    public String toString(){
        return namePacked + " capacity - " + capacity + " c.u.";
    }
}
