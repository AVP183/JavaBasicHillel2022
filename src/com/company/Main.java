package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

//        Box box1 = new Box(randomValue(), randomValue(), randomValue(), "черная", "дерево");
//        Box box2 = new Box(randomValue(), randomValue(), randomValue(), "белая", "пластик");
//        Box box3 = new Box(randomValue(), randomValue(), randomValue(), "синяя", "картон");
//        Box box4 = new Box(randomValue(), randomValue(), randomValue(), "зеленая", "текстиль");
//        Box box5 = new Box(randomValue(), randomValue(), randomValue(), "красная", "металл");
        Box box1 = new Box();
        box1.setLength(-2);
        box1.setWidth(randomValue());
        box1.setHeight(randomValue());
        box1.setColor("black");
        box1.setMaterial("plastic");


//        box1.printBox(box1.getLength(), box1.getWidth(), box1.getHeight());
//        box2.printBox(box2.getLength(), box2.getWidth(), box2.getHeight());
//        box3.printBox(box3.getLength(), box3.getWidth(), box3.getHeight());
//        box4.printBox(box4.getLength(), box4.getWidth(), box4.getHeight());
//        box5.printBox(box5.getLength(), box5.getWidth(), box5.getHeight());

        System.out.println(box1.printBoxColorMaterial());
//        System.out.println(box2.printBoxColorMaterial());
//        System.out.println(box3.printBoxColorMaterial());
//        System.out.println(box4.printBoxColorMaterial());
//        System.out.println(box5.printBoxColorMaterial());
    }

    public static int randomValue() {
        Random random = new Random();
        return random.nextInt(1, 101);
    }
}
