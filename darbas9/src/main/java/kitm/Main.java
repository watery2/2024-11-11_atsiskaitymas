package kitm;

import java.util.Random;

import java.util.Arrays;

public class Main {

    public static void findMaxinMatrix()
    {
        int[][] masyvas = new int[3][4];

        Random random = new Random();

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                masyvas[i][j] = random.nextInt(21);

                str.append(masyvas[i][j]);
                str.append(" ");
            }

            str.append('\n');
        }

        System.out.println(str);

        Arrays.sort(masyvas[0]);
        Arrays.sort(masyvas[1]);
        Arrays.sort(masyvas[2]);

        int max = 0;

        for (int i = 0; i < 3; i++)
        {
            if (max < masyvas[i][3])
            {
                max = masyvas[i][3];
            }
        }

        System.out.println("Didziausia reiksme: " + max);

    }

    public static void main(String[] args) {

        findMaxinMatrix();
    }
}