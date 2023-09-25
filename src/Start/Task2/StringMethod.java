package Start.Task2;

import java.util.Arrays;
import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {
        String text = "Foat, Timur";
        // Перевод в верхний регистр
        String textUpper = text.toUpperCase();
        System.out.println(textUpper);

        // Перевод в нижний регистр
        String textLower = text.toLowerCase(Locale.ROOT);
        System.out.println(textLower);

        //Длина строки
        int length = text.length();
        System.out.println(length);

        // Есть ли в тексте другой текст?
        boolean containsFoat = text.contains("Foat");
        System.out.println(containsFoat);

        //Замена всех кусков текста (подстроки) на другой текст
        String replaceText = text.replaceAll("t", "m");
        System.out.println(replaceText);

        //Повторить техт n раз
        String repeatedText = text.repeat(10);
        System.out.println(repeatedText);

        // Разбить текст на массив String
        String names = "Foat;Pimpa;Elvira;Timur";
        String[] numesArray = names.split(";");
        System.out.println(Arrays.toString(numesArray));

        //Объединение строк (конкатенация)
        String word1 = "Foat ";
        String word2 = "Pimpa";
        String result = word1 + word2;
        System.out.println(result);
        System.out.println(word1 + word2);

        //Начинается на подстроку
        boolean startsWithFoat = text.startsWith("Foat");
        System.out.println(startsWithFoat);

        //Заканчивается на построку
        boolean endsWithTimur = text.endsWith("Timur");
        System.out.println(endsWithTimur);

        //Обрезка строки (первые 5 символов)
        String firstFiveLetters = text.substring(0, 5);
        System.out.println(firstFiveLetters);

        //Использование одноовременно несколько методов
        String reaplaseUpperCaseFoat = "Foat".replaceAll("o", "a").toUpperCase();
        System.out.println(reaplaseUpperCaseFoat);

        // Задание.
        // Выбрать текст начиная с 11 символа до конца строки, перевести в нижний регистр.
        // разбить строку на массив по пробелу. Вывести на экран каждое слово из массива и длину строки
        // этого слова:
        String text1 ="My name is Giovanni Giorgio";
        String[] substringToLowerCaseText1 = "My name is Giovanni Giorgio".toLowerCase().substring(11).split(" ");
        System.out.println(Arrays.toString(substringToLowerCaseText1));
//        int length1Text1 = text1.length();
//        System.out.println(length1Text1);
//        String[] splitText1 = text1.split(" ");
//        System.out.println(Arrays.toString(splitText1));
        for (String word: substringToLowerCaseText1){
            System.out.println(word);
            System.out.println(word.length());
        }


    }
}
