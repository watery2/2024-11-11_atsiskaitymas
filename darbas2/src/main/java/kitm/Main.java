package kitm;

import java.util.Scanner;

public class Main {

    public static void stringOperations()
    {
        Scanner input = new Scanner(System.in);

        StringBuilder sak = new StringBuilder();

        sak.append(input.nextLine());

        System.out.println("Originalus sakinys: " + sak);

        System.out.println("Didziosiomis: " + sak.toString().toUpperCase());

        System.out.println("Atvirksciai: " + sak.reverse());

        sak.reverse();

        int zodNum = 0;

        for (String w: sak.toString().split("\\s"))
        {
            zodNum++;
        }

        System.out.println("Zodziu skaicius: " + zodNum);

        System.out.println("Prasideda \"Java\": " + sak.substring(0, 4).equals("Java"));

    }

    public static void main(String[] args) {
        stringOperations();
    }
}