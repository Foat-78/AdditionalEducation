package Task3;

import java.util.ArrayList;
import java.util.Random;

// Задание 2.
// Создать два списка.
// Один int, второй string.
// Заполнить первый случайными числами.
// Второй строковыми значениями первого.
// Создать целочисленный список найти средний по значению элемент
public class StatUmnee13 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(new Random().nextInt(10));
//            list2.add(String.valueOf(list1.get(i)));
        }
//        list1.forEach(n -> list2.add(0, String.valueOf(n)));// перевёрнутый список
        list1.forEach(n -> list2.add(String.valueOf(n)));

        System.out.println(list1);
        System.out.println(list2);
    }
}
