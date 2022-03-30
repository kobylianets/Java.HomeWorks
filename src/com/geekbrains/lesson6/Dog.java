package com.geekbrains.lesson6;

public class Dog extends Animals {
    int run;
    int swim;

    public Dog(String name, int run, int swim) {
        super(name);
        this.run = run;
        this.swim = swim;
        System.out.println("Пес " + name + " пробегает " + run + "м" + " и проплывает " + swim + "м");

    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        if (run <= 500 && run > 0) {
            this.run = run;
        } else {
            System.out.println("Пес столько не пробежит");
        }
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        if (run <= 10 && run > 0) {
            this.run = run;
        } else {
            System.out.println("Пес столько не проплывет");
        }
    }
}