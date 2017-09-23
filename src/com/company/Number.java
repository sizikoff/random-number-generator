package com.company;

public class Number {

    public static void main(String[] args) {
        int a = 0;// Начальное значение диапазона - "от"
        int b = 10;// Конечное значение диапазона - "до"

        int random_number = a + (int) (Math.random() * b); // Генерация
        System.out.println(random_number);
    }
}
