package com.company;

import java.util.Arrays;

public class StorageBoxes implements Stack {
    private Box[] storageOfBox;
    private int top = -1;
    private int capacity;

    public StorageBoxes() {
        this.capacity = 15;
        storageOfBox = new Box[capacity];
    }

    @Override
    public void push(Box value) {
        if (top + 1 >= capacity){
            System.out.println("Склад полный.");
        } else{
        storageOfBox[++top] = value;}
    }

    @Override
    public String toString() {
        StringBuilder resault = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            resault.append(storageOfBox[i]).append("\n");
        }
        return resault.toString();

    }
}
