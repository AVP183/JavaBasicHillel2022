package com.company;

import java.util.Arrays;
import java.util.Random;

public class Warehouse {
    private static int capacityWarehouse = 100;
    private static int counterWarehouse;
    Box[] arrayAllBox;

    public Warehouse(int capacity) {
        Box[] arrayAllBox = new Box[capacity];
        for (int i = 0; i < arrayAllBox.length; i++) {
            counterWarehouse++;
            arrayAllBox[i] = new Box(random(), random(), random());
        }
        for (int i = 0; i < arrayAllBox.length; i++) {
            System.out.println(arrayAllBox[i]);
        }
    }



    public static int valueWarehouseLeft() {
        return capacityWarehouse - counterWarehouse;
    }

    public static int printArrayBoxes() {
        return counterWarehouse;
    }

    public static int random() {
        Random random = new Random();
        return random.nextInt(1, 100);
    }
}
