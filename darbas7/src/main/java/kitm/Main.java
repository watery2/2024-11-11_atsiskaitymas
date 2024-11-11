package kitm;

import java.util.Scanner;

public class Main {

    public static int calculate(int a, int b, boolean add)
    {
        if (add)
        {
            return a + b;
        }

        return a - b;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Iveskite a skaiciu: ");

        a = input.nextInt();

        System.out.println("Iveskite b skaiciu: ");

        b = input.nextInt();

        System.out.format("Rezultatas: %d", calculate(a, b, false));

    }
}