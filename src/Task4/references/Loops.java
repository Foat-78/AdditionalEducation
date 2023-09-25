package Task4.references;

import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {
        // Array - массив
        int[] apples = new int[4];
        apples[0] = 7;
        apples[1] = 3;
        apples[2] = 2;
        apples[3] = 10;
        System.out.println(Arrays.toString(apples));

        System.out.println("1 вариант\n");

        // 1 Спсоб вывод в столбик через цикл foreach.
        for (int param: apples){
            System.out.println(param);
        }
        System.out.println("2 вариант\n");

        // 2 Спсоб вывод в столбик через цикл fori.
        for (int i = 0; i < apples.length; i++) {
            System.out.println(apples[i]);
        }
        System.out.println("3 вариант\n");

        // 3 Спсоб вывод в столбик через цикл While (цикл говорит пока i == true выполняй условие).
        int i = 0;
        while (i < apples.length){
            System.out.println(apples[i]);
            i++;
        }
        System.out.println("4 вариант\n");

        // 3 Спсоб вывод в столбик через цикл do while (в начале выполняет действие потом проверяет)
        int i1 = 0;

        do{
            System.out.println(apples[i1]);
            i1++;
        }while (i1 < apples.length);
        System.out.println("5 вариант\n");

        //Представим себе, что нам необходимо распечатать первые 5 значении из массива
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int j = 0; j < numbers.length; j++) {
            System.out.println(numbers[j]);
        }

        System.out.println("5.1 вариант\n");

        for (int c = 0; c < numbers.length; c++) {
            if (c == 5){
                break;
            }
            System.out.println(numbers[c]);
        }
        System.out.println("5.2 вариант\n");


        //Представим себе, что нам необходимо распечатать последние 5 значении из массива
        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int v = numbers1.length - 1; v >= numbers1.length - 5 ; v--) {
              System.out.println(numbers1[v]);
        }
        System.out.println("5.3 вариант\n");

        // Вывод в строку и по порядку для этого применяем printf(numbers1[k] + " ")
        for (int k = numbers1.length-5; k < numbers1.length; k++) {
            System.out.printf(numbers1[k] + " ");
        }
            System.out.println();
            System.out.println("5.4 вариант\n");
            for (int d = 0; d < numbers1.length; d++) {
                if (d < 5) {
                    System.out.println(numbers1[d]);
                }

                System.out.println("5.5 вариант\n");

            // Пропустить первые 5 элементов т.е. continue завершает выполнение этой этэрации
            for (int s = 0; s < numbers1.length; s++) {
                if(s < 5){
                    continue;
                }
                System.out.println(numbers1[s]);
            }


            System.out.println("5.6 вариант\n");
            // Вложенный цикл
                // 0 1 2 3
                // 10 30 40 50
            int[] row1 = {0, 1, 2, 3};
            int[] row2 = {10, 30, 40, 50};
            int [][] nestedNumbers = {row1, row2};
                for (int l = 0; l < nestedNumbers.length; l++) {
                    int[] myRow = nestedNumbers[l];
                    for (int q = 0; q < myRow.length; q++) {
                        System.out.printf(nestedNumbers[l][q] + " ");

                    }
                }

                System.out.println();
                System.out.println("5.7 вариант\n");
                // как прервать выполнение внешнего цикла по 3 числу
                // 0 1 2 3
                // 10 30 40 50
                parentfor://лейбол или флаг
                for (int u = 0; u < nestedNumbers.length; u++) {
                    int[] myRow = nestedNumbers[u];
                    for (int g = 0; g < myRow.length; g++) {
                        if (nestedNumbers[u][g] == 3) {
                            break parentfor;
                        }
                        System.out.printf(nestedNumbers[u][g] + " ");
                    }
                }
        }
    }
}
