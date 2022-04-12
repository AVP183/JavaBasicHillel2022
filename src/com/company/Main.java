package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        try {
            ColorBox colorBox1 = new ColorBox(randomValue(), randomValue(), randomValue(),
                    Material.getMatirial(Material.randomMatirial()), ColorVariant.getColor(ColorVariant.randomColor()));
            System.out.println(colorBox1.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            ColorBox colorBox2 = new ColorBox(randomValue(), randomValue(), randomValue(),
                    Material.getMatirial(Material.randomMatirial()), ColorVariant.getColor(ColorVariant.randomColor()));
            System.out.println(colorBox2.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            ColorBox colorBox3 = new ColorBox(randomValue(), randomValue(), randomValue(),
                    Material.getMatirial(Material.randomMatirial()), ColorVariant.getColor(ColorVariant.randomColor()));
            System.out.println(colorBox3.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            ColorBox colorBox4 = new ColorBox(randomValue(), randomValue(), randomValue(),
                    Material.getMatirial(Material.randomMatirial()), ColorVariant.getColor(ColorVariant.randomColor()));
            System.out.println(colorBox4.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            ColorBox colorBox5 = new ColorBox(randomValue(), randomValue(), randomValue(),
                    Material.getMatirial(Material.randomMatirial()), ColorVariant.getColor(ColorVariant.randomColor()));
            System.out.println(colorBox5.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


//        box1.printCountBoxes();
//        box1.checkOrder();

        try {
            Warehouse b1 = new Warehouse(2,1,1,1);
            System.out.println(Warehouse.printArrayBoxes());
            System.out.println(Warehouse.valueWarehouseLeft());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        Warehouse b2 = new Warehouse(3,2,3,4);
        System.out.println(Warehouse.printArrayBoxes());
        System.out.println(Warehouse.valueWarehouseLeft());
        Warehouse.addBoxToWarehouse(3);
        System.out.println(Warehouse.printArrayBoxes());
        System.out.println(Warehouse.valueWarehouseLeft());

        Warehouse.addBoxToWarehouse(22);
        Warehouse.addBoxToWarehouse(88);
        System.out.println(Warehouse.printArrayBoxes());
        System.out.println(Warehouse.valueWarehouseLeft());

//        System.out.println(Ware

    }

    public static int randomValue() {
        Random random = new Random();
        return random.nextInt(1, 101);
    }


}