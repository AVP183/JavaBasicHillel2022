package com.company;

import java.util.Random;

public class Warehouse {
    private static final int capacityWarehouse = 30;
    private static int counterWarehouse;
    private static int res;
    private int capacity;
    private static Box[] arrayAllBox;
    private int length;
    private int width;
    private int height;
    private static Box countBox;

    public Warehouse(int length, int width, int height, int capacity) {
        this.countBox = new Box();
            if (length <= 0 || width <= 0 || height <= 0) {
                throw new IllegalArgumentException("Ошибка: Проверьте вводимые параметры Д х Ш х В");
            }
        arrayAllBox = new Box[capacity];
        if (counterWarehouse < capacityWarehouse) {
            for (int i = 0; i < capacity; i++) {
                counterWarehouse++;
                arrayAllBox[i] = new Box(length, width, height);
                System.out.println(arrayAllBox[i]);
                if (counterWarehouse == capacityWarehouse) {
                    break;
                }
            }
        } else {
            System.out.println("Склад заполнен!");
        }
    }

    public static void addBoxToWarehouse(int capacity) {
        arrayAllBox = new Box[capacity];
        if (counterWarehouse < capacityWarehouse) {
            for (int i = 0; i < capacity; i++) {
                counterWarehouse++;
                arrayAllBox[i] = new Box(random(), random(), random());
                System.out.println(arrayAllBox[i]);
                if (counterWarehouse == capacityWarehouse) {
                    break;
                }
            }
        } else {
            System.out.println("Склад заполнен!");
        }
    }

    public static int ghghj(){
        int res = countBox.getCounter() + counterWarehouse;
        return res;
    }

    public static int valueWarehouseLeft() {
        return capacityWarehouse - res;
    }

    public static int printArrayBoxes() {
        return counterWarehouse;
    }

    public static int random() {
        Random random = new Random();
        return random.nextInt(1, 100);
    }


//    @Override
    public String toString(){
        StringBuilder resault = new StringBuilder();
        resault.append("Длина коробки = ").append(length)
                .append(" см, ширина коробки = ").append(width)
                .append(" см, высота коробки = ").append(height);
        return resault.toString();
    }
}
