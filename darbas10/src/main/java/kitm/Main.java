package kitm;

import java.util.Arrays;
import java.util.Scanner;



public class Main {

    public static int ilgis(String eil)
    {
        int n = 0;

        for (int i = 0; i < eil.length(); i++)
        {
            if (eil.charAt(i) == ' ')
            {
                n++;
            }
        }

        return n;
    }

    public static void analyzeInput()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Iveskite Skaicius: ");

        String eil;

        eil = input.nextLine();

        int ilgisVar = ilgis(eil);

        int[] masyvas = new int[ilgisVar+1];

        String sk = "";

        int n = 0;

        for (int i = 0; i < eil.length(); i++)
        {
            if (eil.charAt(i) != ' ')
            {
                sk += eil.charAt(i);

            }
            else
            {
                masyvas[n] = Integer.parseInt(sk);
                n++;
                sk = "";
            }
        }

        if (!sk.isEmpty())
        {
            masyvas[n] = Integer.parseInt(sk);
            n++;
        }

        Arrays.sort(masyvas);

        System.out.println("Iveskite koki skaiciu norite surasti: ");

        int a;

        a = input.nextInt();

        if(Arrays.binarySearch(masyvas, a) > -1)
        {
            System.out.println("Jusu skaicius yra " + (Arrays.binarySearch(masyvas, a) + 1) + " vietoje");
        }
        else
        {
            System.out.println("Tokio skaiciaus nera");
        }

        float suma = 0;

        for (int i = 0; i < n; i++)
        {
            suma += masyvas[i];
        }

        System.out.print(Arrays.toString(masyvas) + " ");
        System.out.format("Vidurkis %.2f", suma/n);
        System.out.format(" Didziausia: %d", masyvas[n-1]);
        System.out.format(" Maziausias: %d", masyvas[0]);
    }

    public static void main(String[] args) {
        analyzeInput();

    }
}