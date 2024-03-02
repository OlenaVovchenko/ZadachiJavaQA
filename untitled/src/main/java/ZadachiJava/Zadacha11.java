package ZadachiJava;

import java.util.Arrays;
import java.util.Scanner;

public class Zadacha11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число : ");

        String arrayChar = scanner.next();
        char [] digit = arrayChar.toCharArray();
        Arrays.sort(digit);

        char min1 = digit[0];
        char min2 = digit.length > 1 ? digit[1] : min1;
        char max1 = digit[digit.length - 1];
        char max2 = digit.length > 1 ? digit[digit.length -2] : max1;

        System.out.println("Две максимальные цифры : " + max1 + " и " + max2);
        System.out.println("Две минимальные цифры : " + min1 + " и " + min2);

    }
}
