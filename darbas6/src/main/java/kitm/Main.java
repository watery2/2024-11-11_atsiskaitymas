package kitm;

import java.util.Scanner;

public class Main {

    public static void calculateFactorial()
    {
        Scanner input = new Scanner(System.in);

        int n;

        System.out.println("Iveskite Teigiama skaiciu");

        n = input.nextInt();

        int faktorialas = 1;

        int sk = n;

        for (int i = 0; i < n; i++)
        {
            faktorialas *= sk;
            sk--;
        }

        System.out.println("Faktorialas(" + n + "!)" + " = " + faktorialas);
    }

    public static void main(String[] args) {
        calculateFactorial();
    }
}