package com.company;

import java.awt.Color;

public class ColorBox extends Box {
    private String color;

    public ColorBox(int length, int width, int height, String material, String color) {
        super(length, width, height, material);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String printColorBox() {
        return String.format("Мы создали коробку с длиной %3d см, с шириной %3d см и высотой %3d см. Объем коробки " +
                        "составит %6d см^3, материал: %8s, цвет: %s",
                super.getLength(), super.getWidth(), super.getHeight(), capacity(super.getLength(), super.getWidth(),
                        super.getHeight()), super.getMaterial(), color);
    }

}
