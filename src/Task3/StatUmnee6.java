package Task3;

//Домашнее задание 2.
//        Реализуйте алгоритм сортировки пузырьком числового массива,
//        результат после каждой итерации запишите в лог-файл.
//        Напишите свой код в методе sort класса BubbleSort.
//        Метод sort принимает на вход один параметр:
//
//        int[] arr - числовой массив
//
//        После каждой итерации, ваш код должен делать запись в лог-файл 'log.txt'
//        в формате год-месяц-день час:минуты {массив на данной итерации}.
//
//        Пример
//        arr = new int[]{9, 4, 8, 3, 1};
//        sort(arr)
//
//// При чтении лог-файла получим:
//        2023-05-19 07:53 [4, 8, 3, 1, 9]
//        2023-05-19 07:53 [4, 3, 1, 8, 9]
//        2023-05-19 07:53 [3, 1, 4, 8, 9]
//        2023-05-19 07:53 [1, 3, 4, 8, 9]
//        2023-05-19 07:53 [1, 3, 4, 8, 9]



import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;



public class StatUmnee6 {
    public static void main(String[] args) {
        boolean sort = false;
        int[] arr = {9, 4, 8, 3, 1};
        while (!sort) {
            sort = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    sort = false;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm ");
            String timestamp = formater.format(new Date(1696031123000L));
            System.out.println(timestamp + Arrays.toString(arr));
        }

    }
}



