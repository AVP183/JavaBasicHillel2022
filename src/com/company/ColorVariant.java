package com.company;

public enum ColorVariant {
    BLACK("Черный"),
    WHITE("Белый");

    private String value;

    ColorVariant(String value){
        this.value = value;
    }

    public void setValue(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

    public static ColorVariant getColor(int i) {
        switch (i){
            case 1: return ColorVariant.BLACK;
            case 2: return ColorVariant.WHITE;
        }
        return ColorVariant.BLACK;
    }


}
