package ZadachiJava;

import java.util.Scanner;

public class Zadacha9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n : ");
        int n = scanner.nextInt();

        int number = 1;
        while (true){
            int square = number*number;
            if (n<square){
                System.out.println("Первое число, большее " + n + " в последовательности квадратов натуральных чисел:" + square);
                break;
            }
            number++;
        }
    }
}
