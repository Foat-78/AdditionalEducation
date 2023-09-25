package Task4.references;

import java.util.Arrays;

// Ссылочные типы данных
public class References {
    public static void main(String[] args) {
        //Array - массив
        int[] apples = new int[4];
        apples[0] = 7;
        apples[1] = 3;
        apples[2] = 2;
        apples[3] = 10;

        int[] apples2 = apples; // apples2 ссылается на адрес объекта apples, т.е. новый объект не создаётся
        apples2[0] = 10;
        System.out.println(Arrays.toString(apples2));
        System.out.println(Arrays.toString(apples));

        //Четыре друга
        int[] apples4 = {12, 56, 7, 99};
        System.out.println(Arrays.toString(apples4));
        System.out.println();

        //Разные способы зарезервирования объекта в памяти
        int[] apples5 = new int[4];
        String[] apples6 = new String[4];
        char[] apples7 = new char[4];
        boolean[] apples8 = new boolean[4];
        System.out.println(Arrays.toString(apples5));
        System.out.println(Arrays.toString(apples6));
        System.out.println(Arrays.toString(apples7));
        System.out.println(Arrays.toString(apples8));

        // Cтроки
        String text = "Foat";
        String text2 = text;




    }
}
