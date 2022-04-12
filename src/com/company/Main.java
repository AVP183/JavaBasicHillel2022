package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


//        try {
//            ColorBox colorBox1 = new ColorBox(randomValue(), randomValue(), randomValue(),
//                    Material.getMatirial(Material.randomMatirial()), ColorVariant.getColor(ColorVariant.randomColor()));
//            System.out.println(colorBox1.toString());
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try {
//            ColorBox colorBox2 = new ColorBox(randomValue(), randomValue(), randomValue(),
//                    Material.getMatirial(Material.randomMatirial()), ColorVariant.getColor(ColorVariant.randomColor()));
//            System.out.println(colorBox2.toString());
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }

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

        try {
            ColorBox box1 = new ColorBox(1, 1, 1, Material.OTHER, ColorVariant.BLACK);
            box1.printCountBoxes();
            System.out.println(box1.printBoxColorMaterial());
            System.out.println(box1.getCounter());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        try {
            Warehouse b1 = new Warehouse(2, 1, 1, 3);
            System.out.println(Warehouse.printArrayBoxes());
            System.out.println(Warehouse.valueWarehouseLeft());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Warehouse b2 = new Warehouse(3, 2, 3, 4);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

//        Warehouse b21 = new Warehouse(3, 2, 3, 4);

        try {
            Warehouse.addBoxToWarehouse(3);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

//        Warehouse.addBoxToWarehouse(22);

        System.out.println("Свободных мест на складе: " + Warehouse.valueWarehouseLeft());

        System.out.println("Колличество готовых коробок на складе: " + Box.getCounter());

    }

    public static int randomValue() {
        Random random = new Random();
        return random.nextInt(1, 101);
    }


}