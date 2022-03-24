package com.geekbrains.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeworkApp4 {
    //поле
    public static char[][] map;
    //размер поля
    public static final int SIZE = 3;
    //точек для победы
    public static final int DOTS_TO_WIN = 3;
    // описание точек
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_0 = '0';

    //создаем сканер
    public static final Scanner SCANNER = new Scanner(System.in);

    //создаем рандом для хода компьютера
    public static final Random RANDOM = new Random();

    //инициализировать поле
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            /*for (int j = 0; j < map[i].length; j++) {
                map[i][j] = DOT_EMPTY;*/
            Arrays.fill(map[i], DOT_EMPTY);
        }
    }

    // вывести поле на печать
    public static void printMap() {
        //нумеруем верхний ряд
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // пишем строки мапы
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
    // ход человека
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    // проверка валидны ли введенные значения Х и У
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[y][x] != DOT_EMPTY) {
            return false;
        }
        return true;
    }
    // ход компьюетра
    public static void computerTurn() {
        int x, y;
        do {
            x = RANDOM.nextInt(SIZE);
            y = RANDOM.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер делает ход в " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_0;

    }
    public static boolean checkWin(char symbol) {
        if (checkRowsAndColumns(symbol)) {
            return true;
        } else if (checkDiagonals(symbol)) {
            return true;
        }
        return false;

    }
    // проверка строк и столбцов
    public static boolean checkRowsAndColumns (char symbol) {
        int rowCounter = 0;
        int colCounter = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
               if (map [i][j] == symbol) {
                   rowCounter = rowCounter +1;
               } else rowCounter = 0;
               if (map [j][i] == symbol) {
                   colCounter = colCounter + 1;
               } else colCounter = 0;

               if (rowCounter == DOTS_TO_WIN || colCounter == DOTS_TO_WIN) {
                   return true;
               }
            }
        }
        return false;
    }
    //проверка диагоналей
    public static boolean checkDiagonals (char symbol){
        int mainDiagonal = 0;
        int sideDiagonal = 0;
        for (int i = 0; i < map.length; i++) {
            if (map [i][i] == symbol) {
                mainDiagonal = mainDiagonal + 1;
            } else mainDiagonal = 0;
            if (map [i][map.length - 1 - i] == symbol) {
                sideDiagonal = sideDiagonal + 1;
            }
            if (mainDiagonal == DOTS_TO_WIN || sideDiagonal == DOTS_TO_WIN) {
                return true;
            }
        }
        return false;
    }

    //проверка на ничью (что в поле нет ни одной свободной ячейки)
    public static boolean isMapFull () {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map [i].length; j++) {
                if (map [i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Человек победил!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            computerTurn();
            printMap();
            if (checkWin(DOT_0)) {
                System.out.println("Компьютер победил!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Game over");
    }
}
