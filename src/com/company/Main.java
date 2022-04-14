package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
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

        try {
            ColorBox box1 = new ColorBox(1, 1, 1, Material.OTHER, ColorVariant.BLACK);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        try {
            Warehouse b1 = new Warehouse(2, -1, 1, 3);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Warehouse b2 = new Warehouse(-3, 2, 3, 4);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Warehouse b3 = new Warehouse(3, 2, -3, 4);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Warehouse.addBoxToWarehouse(3);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Warehouse.addBoxToWarehouse(2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Требуется коробок: " + Warehouse.valueWarehouseLeft());

        System.out.println("Колличество произведенных коробок: " + Box.getCounter());

        Stack stack = new StorageBoxes();
        stack.push(new Box(1,1,1));
        stack.push(new Box(1,1,1));
        stack.push(new Box(1,1,1));
        stack.push(new Box(1,1,1));
        stack.push(new Box(1,1,1));
        stack.push(new Box(1,1,1));
        stack.push(new Box(1,1,1));
        stack.push(new Box(1,1,1));
        System.out.println(stack);
    }

    public static int randomValue() {
        Random random = new Random();
        return random.nextInt(-10, 101);
    }


}