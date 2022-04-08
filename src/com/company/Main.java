package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ColorBox colorBox = new ColorBox(randomValue(), randomValue(), randomValue(), "дерево", "white");

        System.out.println(colorBox.printColorBox());

//        box1.printCountBoxes();
//        box1.checkOrder();

    }

    public static int randomValue() {
        Random random = new Random();
        return random.nextInt(-10, 101);
    }
}
