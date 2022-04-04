package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Box box1 = new Box();

        box1.checkSetLength(2);
        box1.checkSetWidth(2);
        box1.checkSetHeight(4);
        box1.setColor("Белая");
        box1.setMaterial("Дерево");
        box1.checkValues();

        Box box2 = new Box();

        box2.checkSetLength(-2);
        box2.checkSetWidth(2);
        box2.checkSetHeight(4);
        box2.setColor("Белая");
        box2.setMaterial("Дерево");
        box2.checkValues();

        Box box3 = new Box();
        box3.checkSetLength(2);
        box3.checkSetWidth(-2);
        box3.checkSetHeight(4);
        box3.setColor("Белая");
        box3.setMaterial("Дерево");
        box3.checkValues();

        Box box4 = new Box();
        box4.checkSetLength(2);
        box4.checkSetWidth(2);
        box4.checkSetHeight(-4);
        box4.setColor("Белая");
        box4.setMaterial("Дерево");
        box4.checkValues();

        Box box5 = new Box();
        box5.checkSetLength(12);
        box5.checkSetWidth(21);
        box5.checkSetHeight(14);
        box5.setColor("Белая");
        box5.setMaterial("Дерево");
        box5.checkValues();

//        Box box1 = new Box(randomValue(), randomValue(), randomValue(), "черная",
//                "дерево");
//        Box box2 = new Box(randomValue(), randomValue(), randomValue(), "белая",
//                "пластик");
//        Box box3 = new Box(randomValue(), randomValue(), randomValue(), "синяя",
//                "картон");
//        Box box4 = new Box(randomValue(), randomValue(), randomValue(), "зеленая",
//                "текстиль");
//        Box box5 = new Box(randomValue(), randomValue(), randomValue(), "красная",
//                "металл");

        box1.printCountBoxes();
        box1.checkOrder();

    }

    public static int randomValue() {
        Random random = new Random();
        return random.nextInt(-10, 101);
    }
}
