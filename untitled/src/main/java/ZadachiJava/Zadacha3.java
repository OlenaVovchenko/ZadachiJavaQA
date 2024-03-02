package ZadachiJava;

import java.util.Scanner;

public class Zadacha3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a two-digit number: ");
        int number = scanner.nextInt();
        if (number<10 || number >100){
            System.out.println("The number is not two digits");
        } else {
            int fistDigit = number / 10;
            int secondDigit = number % 10;
            if (fistDigit > secondDigit) {
                System.out.println("First number is greater.");
            } else if (fistDigit < secondDigit) {
                System.out.println("Second number is greater.");
            } else {
                System.out.println("Numbers are equal.");
            }

        }
    }
}
