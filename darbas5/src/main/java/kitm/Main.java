package kitm;

import java.util.Scanner;

public class Main {

    public static void printNumbers()
    {
        Scanner input = new Scanner(System.in);

        int n;

        System.out.println("Iveskite skaiciu daugiau uz 1:");

        n = input.nextInt();

        int suma = 0;

        for (int i = 1; i <= n; i++)
        {
            System.out.print(i + " ");

            suma += i;
        }

        System.out.println();

        for (int i = n; i >= 1; i--)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.format("visu skaiciu suma: %d", suma);
    }

    public static void main(String[] args) {
        printNumbers();

    }
}