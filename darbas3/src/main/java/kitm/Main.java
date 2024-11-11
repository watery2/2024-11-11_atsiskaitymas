package kitm;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void arrayOperations()
    {

        Scanner input = new Scanner(System.in);

        int[] masyvas = new int[5];

        float suma = 0;

        for (int i = 0; i < 5; i++)
        {
            System.out.println("Iveskite " + (i+1) + " Skaiciu: ");

            masyvas[i] = input.nextInt();

            suma += masyvas[i];
        }

        Arrays.sort(masyvas);

        input.nextLine();

        System.out.println("Iveskite skaiciu kuri norite Surasti: ");

        int sk;

        sk = input.nextInt();

        if(Arrays.binarySearch(masyvas, sk) > -1)
        {
            System.out.println("Jusu skaicius yra " + (Arrays.binarySearch(masyvas, sk) + 1) + " vietoje");
        }
        else
        {
            System.out.println("Tokio skaiciaus nera");
        }

        float vidurkis = suma / 5;

        System.out.format("Didziausias: %d ", masyvas[4]);

        System.out.format("Maziausias: %d ", masyvas[0]);

        System.out.format("Vidurkis: %.2f ", vidurkis);

    }

    public static void main(String[] args) {

        arrayOperations();
    }
}