package Task3;
//Семинар 3

import java.util.*;

import static java.util.List.of;
public class StatUmnee11 {
    public static void main(String[] args) {
        // Список


        // Почему разные надписи с лева и справа, потому что ArrayList это класс который реализует список

        List list = new ArrayList();
        // Добавление список осуществляется следующим образом
        list.add(1978); //можно добавить цифру
        list.add("Foat"); //можно добавить строку
        list.add(Arrays.toString(new int[]{9, 4, 1978})); //можно добавить массив
        list.add(true); //можно добавить условие
        System.out.println(list);

        // Достать из списка осуществляется следующим образом
        int a = (int) list.get(0); //где, get(0) - получение по индексу, (int) - диномическое приведение типа
        System.out.println(a);

        // Первый вариант
        String b = (String) list.get(1);
        System.out.println(b);

        // Второй вариант
        if (list.get(1) instanceof String d) {
            System.out.println(d);
        }


        if (list.get(2) instanceof int[] c) {
            System.out.println(Arrays.toString(c));
        }

        // Инициализация осуществляется следующим образом
        // 1 вариант
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1978);
        System.out.println(list1);
        // 2 вариант
        List<List<String>> list2 = new ArrayList<List<String>>();
        list2.add(Collections.singletonList("Timur"));
        System.out.println(list2);


        //Динамическая иициализация
//        ArrayList<Integer> list4 = (ArrayList<Integer>) List.of(0, 1, 5, 8, 7, 9);

        //Добавление списка в другой список
        List<Integer> list5 = new ArrayList<>();
        list5.add(2013);
        List<Integer> list6 = new ArrayList<>();
        list6.add(2015);
        list5.addAll(list6);
        System.out.println(list5);

        // Удаление из списка элементов по индексу
        list5.remove(0);
        System.out.println("list5" + " = " + list5);

        // Изменение элементов в списке
        list5.set(0, 1978);
        System.out.println("list5" + " = " + list5);

        // Возвращение индекса элементов если найдёт индекс а если нет то возвращает -1
        List<Integer> list9 = new ArrayList<>();
        list9.add(1976);
        list9.add(1978);
        list9.add(2015);
        list9.add(2013);
        list9.indexOf(0); // ищет индексы с младших индексов т.е. с начала
        System.out.println("list9" + " = " + list9);
        System.out.println(list9.indexOf(1977));// -1
        System.out.println(list9.indexOf(1978));// 1

        // Количество элементов массива
        System.out.println(list9.size());// 4

        // Возвращение индекса элементов если найдёт индекс а если нет то возвращает -1
        System.out.println(list9.lastIndexOf(2015));// ищет индексы со старших индексов т.е. с конца
        System.out.println(list9.lastIndexOf(2014));

        // От строка возвращает от и до элементов списка
        System.out.println(list9.subList(0, 2));//[1976, 1978]
        System.out.println(list9.subList(0, list9.size() / 2));//[1976, 1978]

        //
        ArrayList<Integer> list10 = new ArrayList<>();
        ArrayList<Integer> list11 = new ArrayList<>();
        ArrayList<Integer> list12 = new ArrayList<>();

        List<Integer> list4 = new ArrayList<>(Arrays.asList(0, 1, 5, 15, 7, 9, 3, 4));
        for (int i = 0; i < 15; i++) {
            list10.add(new Random().nextInt(15));
            list11.add(new Random().nextInt(10));
            list12.add(new Random().nextInt(10));

        }
        System.out.println("list10 = " + list10);
        System.out.println("list11 = " + list11);
        System.out.println("list12 = " + list12);
        System.out.println("list4 = " + list4);
        System.out.println("*-".repeat(24));


        //Осталось то, что отсутствует в list10 и list11
        list10.removeAll(list11);
        System.out.println("Отсутствует в list10 и list11 " + list10);

        //Осталось то, что отсутствует в list10 и list14
        list10.removeAll(list4);
        System.out.println("Отсутствует в list10 и list14 " + list10);

        //Осталось то, что присутствует в list12 и list14
        list12.retainAll(list4);
        System.out.println("Присутствует в list12 и list14 " + list12);

        // Лямда выражение
        list12.removeIf(n -> n % 2 == 0); //Переберёт все элементы из листа и приравняет его к n и если  n % 2 == 0 то он вернёт значение
        System.out.println("Лямда выражение " + list12);

        // Встроеная сортировка
        list10.sort(Comparator.naturalOrder());
        System.out.println("Встроеная сортировка по возрастанию list10 = " + list10);

        list10.sort(Comparator.reverseOrder());
        System.out.println("Встроеная сортировка по убыванию list10 = " + list10);

        // Сортировка (обычно бинарная сортировка)

        // Первый вариант
        list10.sort(new Comparator<Integer>() { // Comparator - это класс, интерфейс
            @Override
            public int compare(Integer o1, Integer o2) { // Имеется несколько способов стротегии - это когда взвешивает два элемента
                // о1 < о2 он должен вернуть положительное,
                // о1 = о2 он должен вернуть ноль,
                // о1 > o2 он должен вернуть отрицательное число
                // и на основе этих результатов выдает правильное значение.
                return o2 - o1; // Сортировка на убывание
//                return o1 - o2; // Сортировка на возрастание

            }
        });
        System.out.println("Сортировка (обычно бинарная сортировка) " + list10);

        //Второй вариант это когда можно засунуть какой то функционал
        list12.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 2 == 0) return 1; // Если он четный тогда читаем о1 больше
                if (o2 % 2 == 0) return -1; // Если о1 не четный, о2 четный тогда читаем о2 больше
                return 0; // перемешивает
            }
        });
        System.out.println("Второй вариант это когда можно засунуть какой то функционал " + list12);

        // Методы перебора списков
        // Первый обычным циклом for
        System.out.println("Метод перебора обычным циклом for: ");
        for (int i = 0; i < list10.size(); i++) {
            System.out.print(list10.get(i) + ", ");
        }
        System.out.println();

        // Второй вариант foreach
        System.out.println("Метод перебора вариант foreach: ");
        for (int i : list10) {
            System.out.print(i + ", ");
        }

        // Трети способ это Iterator
        System.out.println();
        System.out.println("Метод перебора Iterator");

        Iterator<Integer> iterator = list10.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            System.out.print(i + ", ");
        }

        // Трети способ это ListIterator с середины до конца
        System.out.println();
        System.out.println("Метод перебора ListIterator с середины до конца list10");

        ListIterator<Integer> iterator1 = list10.listIterator(list10.size() / 2);
        while (iterator1.hasNext()) {
            int j = iterator1.next();
//            iterator1.add(1);
//            iterator1.set(7);
            System.out.print(j + ", ");
//            iterator1.remove();
//            iterator1.nextIndex();
        }


        // Четвертый способ это ListIterator с середины до начала
        System.out.println();
        System.out.println("Метод перебора ListIterator с середины до начало list10");

        ListIterator<Integer> iterator2 = list10.listIterator(list10.size() / 2);
        while (iterator2.hasPrevious()) {
            int f = iterator2.previous();
            System.out.print(f + ", ");
        }


        // Пятый способ перебора встроенный foreach
        System.out.println();
        System.out.println("Метод перебора встроенным foreach");
        list10.forEach(n -> System.out.print(n + ", "));
    }
}
