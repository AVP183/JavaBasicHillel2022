package com.company;

import java.util.Random;

public class Warehouse {
    private static final int capacityWarehouse = 20;
    private static int counterWarehouse;
    private static int resaulrHowManyBoxes;
    private int capacity;
    private static Box[] arrayAllBox = new Box[capacityWarehouse];
    private int length;
    private int width;
    private int height;
    private Box BoxNet;
    private static Box countBox;

    public Warehouse(int length, int width, int height, int capacity) {
            if (length <= 0 || width <= 0 || height <= 0) {
                throw new IllegalArgumentException("Ошибка: Проверьте вводимые параметры Д х Ш х В");
            }
        if (counterWarehouse < capacityWarehouse) {
            for (int i = 0; i < capacity; i++) {
                counterWarehouse++;
                arrayAllBox[i] = new Box(length, width, height, Material.OTHER, ColorVariant.BLUE);
                System.out.println(arrayAllBox[i]);
                if (counterWarehouse == capacityWarehouse) {
                    break;
                }
            }
        } else {
            System.out.println("Заказ на производство коробок выполнен!");
        }
    }

    public static void addBoxToWarehouse(int capacity) {
        if (counterWarehouse < capacityWarehouse) {
            for (int i = 0; i < capacity; i++) {
                counterWarehouse++;
                arrayAllBox[i] = new Box(random(), random(), random(), Material.OTHER, ColorVariant.BLUE);
                System.out.println(arrayAllBox[i]);
                if (counterWarehouse == capacityWarehouse) {
                    break;
                }
            }
        } else {
            System.out.println("Заказ на производство коробок выполнен!");
        }
    }


    public static int howManyBoxes(){
        int resaulrHowManyBoxes = countBox.getCounter() + counterWarehouse;
        return resaulrHowManyBoxes;
    }

    public static int valueWarehouseLeft() {

        return capacityWarehouse - resaulrHowManyBoxes;
    }

    public static int printArrayBoxes() {
        return counterWarehouse;
    }

    public static int random() {
        Random random = new Random();
        return random.nextInt(1, 100);
    }

}
