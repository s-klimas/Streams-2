package pl.sebastianklimas;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Exercises_1 e1 = new Exercises_1();
        Exercises_2 e2 = new Exercises_2();


        System.out.println("Exercises group 1");
        System.out.println("Exercise 1:");
        System.out.println(e1.exercise1());

        System.out.println("Exercise 2:");
        System.out.println(e1.exercise2());

        System.out.println("Exercise 3:");
        System.out.println(e1.exercise3());

        System.out.println("Exercise 4:");
        System.out.println(e1.exercise4());

        System.out.println("Exercise 5:");
        System.out.println(e1.exercise5());

        System.out.println("Exercise 6:");
        System.out.println(e1.exercise6());


        System.out.println("Exercises group 2");
        System.out.println("Exercise 1:");
        System.out.println(e2.exercise1(List.of(1, 5, 2, 6, 4, 7, 1, 9)));
        System.out.println("Exercise 2:");
        System.out.println(e2.exercise2(List.of("Ala", "Ma", "Kota"), true));
        System.out.println(e2.exercise2(List.of("Ala", "Ma", "Kota"), false));
        System.out.println("Exercise 3:");
        System.out.println(e2.exercise3(List.of(1, 5, 2, 2, 5, 9, 7, 6, 2, 4, 5, 1, 9), true));
        System.out.println(e2.exercise3(List.of(1, 5, 2, 2, 5, 9, 7, 6, 2, 4, 5, 1, 9), false));
        System.out.println("Exercise 4:");
        System.out.println(e2.exercise4(List.of("Ala", "Ma", "Kota", "A", "Kot", "Ma", "Ale")));
        System.out.println("Exercise 5:");
        System.out.println(e2.exercise5(List.of("Ala", "Ma", "Kota", "A", "Kot", "Ma", "Ale"), 'a'));
        System.out.println("Exercise 6:");
        System.out.println(e2.exercise6(List.of("Ala", "Ma", "Kota", "A", "Kot", "Ma", "Ale"), true));
        System.out.println(e2.exercise6(List.of("Ala", "Ma", "Kota", "A", "Kot", "Ma", "Ale"), false));
        System.out.println("Exercise 7:");
        System.out.println(e2.exercise7(List.of(1, 2, 3, -9, 4, 2, 6, 0, 2, 1, 6, -1, -3, -3, 1, 5), true));
        System.out.println(e2.exercise7(List.of(1, 2, 3, -9, 4, 2, 6, 0, 2, 1, 6, -1, -3, -3, 1, 5), false));
        System.out.println("Exercise 8:");
        System.out.println(e2.exercise8(List.of(1, 3, 6, 3, 1, 2, 6, 1, 0 , 2, 1, 0, 9), true));
        System.out.println(e2.exercise8(List.of(1, 3, 6, 3, 1, 2, 6, 1, 0 , 2, 1, 0, 9), false));
    }
}