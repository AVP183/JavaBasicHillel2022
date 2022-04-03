package com.company;

public class Box {
    private int length;
    private int width;
    private int height;
    private String color;
    private String material;

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(int length, int width, int height, String color, String material) {
        this(length, width, height);
        this.color = color;
        this.material = material;
    }

    public Box() {
        
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        }
        System.out.println("Коробка не может быть создана с размерами меньше 1 см");
            return;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public int capacity(int a, int b, int c) {
        return a * b * c;
    }

    public void printBox(int a, int b, int c) {
        System.out.printf("Мы создали коробку с длиной %3d см, с шириной %3d см и высотой %3d см. Объем коробки " +
                "составит %6d см^3\n", length, width, height, capacity(length, width, height));
    }

    public String printBoxColorMaterial() {
        return String.format("Мы создали коробку с длиной %3d см, с шириной %3d см и высотой %3d см. Объем коробки " +
                        "составит %6d см^3, цвет коробки: %7s, материал: %8s",
                length, width, height, capacity(length, width, height), color, material);
    }
}
