package ZadachiJava;

import java.util.Scanner;

public class Zadacha2 {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println("Введите второе число");
        int n = sc.nextInt();
        if (m%n ==0 ){
            System.out.println("ча-стное от деления " + (m /n));
        } else {
            System.out.println("m на n нацело не делится " +
                    "");
        }

    }
}
