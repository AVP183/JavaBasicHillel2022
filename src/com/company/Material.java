package com.company;

import java.util.Random;

public enum Material {
    WOOD,
    PLASTIC,
    STEEL,
    TEXTILE,
    OTHER;

    public static Material getMatirial(int i) {
        switch (i){
            case 1: return Material.WOOD;
            case 2: return Material.PLASTIC;
            case 3: return Material.STEEL;
            case 4: return Material.TEXTILE;
            case 5: return Material.OTHER;
        }
        return Material.OTHER;
    }

    public static int randomMatirial() {
        Random random = new Random();
        return random.nextInt(1, 6);
    }

}
