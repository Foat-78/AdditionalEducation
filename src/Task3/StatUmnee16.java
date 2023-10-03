package Task3;
// Время потраченное на выполнение метода с классом String и StringBuilder
public class StatUmnee16 {
    public static void main(String[] args) {
        var s = System.currentTimeMillis();
//          String str = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
//           str += "+";
            sb.append("+");
        }
        System.out.println(System.currentTimeMillis() - s);
//            System.out.println(str);
        System.out.println(sb);
    }
}


