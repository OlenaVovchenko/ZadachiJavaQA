package ZadachiJava;

import java.util.Scanner;

public class Zadacha12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите натуральное число: ");
        int number = scanner.nextInt();

        boolean isAscending = true;
        int currentDigit, nextDigit = number % 10;
        number = number / 10;

        while (number > 0 && isAscending) {
            currentDigit = number % 10;
            number = number / 10;
            if (currentDigit > nextDigit) {
                isAscending = false;
            }
            nextDigit = currentDigit;
        }

        if (isAscending) {
            System.out.println("Последовательность цифр числа упорядочена по возрастанию.");
        } else {
            System.out.println("Последовательность цифр числа не упорядочена по возрастанию.");
        }
    }
}
