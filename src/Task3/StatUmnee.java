package Task3;
// Домашнее задание 2.
// Определение простых чисел от 1 до 1000
public class StatUmnee {
    public static void main(String[] args) {
        int numbers = 1000;
        for (int i = 1; i < numbers; i++) {
            boolean simpleNum = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    simpleNum = false;
                    break;
                }
            }
            if(simpleNum){
                System.out.println(i);
            }
        }
    }
}
