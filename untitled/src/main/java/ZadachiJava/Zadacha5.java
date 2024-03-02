package ZadachiJava;

import java.util.Scanner;

public class Zadacha5 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("введите сторону а треугольника: ");
        double a = scanner.nextDouble();
        System.out.println("введите сторону b треугольника: ");
        double b = scanner.nextDouble();
        System.out.println("введите сторону c треугольника: ");
        double c = scanner.nextDouble();

        if (a == b || a == c|| c ==b){
            System.out.println("Треугольник с сторонами " + a + ", " + b + ", " + c + " является равнобедренным.");
        } else {
            System.out.println("Треугольник с сторонами " + a + ", " + b + ", " + c + " не является равнобедренным.");
        }
    }
}
