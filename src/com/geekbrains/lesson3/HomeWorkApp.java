package com.geekbrains.lesson3;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {
        arr();
        from1to100();
        multiplyingBy2();
        diagonal();
        System.out.println(Arrays.toString(arguments(3, 5)));
        elementsMaxMin();
        checkBalance();

    }

    private static void arr() {
        int[] nums = {0, 1, 1, 0, 0, 0, 1, 1, 0};
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (a == 0) {
                a++;
                System.out.print(a + " ");
            } else if (a == 1) {
                a--;
                System.out.print(a + " ");
            }
        }
    }

    private static void from1to100() {
        int[] numbers = new int[100];
        for (int i = 0; i <= numbers.length; i++) {
            System.out.println(i);
        }
    }

    private static void multiplyingBy2() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            int data = array[i];
            if (data < 6) {
                data *= 2;
                System.out.print(data + " ");
            } else {
                System.out.print(data + " ");
            }
        }
        System.out.println();
    }

    private static void diagonal() {
        int[][] arr = new int[3][];
        arr[0] = new int[]{0, 0, 0};
        arr[1] = new int[]{0, 0, 0};
        arr[2] = new int[]{0, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            int[] innerArr = arr[i];
            for (int j = 0; j < innerArr.length; j++) {
                if (i == j) {
                    innerArr[j] = 1;
                } else innerArr[j] = 0;
                System.out.print(innerArr[j]);
            }
            System.out.println();
        }
    }

    private static int[] arguments(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;

    }

    private static void elementsMaxMin() { // не понимаю, как вообще подойти к решению
        int[] elements = {10, 2, 11, 8, 20};
        for (int i = 0; i < elements.length; i++) {
            int max = elements[i];
            int min = elements[i];
            if (max > elements [i]) {
                System.out.println("max i =" + max);
            } else {
                System.out.println("min i =" + min);
            }
        }
    }

    private static void checkBalance() { // все варианты, которые приходили в голову, перебрала, но не работает
        int[] balance = {20, 30, 40, 10}; // boolean пока опустила, через void все же легче пробовать)
        int sum = 0;
        int sumA = 0;
        for (int x : balance) sum += x;
        for (int i = 0; i < balance.length; i++) {
            sumA += balance[i];
            if (sumA == sum / 2) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

        }
    }
}














