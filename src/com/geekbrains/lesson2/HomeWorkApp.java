package com.geekbrains.lesson2;

public class HomeWorkApp {
    public static void main(String[] args) {

        System.out.println(sumFrom10For20(10, 2));

        isNumberNegativeOrPositive(10);

        System.out.println(checkNumber(7));

        stringAndNumber();

        System.out.println(leepYear(1200));


    }

    private static boolean sumFrom10For20(int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20) {
            return true;
        } else {
            return false;
        }
    }

    private static void isNumberNegativeOrPositive(int number) {
        if (number < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }

    }

    private static boolean checkNumber(int d) {
        if (d < 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void stringAndNumber() {
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.print("i");
            }
            System.out.println();
        }

    }

    private static boolean leepYear(int y) {
        y = y + 4;
        if (y % 400 == 0 && y % 100 != 0) {
            return true;
        } else {
            return false;
        } /*вот с этим заданием полная запара
        не понимаю, как может быть високосный год каждый 400-й,
        но при этом каждый 100-ый нет*/
    }
}
