package Task3;
//1. Объявить строку с текстом, подсчитать количество запятых
//2. Задать две строки. Найти все вхождения первой строки во вторую.
//Вывести в консоль количество и индексы начала
//3. Заполнить строку и StringBuilder 1000ю символами. Сравнить время заполнения
public class StatUmnee4 {
        public static void main(String[] args) {
        String str2 = "abrjkl asdajkl asdajkl abro";
        String str1 = "as";
        int k = 0;
        int count1 = 0;
        for (int i = 0; i < str2.length(); i = i + str1.length() + count1){
            count1 = str2.indexOf(str1, i);
            k++;
            if (count1 == -1){
                break;
            }
            else{
                System.out.println(count1);
            }
        }
        System.out.println(k);
    }
}
