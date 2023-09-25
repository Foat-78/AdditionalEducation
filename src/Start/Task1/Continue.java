package Start.Task1;

public class Continue {
    public static void main(String[] args) {
        int[] results = {3, 5, 6, 2, 1};
        for (int result : results) {
            System.out.println(result);
            if (result == 6) {
                System.out.println("Спортсмен не отжимается!!");
                continue;
            }
            System.out.println("Спортсмен отжимается!!");
        }
    }
}