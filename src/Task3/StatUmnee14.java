package Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

// Задание 3
// Создать целочисленный список найти средний
// по значению индекс элемента.
public class StatUmnee14 {
    public static void main(String[] args) {
//        // Индекс среднего значения
//        ArrayList<Integer> list1 = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            list1.add(new Random().nextInt(10));
//        }
//        System.out.println(list1);
//        ArrayList<Integer> list2 = new ArrayList<>(list1);
//        list2.sort(Comparator.naturalOrder());
//        System.out.println(list2);
//        Integer i = list2.get(list2.size() / 2);
//        System.out.println(list1.indexOf(i));


        // Среднее арифметическое значение
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(new Random().nextInt(10));
        }
        System.out.println(list1);
        int sum = 0;
        for (int i = 0; i < list1.size(); i++) {
            sum += list1.get(i);
        }
        int[] n = {sum / list1.size()};
        System.out.println(Arrays.toString(n));
        list1.sort((o1, o2) -> Math.abs(o1 - n[0]) - Math.abs(o2 - n[0]));
        System.out.println(list1);
    }
}
