package Exception;
//Блок кода finally завершит работу программы при любых способаж ошибки
// в блоке кода try - catch но перед тем как завершиться выполнится блок finally
// и это позволяет нам если открыли файл и хотим сохранить все изменения и тд.
// и этот код дает нам гарантию кроме тех случаев когда программа сделает экстренное завершение
// (System.exit(0)) и когда серъёзные события, комп отключится или в самом блоке finally
// ошибка.
public class FinallyExample {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println("Ой, произошла ошибка: " + e.getMessage());
            throw new ArithmeticException("Произошла новая ошибка!!!");
//            System.exit(0);
        } finally {
//            System.out.println(a/b);// Случай ошибки в блоке finally ошибка
            System.out.println("Программа работает дальше!!!");
        }

    }

}
