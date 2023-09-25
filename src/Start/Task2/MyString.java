package Start.Task2;

public class MyString {
    public static void main(String[] args) {
//        String text1 = "foat";
//        String text2 = "foat";
//        System.out.println(text1 == text2);// Буде true потому что ссылка на одну и ту же ячейку в памяти
        String text1 = new String("foat");
        String text2 = new String("foat");
//        System.out.println(text1 == text2);// Будет false потому что ссылка на две разные объекты
        System.out.println(text1.equals(text2)); //Будет true. При работе с классом String для сравнения необходимо
                                                 // использовать метод equals который сравнение осуществляет по значению
    }
}
