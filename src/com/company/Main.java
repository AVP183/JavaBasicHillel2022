package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ColorBox colorBox1 = new ColorBox(randomValue(), randomValue(), randomValue(), "дерево",
                ColorVariant.getColor(ColorVariant.randomColor()));

        System.out.println(colorBox1.printBoxColorMaterial());

        ColorBox colorBox2 = new ColorBox(randomValue(), randomValue(), randomValue(), "дерево",
                ColorVariant.getColor(ColorVariant.randomColor()));

        System.out.println(colorBox2.printBoxColorMaterial());

        ColorBox colorBox3 = new ColorBox(randomValue(), randomValue(), randomValue(), "дерево",
                ColorVariant.getColor(ColorVariant.randomColor()));

        System.out.println(colorBox3.printBoxColorMaterial());

        ColorBox colorBox4 = new ColorBox(randomValue(), randomValue(), randomValue(), "дерево",
                ColorVariant.getColor(ColorVariant.randomColor()));

        System.out.println(colorBox4.printBoxColorMaterial());

        ColorBox colorBox5 = new ColorBox(randomValue(), randomValue(), randomValue(), "дерево",
                ColorVariant.getColor(ColorVariant.randomColor()));

        System.out.println(colorBox5.printBoxColorMaterial());


//        box1.printCountBoxes();
//        box1.checkOrder();

    }

    public static int randomValue() {
        Random random = new Random();
        return random.nextInt(1, 101);
    }


}