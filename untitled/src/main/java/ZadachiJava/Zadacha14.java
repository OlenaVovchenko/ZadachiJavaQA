package ZadachiJava;

import java.util.Scanner;

public class Zadacha14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово ");
        String word = scanner.next();

        if (word.length() >= 3) {
            char thirdSymbol = word.charAt(2);
            System.out.println("Третий символ : " + thirdSymbol);
        } else {
            System.out.println("Слово меньше трех символов.");
        }
    }
}
