package ZadachiJava;

public class Zadacha13 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 50; i++) {
            if (i % 2 != 0) {
                count = i + count;
            }
        }
        System.out.println(count);
    }
}

