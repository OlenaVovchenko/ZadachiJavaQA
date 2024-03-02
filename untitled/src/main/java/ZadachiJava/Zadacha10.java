package ZadachiJava;

import java.util.Scanner;

public class Zadacha10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        String naturalNumber = scanner.next();
        char firstDigit = naturalNumber.charAt(0);

        int count = 0;
        for (int i = 0; i < naturalNumber.length(); i++) {
            if (firstDigit == naturalNumber.charAt(i)){
                count++;
            }

        }
        System.out.println("Первая цифра '" + firstDigit + "' встречается в числе " + count + " раз.");
    }
}
