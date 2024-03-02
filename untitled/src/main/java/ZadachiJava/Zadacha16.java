package ZadachiJava;

public class Zadacha16 {
    public static void main(String[] args) {
        String s1 = "meaning";
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (i%2 ==0){
                s2.append(s1.charAt(i));
            }

        }
        System.out.println(s2.toString());
    }
}
