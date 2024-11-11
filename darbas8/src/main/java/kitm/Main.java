package kitm;

import java.util.Scanner;

public class Main {

    public static void isPalindrome()
    {
        Scanner input = new Scanner(System.in);

        StringBuilder zod = new StringBuilder();

        System.out.println("Iveskite zodi: ");

        zod.append(input.nextLine());

        String antrasZod = zod.toString();

        zod.reverse();

        System.out.println(zod);

        System.out.print("Zodis \"" + antrasZod + "\" yra palindromas: " );
        System.out.format("%b", antrasZod.equals(zod.toString()));
    }

    public static void main(String[] args) {

        isPalindrome();

    }
}