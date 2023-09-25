package Task4.references;

public class Equals {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3}; // Будут не равны потому что ссылаются на разные ссылки
        int[] numbers2 = {1, 2, 3}; // на разный объект
        if (numbers1 == numbers2) {
            System.out.println("Равны");
        }else {
            System.out.println("Не равны");
        }


        String text1 = "Foat";//Будут равны потому что ссылки будут на одну и ту строку (пул строк)
        String text2 = "Foat";
        if (text1 == text2) {
            System.out.println("Равны");
        }else {
            System.out.println("Не равны");
        }

        String text3 = new String("Foat");//Будут не равны потому что ссылко идет на разные объекты
        String text4 = new String("Foat");// В данном случае необходимо сравнивать по из значению через Equals

        //!!!! Строки забивают память и для этого есть программа ГАРБУШ КОЛЛЕКТОР!!!

        //1 не правильный вариант сравнения
        if (text3 == text4) {
            System.out.println("Равны");
        }else {
            System.out.println("Не равны");
        }
        //2 правильный вариант сравнения через метд Equals (по значению)
        if (text3.equals(text4)) {
            System.out.println("Равны");
        }else {
            System.out.println("Не равны");
        }
    }
}
