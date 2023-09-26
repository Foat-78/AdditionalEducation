package Exception;
//Логирование нужна для того что бы вылавливать ошибки
// и при желании выдавать эти ошибки пользователю, и
// что бы программа не зовершала свою работу с ошибками
public class ExceptionExample {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
            int [] ints = new int[2];
            System.out.println(ints[3]);
//            System.out.println(a/b);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e){ // 1 вариант - можно включить разные методы экземпляра класса вылавливания ошибки и эти два метода экземпляра класса наследователи Exception
            System.out.println("Ой, пройзошла ошибка связанное с делением или массива: " + e.getMessage());
//        } catch (Exception e){ //2 вариант - там можно сделать вместо 1 варианта т.к. это класс первых двух методов экземпляра класса
//            System.out.println("Ой, произошла ошибка связанное с делением или массивами: " + e.getMessage() );
        }
        System.out.println("Программа работает дальше!!");
    }
}
