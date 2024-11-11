package kitm;

import java.util.Scanner;

public class Main {

    public static void logicalOperations(int sk1, int sk2)
    {

        System.out.format("Abu lyginiai: %b", (sk1 % 2 == 0 && sk2 % 2 == 0));

        System.out.println();

        System.out.format("Bent vienas teigiamas: %b", (sk1 > 0 || sk2 > 0));

        System.out.println();

        System.out.format("Ar pirmas skaicius yra didesnis uz antra ir abu dalomi is 5: %b", (sk1 > sk2 && sk1 % 5 == 0 && sk2 % 5 == 0));

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sk1;
        int sk2;

        System.out.println("Iveskite pirma skaiciu");

        sk1 = input.nextInt();

        System.out.println("Iveskite antra skaiciu");

        sk2 = input.nextInt();

        logicalOperations(sk1, sk2);

    }
}