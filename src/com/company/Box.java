package com.company;

public class Box{
    private int length;
    private int width;
    private int height;
    private Material material;
    private static int counter = 0;
    private static int countErrors = 0;

    public Box(int length, int width, int height, Material other, ColorVariant blue) {
        counter++;
        if (length <= 0 || width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Ошибка: Проверьте вводимые параметры Д х Ш х В");
        }
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(int length, int width, int height, Material material) {
        this(length, width, height, Material.OTHER, ColorVariant.BLUE);
        this.material = material;
    }

    public Box(int length, int width, int height) {
        this(length, width, height, Material.OTHER, ColorVariant.BLUE);
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void checkSetLength(int length) {
        if (length > 0) {
            setLength(length);
        } else {
            countErrors++;
            printSetLengthError();
        }
    }

    public void printSetLengthError() {
        System.out.println("\nОшибка: Коробка номер " + counter + ": глубина коробки введена меньше 1 см");
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void checkSetWidth(int width) {
        if (width <= 0) {
            countErrors++;
            printSetWidthError();
        } else {
            setWidth(width);
        }
    }

    public void printSetWidthError() {
        System.out.println("Ошибка: Коробка номер " + counter + ": ширина коробки введена меньше 1 см");
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void checkSetHeight(int height) {
        if (height <= 0) {
            countErrors++;
            printSetHeightError();
        } else {
            setHeight(height);
        }
    }

    public void printSetHeightError() {
        System.out.println("Ошибка: Коробка номер " + counter + ": высота коробки введена меньше 1 см");
    }

    public int getHeight() {
        return height;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }

    public static int getCounter() {
        return counter;
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
                        "составит %6d см^3, материал: %8s",
                length, width, height, capacity(length, width, height), material);
    }

    public void checkValues() {
        if (length <= 0 || width <= 0 || height <= 0) {
            System.out.println("Коробка не может быть создана\n");
        } else {
            System.out.println(printBoxColorMaterial());
        }
    }

    public void printCountBoxes() {
        System.out.println("\nВсего заказов на произведство коробок: " + counter + "\n");
    }

    public void checkOrder() {
        int resault = counter - countErrors;
        if ((resault % 10) == 1) {
            System.out.println("Произведена " + resault + " коробока");
        } else {
            System.out.println("Произведено " + resault + " коробоки");
        }
    }

    @Override
    public String toString() {
        StringBuilder resault = new StringBuilder();
        if (material == null){
            resault.append("Длина коробки = ").append(length)
                    .append(" см, ширина коробки = ").append(width)
                    .append(" см, высота коробки = ").append(height);
        }
        else{
        resault.append("Длина коробки = ").append(length)
                .append(" см, ширина коробки = ").append(width)
                .append(" см, высота коробки = ").append(height)
                .append(" см, материал коробки: ").append(material);}
        return resault.toString();
    }
}
