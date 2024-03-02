package ZadachiJava;

public class Zadacha17 {
    public static void main(String[] args) {
        String sentence = "Первая буква алфавита всегда – а";
        char letterFind = 'а';

        if (sentence.contains(String.valueOf(letterFind))) {
            int index = sentence.indexOf(letterFind);
            System.out.println("Буква '" + letterFind + "' есть в предложении. Порядковый номер первой: " + (index + 1));
        } else {
            System.out.println("Буква '" + letterFind + "' отсутствует в предложении.");
        }
    }
}
