package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Box box1 = new Box(randomValue(), randomValue(), randomValue());
        Box box2 = new Box(randomValue(), randomValue(), randomValue());
        Box box3 = new Box(randomValue(), randomValue(), randomValue());
        Box box4 = new Box(randomValue(), randomValue(), randomValue());
        Box box5 = new Box(randomValue(), randomValue(), randomValue());

        box1.printBox(box1.length, box1.width, box1.height);
        box2.printBox(box2.length, box2.width, box2.height);
        box3.printBox(box3.length, box3.width, box3.height);
        box4.printBox(box4.length, box4.width, box4.height);
        box5.printBox(box5.length, box5.width, box5.height);

    }

    public static int randomValue() {
        Random random = new Random();
        return random.nextInt(1, 100);
    }
}
