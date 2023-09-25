package Start.Task1;

//Ограбили магазин. Вор был ростом 178.
//Следователь нашел две  группы людей около магазина.Задача найти вора по росту.
public class MultiArray {
    public static void main(String[] args) {
        int[] group1 = {180, 178, 190};
        int[] group2 = {165, 197, 193};
        int[][] multiArray = {group1, group2};
        upperFor:// Лейбол или метка для выхода из вашестоящего фора
        for (int[] array: multiArray) {
//            System.out.println(Arrays.toString(array));
            for (int number: array){
                if (number == 178){
                    System.out.println("Нашли вора!");
                    break upperFor; // Выход из цикла при условии выполнения
                }else {
                    System.out.println("Человек не подошёл по росту!!");
                }
            System.out.println(number);
            }
        }
    }
}
