
package Start.Task1;

//Практическое задание.
//Проверить работоспособность машины: двигатель D  и транссмисия Т - работает,
//и хотя бы 3 колеса из 4 не проколот.
public class TaskL1 {
    public static void main(String[] args) {
        boolean D = true;
        boolean T = true;
        boolean W4 = false;
        boolean W2 = true;
        boolean W3 = true;
        boolean W1 = false;
        int countW1234 = 0;
        countW1234 += W1 ? 1 : 0;
        countW1234 += W2 ? 1 : 0;
        countW1234 += W3 ? 1 : 0;
        countW1234 += W4 ? 1 : 0;

        if (D && T && (countW1234 >= 3)) {
            System.out.println("Машина работоспособна");
        }else {
            System.out.println("Mашина не работоспособна");
        }
    }
}
