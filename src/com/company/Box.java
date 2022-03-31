package com.company;

public class Box {
    int length;
    int width;
    int height;

    Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    int capacity(int a, int b, int c) {
        return a * b * c;
    }

    void printBox(int a, int b, int c) {
        System.out.printf("Мы создали коробку с длиной %2d см, с шириной %2d см и высотой %2d см. Объем коробки " +
                "составит %7d см^3\n", length, width, height, capacity(length, width, height));
    }
}
