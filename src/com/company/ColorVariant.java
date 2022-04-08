package com.company;

import java.util.Random;

public enum ColorVariant {
    BLACK,
    WHITE,
    BROWM,
    YELLOW,
    BLUE;

    public static ColorVariant getColor(int i) {
        switch (i){
            case 1: return ColorVariant.BLACK;
            case 2: return ColorVariant.WHITE;
            case 3: return ColorVariant.BROWM;
            case 4: return ColorVariant.YELLOW;
            case 5: return ColorVariant.BLUE;
        }
        return ColorVariant.BLACK;
    }

    public static int randomColor() {
        Random random = new Random();
        return random.nextInt(1, 6);
    }
}
