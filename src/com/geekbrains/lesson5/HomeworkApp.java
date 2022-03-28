package com.geekbrains.lesson5;

public class HomeworkApp {
    public static void main(String[] args) {

        Person[] persons = new Person[5];
        persons [0] = new Person("Иванов Иван", "Инженер", "skdnfjf@gmail.com", "3345276", 2000, 28);
        persons [1] = new Person("Петр Петров", "Инженер", "shgh@gmail.com", "4746483", 3000, 49);
        persons [2] = new Person("Федор Федоров", "Инженер", "eihfo@gmail.com", "3339484", 2000, 34);
        persons [3] = new Person("Егоро Егоров", "Инженер", "spskpx@gmail.com", "3464843", 5000, 52);
        persons [4] = new Person("Илья Ильин", "Инженер", "lkjnfles@gmail.com", "8464739", 4000, 47);

        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getAge() > 40) {
                persons[i].printInfo();
            }
            System.out.println();

        }

    }
}
