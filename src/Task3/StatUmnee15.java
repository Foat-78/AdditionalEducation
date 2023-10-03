package Task3;

// Хорошая фича!!!!!
// Для того чтобы не терять время для ввода данных при проверке программы
// необходимо сделать заготовку следующим образом:
// 1. Создать файл. Напрмер: TextSU15.
// 2. Переходим в файл TextSU15 и вводим данные необходимые для проверки программы.
//      Например:
//      1. Бабич Николай Юрьевич, 55, м
//      2. exit
// 3. Переходим в файл StatUmnee15 и запускаем программу. Где кнопка пуска программы на верху
// выбираем Edit Cofigurations => Modifi options => Redirect input => И в строке выбираем
// или пишем тот файл (TextSU15) в котором находятся заготовки => Ok


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
import java.util.Locale;
import java.util.Scanner;

public class StatUmnee15 {
    public static void main(String[] args) {
// 1 вариант
        // 1. Написать интерфейс текстового ввода ФИО возраст и пол
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ФИО, возраст, пол (через запятую): ");
        System.out.println("exit");
//        String sTmp = scanner.nextLine();
//        list.add(sTmp);
//        System.out.println(list);

        // 2. Реализовать ввод для неограниченного количества человек и выход
        while (true) {
            String sTmp = scanner.nextLine();
            if (sTmp.equalsIgnoreCase("exit")) break;
            list.add(sTmp);
        }
        list.forEach(n -> {
            String[] str = n.split(", "); // Строку спилили до запятой
            String[] str1 = str[0].split(" "); // Нулевой элемент str спилили до пробела и положили в str1
            System.out.printf("%s %s.%s. \n", str1[0], str1[1].charAt(0), str1[2].charAt(0)); // Вывели str1 нулевой элемент => str1 первого элемента нулевой элемент и т.д. через f строку Например: Михайлова И.В.
        });
        System.out.println("-".repeat(30));
        list.sort((n1, n2) -> {
            int a = Integer.parseInt(n1.split(", ")[1]);
            int b = Integer.parseInt(n2.split(", ")[1]);
            return a - b;
        });
        list.forEach(n -> {
            String[] str = n.split(", ");
            String[] str1 = str[0].split(" ");
            System.out.printf("%s %s.%s. %s\n", str1[0], str1[1].charAt(0), str1[2].charAt(0), str[1]);
        });
        System.out.println("-".repeat(30));

        list.sort((n1, n2) -> {
           char d = n1.split(", ")[2].toLowerCase().charAt(0);
           char e = n2.split(", ")[2].toLowerCase().charAt(0);
            return e - d;
        });
        list.forEach(n -> {
            String[] str = n.split(", ");
            String[] str1 = str[0].split(" ");
            System.out.printf("%s %s.%s. %s %s\n", str1[0], str1[1].charAt(0), str1[2].charAt(0), str[1], str[2]);
        });

// 2 вариант
//        ArrayList<String> family = new ArrayList<>();
//        ArrayList<String> name = new ArrayList<>();
//        ArrayList<String> secondName = new ArrayList<>();
//        ArrayList<Integer> age = new ArrayList<>();
//        ArrayList<Boolean> gender = new ArrayList<>();
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите ФИО, возраст, пол(м/ж) (через запятую): ");
//        System.out.println("Выход из режима ввода exit");
//        LinkedList<Integer> id = new LinkedList<>();
//
//        while (true) {
//            String sTmp = scanner.nextLine();
//            if (sTmp.equalsIgnoreCase("exit")) break;
//            String[] str = sTmp.split(", ");
//            String[] str1 = str[0].split(" ");
//            family.add(str1[0]);
//            name.add(str1[1]);
//            secondName.add(str1[2]);
//            age.add(Integer.parseInt(str[1]));
//            gender.add(str[2].toLowerCase().contains("м"));
//            id.add(id.size());
//        }
//
//
//        System.out.println("-".repeat(30));
//        id.sort((n1, n2) -> age.get(n1) - age.get(n2));
//        id.forEach(n -> {
//            System.out.printf("%s %s.%s. %d\n", family.get(n), name.get(n).charAt(0),
//                    secondName.get(n).charAt(0), age.get(n));
//        });
//        list.forEach(n ->{
//            String[] str = n.split(", ");
//            String[] str1 = str[0].split(" ");
//            System.out.printf("%s %s.%s. %s\n", str1[0], str1[1].charAt(0),
//                    str1[2].charAt(0), str[1]);
//        });
//        System.out.println("-".repeat(30));
    }
}


