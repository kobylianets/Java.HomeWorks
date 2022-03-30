package com.geekbrains.lesson6;

public class Cat extends Animals {
    int run;
    int swim;

    public Cat(String name, int run, int swim) {
        super(name);
        this.run = run;
        this.swim = swim;
        System.out.println("Кот " + name + " пробегает " + run + "м" + " и проплывает " + swim + "м");
    }

    public int getRun() { return run;}

    public void setRun(int run) {
        if (run <= 200 && run > 0) {
            this.run = run;
        } else {
            System.out.println("Кот столько не пробежит");
        }
        this.run = run; }

    public int getSwim() { return swim;}

    public void setSwim(int swim) {
        if (run == 0) {
            this.run = run;
        } else {
            System.out.println("Кот не плавает");
        }
        this.swim = swim;
    }
    }




