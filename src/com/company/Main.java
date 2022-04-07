package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Box box1 = new Box(randomValue(), randomValue(), randomValue(), "дерево");
        Box box2 = new Box(randomValue(), randomValue(), randomValue(), "пластик");
        Box box3 = new Box(randomValue(), randomValue(), randomValue(), "картон");
        Box box4 = new Box(randomValue(), randomValue(), randomValue(), "текстиль");
        Box box5 = new Box(randomValue(), randomValue(), randomValue(), "металл");

        ColorBox colorBox = new ColorBox();

        System.out.println(box1.printBoxColorMaterial());
        System.out.println(box2.printBoxColorMaterial());
        System.out.println(box3.printBoxColorMaterial());
        System.out.println(box4.printBoxColorMaterial());
        System.out.println(box5.printBoxColorMaterial());

        box1.printCountBoxes();
        box1.checkOrder();

    }

    public static int randomValue() {
        Random random = new Random();
        return random.nextInt(-10, 101);
    }
}
