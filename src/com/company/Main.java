package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Box box1 = new Box(randomValue(), randomValue(), randomValue(), "черная",
                "дерево");
        Box box2 = new Box(randomValue(), randomValue(), randomValue(), "белая",
                "пластик");
        Box box3 = new Box(randomValue(), randomValue(), randomValue(), "синяя",
                "картон");
        Box box4 = new Box(randomValue(), randomValue(), randomValue(), "зеленая",
                "текстиль");
        Box box5 = new Box(randomValue(), randomValue(), randomValue(), "красная",
                "металл");

        box1.checkValues();
        box2.checkValues();
        box3.checkValues();
        box4.checkValues();
        box5.checkValues();
    }

    public static int randomValue() {
        Random random = new Random();
        return random.nextInt(-10, 101);
    }
}
