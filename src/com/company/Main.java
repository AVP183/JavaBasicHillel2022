package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ColorBox colorBox1 = new ColorBox(randomValue(), randomValue(), randomValue(),
                Material.getMatirial(Material.randomMatirial()), ColorVariant.getColor(ColorVariant.randomColor()));

        System.out.println(colorBox1.toString());

        ColorBox colorBox2 = new ColorBox(randomValue(), randomValue(), randomValue(),
                Material.getMatirial(Material.randomMatirial()), ColorVariant.getColor(ColorVariant.randomColor()));

        System.out.println(colorBox2.toString());

        ColorBox colorBox3 = new ColorBox(randomValue(), randomValue(), randomValue(),
                Material.getMatirial(Material.randomMatirial()), ColorVariant.getColor(ColorVariant.randomColor()));

        System.out.println(colorBox3.toString());

        ColorBox colorBox4 = new ColorBox(randomValue(), randomValue(), randomValue(),
                Material.getMatirial(Material.randomMatirial()), ColorVariant.getColor(ColorVariant.randomColor()));

        System.out.println(colorBox4.toString());

        ColorBox colorBox5 = new ColorBox(randomValue(), randomValue(), randomValue(),
                Material.getMatirial(Material.randomMatirial()), ColorVariant.getColor(ColorVariant.randomColor()));

        System.out.println(colorBox5.toString());


//        box1.printCountBoxes();
//        box1.checkOrder();

    }

    public static int randomValue() {
        Random random = new Random();
        return random.nextInt(1, 101);
    }


}