package Task3;

import java.util.Arrays;
import java.util.logging.SimpleFormatter;

//Домашнее задание 4.
//        В файле задано уравнение вида q + w = e (q, w, e >= 0).
//        Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
//        Восстановите выражение до верного равенства.
//        Предложите хотя бы одно решение или сообщите, что его нет.
//        Напишите класс Equation, содержащий метод getSolution,
//        который будет считывать уравнение из файла и восстановит его до верного равенства.
//        Выведите сначала строку формата "Given the equation: {выражение из файла}".
//        А затем верните строку формата "Result: {цельное выражение}".
//        Если выражение не имеет решений - верните строку "No solution".
//        Пример
//        Given the equation: ? + 4 = 9
//        Result: 5 + 4 = 9
public class StatUmnee3 {
    public static void main(String[] args) {
                String str = "? + 3 = 9";
                System.out.printf("Given the equation: %s", str);
                System.out.println();
                System.out.println("Result: " + resString(str));
            }
            public static String resString(String str){
                int value1 = str.indexOf('?');
                int value2 = str.lastIndexOf('?');
                StringBuilder stringBuilder = new StringBuilder(str);
                for (int i = 0; i <= 9 ; i++) {
                    char temp1 = (char)(i + '0');
                    stringBuilder.setCharAt(value1, temp1);
                    for (int j = 0; j < 9; j++) {
                        char temp2 = (char) (j + '0');
                        stringBuilder.setCharAt(value2, temp2);
                        String result = stringBuilder.toString();
                        if(parseDigit(result)) {
                            return result;
                        }
                    }
                }
                return "No solution";

            }
            public static boolean parseDigit(String res){
                String[] temp = res.split(" ");
                int left = Integer.parseInt(temp[0].trim());
                int right = Integer.parseInt(temp[2].trim());
                int sum = Integer.parseInt(temp[4].trim());
                return left + right == sum;
            }
        }

