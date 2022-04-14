package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Stack stack = new StorageBoxes();
        int k = 0;

        while (k < 6) {
            try {
                stack.push(new Box(randomValue(), randomValue(), randomValue()));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            k++;
        }

        while (k < 12) {
            try {
                stack.push(new Box(randomValue(), randomValue(), randomValue(), Material.OTHER));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            k++;
        }

        while (k < 18) {
            try {
                stack.push(new ColorBox(randomValue(), randomValue(), randomValue(), Material.PLASTIC,
                        ColorVariant.BLUE));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            k++;
        }

        System.out.println(stack.toString());
    }

    public static int randomValue() {
        Random random = new Random();
        return random.nextInt(-10, 101);
    }


}