package com.geekbrains.lesson6;

public class AnimalsApp {
    public static void main(String[] args) {
        Animals animals = new Animals("Животные");
        Cat cat = new Cat("Барсик", 100, 2);
        Dog dog = new Dog("Бакс", 500, 50);

        cat.setRun(100);
        cat.setSwim(120);
        dog.setRun(300);
        dog.setSwim(20);


        Animals[] animals1 = {cat, dog};
        int number = 0;
        for (int i = 0; i < animals1.length; i++) {
            number = number + i;
            System.out.println("Количество животных = " + number);
        }


    }
}



