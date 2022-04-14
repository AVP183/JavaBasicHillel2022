package com.company;

public class StorageBoxes implements Stack {
    private Box[] storageOfBox;
    private int top = -1;
    private int capacity;

    public StorageBoxes() {
        this.capacity = 7;
        storageOfBox = new Box[capacity];
    }

    @Override
    public void push(Box value) {
        if (top == capacity - 1){
            System.out.println("Склад полный.");
        } else{
        storageOfBox[++top] = value;}
    }
}
