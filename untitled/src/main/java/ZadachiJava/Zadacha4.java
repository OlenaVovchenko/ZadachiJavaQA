package ZadachiJava;

import java.util.Scanner;

public class Zadacha4 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите любое число от -9 до 9 ");
        double num = scanner.nextDouble();

        if (num >= -5 && num <= 3){
            System.out.println("Число " + num + " принадлежит интервалу (-5, 3).");
        } else {
            System.out.println("Число " + num + " не принадлежит интервалу (-5, 3).");
        }
    }
}
