package ZadachiJava;

import java.util.Scanner;

public class Zadacha6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите порядковый номер месяца: ");
        int numMonth = scanner.nextInt();

        if ((numMonth > 0 && numMonth<3) || numMonth == 12 ){
            System.out.println("сейчас зима");
        } else if (numMonth >=3 && numMonth < 6 ) {
            System.out.println("сейчас весна");
        } else if (numMonth >=6 && numMonth < 9) {
            System.out.println("сейчас лето");
        }else if (numMonth >=9 && numMonth < 12) {
            System.out.println("сейчас осень");
        }else {
            System.out.println("это число не является номером месяца");
        }
    }
}
