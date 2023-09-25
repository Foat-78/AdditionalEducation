package Task3;
//Домашнее задание 1.
//Вычислить n-ое треугольного число(сумма чисел от 1 до n).
//Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает его n-ое треугольное число.
public class StatUmnee1 {
    public static void main(String[] args) {
        int num = 4;
        int count = 0;
        for (int i = 0; i <= num; i++) {
            count = count + i;
        }
        System.out.println(count);
    }
}
