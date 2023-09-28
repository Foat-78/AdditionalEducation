package Task3;

//Задание 1 семинара.
//Шесть раз вывести строку "с1с2"
public class StatUmnee9 {
    public static void main(String[] args) {
       int N = 6;
        String a = "c1";
        String b = "c2";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            stringBuilder.append(i + 1 + ")." + " " + a).append(b + "\n");
        }
        System.out.println(stringBuilder);
    }
}
