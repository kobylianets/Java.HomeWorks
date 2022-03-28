package com.geekbrains.lesson5;

public class Person {

    private String name;
    private String position;
    private String email;
    private String telNumber;
    private int salary;
    private int age;

    public Person (String name, String position, String email, String telNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telNumber = telNumber;
        this.salary = salary;
        this.age = age;
    }
    public void printInfo() {
        System.out.println("Имя: " + name + "\nдолжность: " + position + "\ne-mail: " + email + "\nномер телефона: " + telNumber + "\nзарплата: " + salary + "\nвозраст: " + age);}

        public int getAge () {
            return age;
        }

    }
