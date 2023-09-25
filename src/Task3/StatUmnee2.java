package Task3;
// Домашнее задание 3.
// Напишите класс Calculator, который будет выполнять математические операции (+, -, *, /)
// над двумя числами и возвращать результат. В классе должен быть метод calculate,
// который принимает оператор и значения аргументов и возвращает результат вычислений.
// При неверно переданном операторе, программа должна вывести сообщение об ошибке
// "Некорректный оператор: 'оператор'".
public class StatUmnee2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        char op = '/';
        var result = 0;
//        if (op == '+' || ) {
//            result = a + b;
//        }else if (op == '*') {
//            result = a * b;
//        }else if (op == '/') {
//            result = a / b;
//        }else if (op == '-') {
//            result = a - b;
//        }else {
//            System.out.println("Некорректный оператор:" + op);
//        }
//        System.out.println(result);

        switch (op){//
            case '+' -> System.out.println(a + b);
            case '*' -> System.out.println(a * b);
            case '/' -> System.out.println((double)a / b);
            case '-' -> System.out.println(a - b);
            default -> System.out.println("Некорректный оператор:" + op);
        }
    }
}
