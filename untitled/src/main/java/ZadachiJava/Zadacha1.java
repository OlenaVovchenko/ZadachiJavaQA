package ZadachiJava;

public class Zadacha1 {
    public static void main(String[] args) {
        int x=0;

        for (int a = 1; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                for (int c = 0; c < 10; c++) {
                    if (Integer.parseInt(""+ b + a + c)==546) {
                        x = Integer.parseInt("" + a + b + c);
                        break;
                    }

                }

            }

        }
        System.out.println(x);
    }
}
