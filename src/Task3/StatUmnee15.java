package Task3;

//LinkedList -двусвязный список. Список - гибкая структура данных,
// позволяющая легко менять свой размер. Элементы доступны для вставки и
// удаления в любой позиции.

// Гарбич коллектор - одна из форм автоматического управления памятью.
// Специальный процесс, называемый сборщиком мусора (англ. garbage collector),
// периодически освобождает память, удаляя из неё ставшие ненужными объекты.

// Queue  -

//Семинар 4. Задание 1.
// 1. Написать интерфейс текстового ввода ФИО возраст и пол
// 2. Реализовать ввод для неограниченного количества человек и выход
// из режима по команде exit. Вывести список введённых данных в формате
// Иванов И.И. в порядке ввода.
// 3. вывести отсортированными по возрасту
// в формате Иванов И.И. 16
// 4. вывести отсортированными по возрасту и полу в формате Иванов И.И. 16 М

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class StatUmnee15 {
    public static void main(String[] args) {
        ArrayList<String> family = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> secondName = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> gender = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ФИО, возраст, пол(м/ж) (через запятую): ");
        System.out.println("Выход из режима ввода exit");
        LinkedList<Integer> id = new LinkedList<>();

        while (true){
            String sTmp = scanner.nextLine();
            if (sTmp.equalsIgnoreCase("exit")) break;
            String[] str = sTmp.split(", ");
            String[] str1 = str[0].split(" ");
            family.add(str1[0]);
            name.add(str1[1]);
            secondName.add(str1[2]);
            age.add(Integer.parseInt(str[1]));
            gender.add(str[2].toLowerCase().contains("м"));
            id.add(id.size());
        }


        System.out.println("-".repeat(30));
        id.sort((n1, n2) -> age.get(n1)-age.get(n2));
        id.forEach(n ->{
            System.out.printf("%s %s.%s. %d\n", family.get(n), name.get(n).charAt(0),
                    secondName.get(n).charAt(0), age.get(n));
        });
//        list.forEach(n ->{
//            String[] str = n.split(", ");
//            String[] str1 = str[0].split(" ");
//            System.out.printf("%s %s.%s. %s\n", str1[0], str1[1].charAt(0),
//                    str1[2].charAt(0), str[1]);
//        });
//        System.out.println("-".repeat(30));
////        list.sort((n1, n2) ->{
////            char d = n1.split(", ")[2].toLowerCase().charAt(0);
////            char e = n2.split(", ")[2].toLowerCase().charAt(0);
////            return d - e;
////        });
//        ArrayList<String> list2 = new ArrayList(list);
//        list2.removeIf(n-> n.split(", ")[2].toLowerCase().charAt(0)=='м');
//        list.removeAll(list2);
//        list2.addAll(list);
//        list2.forEach(n ->{
//            String[] str = n.split(", ");
//            String[] str1 = str[0].split(" ");
//            System.out.printf("%s %s.%s. %s %s\n", str1[0], str1[1].charAt(0),
//                    str1[2].charAt(0), str[2], str[1]);
//        });
    }
}