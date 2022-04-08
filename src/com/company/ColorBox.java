package com.company;

import java.util.Random;

public class ColorBox extends Box {
    private ColorVariant color;

    public ColorBox(int length, int width, int height, Material material, ColorVariant color) {
        super(length, width, height, material);
        this.color = color;
    }

    public void setColor(ColorVariant color) {
        this.color = color;
    }

    public String printBoxColorMaterial() {
        return String.format("Мы создали коробку с длиной %3d см, с шириной %3d см и высотой %3d см. Объем коробки " +
                        "составит %6d см^3, материал: %8s, color: %s",
                super.getLength(), super.getWidth(), super.getHeight(), capacity(super.getLength(), super.getWidth(),
                        super.getHeight()), getMaterial(), color);
    }


}
