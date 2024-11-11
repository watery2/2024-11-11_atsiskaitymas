package kitm;

import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void matrixOperations()
    {
        int[][] masyvas = new int[3][3];

        Random random = new Random();

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                masyvas[i][j] = random.nextInt(11);

                str.append(masyvas[i][j]);
                str.append(" ");
            }

            str.append('\n');
        }

        System.out.println(str);

        int suma;

        for (int i = 0; i < 3; i++)
        {
            suma = 0;

            for (int j = 0; j < 3; j++)
            {
                suma += masyvas[i][j];
            }

            System.out.println("Eilutes " + (i+1) + " suma: " + suma);
        }
    }

    public static void main(String[] args) {

        matrixOperations();
    }
}