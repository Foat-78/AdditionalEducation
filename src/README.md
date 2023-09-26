# Коментарии
1. Многострочные коментарии
```
/**
 * LES1
 */
 ```
2. Однострочные коментарии
 ```
  System.out.println("Привет Фоат"); // LES1
  ```
3. Имеются снипеты, что бы не писать отдельно команды класса в первой строке набираем ```class``` и нам подсвечивается возможные варианты. И после получаем:
  ```
  public class LES1 {
  }
  ```
    Далее набираем точку входа и для этого необходимо набрать команду ```main``` и нажимает ```enter``` получаем ```public static void main(String[] args)```.

Например:
  ```
  public class LES1 {
         public static void main(String[] args) {
        }
    } 
  ```
    Для того, что бы что-то вывести в консоль после точки входа необходимо набрать  <System.out.println("Привет Фоат");> и получаем полноценную минимальную программу.

    ```
    public class LES1 {
         public static void main(String[] args) {
            System.out.println("Привет Фоат");
    }
    
    }
    ```

4. Для запуска программы необходимо набрать в терминале команду *java <имя файла>*

5. Основные типы данных и переменных:
   * примитивные:
    - boolean - логически тип данных
    - int - целочисленные данные
    - short - целочисленные данные
    - long и т.д. - целочисленные данные
    - float - вещественные типы данных
    - double - вещественные типы данных
    - Char - символьный тип данных
      * ссылочные (в данном случае относится к классам, интерфейсам):
    - ????

6. Основы: типы данных
   Создание переменной
   <тип> <идентификатор>;
   <идентификатор> = <значение>;

Например:
class Program
{
public static void main(String[] args) {
short age = 10;
int salary = 123456;
System.out.println(age); //10
System.out.println(salary); //123456
}
}

    class Program
    {
    public static void main(String[] args) {
            float e = 2.7f;
            double pi = 3.1415;
            System.out.println(e); // 2.7
            System.out.println(pi); // 3.1415
        }
    }

    class Program
    {
        public  static void main(String[] args) {
            char ch = '1';
            System.out.println(Character.isDigit(ch)); // true
            ch = 'a';
            System.out.println(Character.isDigit(ch)); // false
        }
    }

    public class Program {
        public static void main(String[] args) {
            boolean flag1 = 123 <= 234;
            System.out.println(flag1); // true
            boolean flag2 = 123 >= 234 || flag1;
            System.out.println(flag2); // true
            boolean flag3 = flag1 ^ flag2;
            System.out.println(flag3); // false
        }
    }

        Неявная типизаця:
    public class Program {
        public static void main(String[] args) {
            var a = 123;
            System.out.println(a); // 123
            var d = 123.456;
            System.out.println(d); // 123.456
            System.out.println(getType(a)); // Integer
            System.out.println(getType(d)); // Double
            d = 1022;
            System.out.println(d); // 1022
            //d = "mistake";
            //error: incompatible types:
            //String cannot be converted to double
        }
        static String getType(Object o){
            return o.getClass().getSimpleName();
        }
    }

    7. Операции Java
        ● Присваивание: =
        ● Арифметические: *, /, +, -, %, ++, --
        ● Операции сравнения: <, >, ==, !=, >=, <=
        ● Логические операции: ||, &&, ^, !
        ● Побитовые операции <<, >>, &, |, ^

        # Преобразования не явные
        1. byte -> short -> int -> long
        2. char -> int -> fioat
        3. int -> double
        4. long -> fioat
        5. long -> double

        ## Например:

        int i = 123; double d = i;
        System.out.println(i); // 123
        System.out.println(d); // 123.0

        d = 3.1415; i = (int)d;
        System.out.println(d); // 3.1415
        System.out.println(i); // 3
        
        d = 3.9415; i = (int)d;
        System.out.println(d); // 3.9415
        System.out.println(i); // 3
        
        byte b = Byte.parseByte("123");
        System.out.println(b); // 123
        
        b = Byte.parseByte("1234");
        System.out.println(b);  // NumberFormatException: Value out of range т.е будет переполнение

        ## Форматированный вывод

        public class Program {
        public static void main(String[] args) {
        int a = 1, b = 2;
        int c = a + b;
        String res = a + " + " + b + " = " + c;
        System.out.println(res);
        }
        }

        public class Program {
        public static void main(String[] args) {
        int a = 1, b = 2;
        int c = a + b;
        String res = String.format("%d + %d = %d \n", a, b, c);
        System.out.printf("%d + %d = %d \n", a, b, c);
        System.out.println(res);
        }
        }

        ## Виды спецификаторов

        %d: целочисленных значений
        %x: для вывода шестнадцатеричных чисел
        %f: для вывода чисел с плавающей точкой
        %e: для вывода чисел в экспоненциальной форме,
        например, 3.1415e+01
        %c: для вывода одиночного символа
        %s: для вывода строковых значений

        ## Виды спецификаторов

        public class Program {
            public static void main(String[] args) {
                float pi = 3.1415f;
                System.out.printf("%f\n", pi); // 3,141500
                System.out.printf("%.2f\n", pi); // 3,14
                System.out.printf("%.3f\n", pi); // 3,141
                System.out.printf("%e\n", pi); // 3,141500e+00
                System.out.printf("%.2e\n", pi); // 3,14e+00
                System.out.printf("%.3e\n", pi); // 3,141e+00
            }
        }

        ## Функции и методы
        Функции и методы — это технически одно и то же. Функции могут
        не принадлежать классам, а методы принадлежат.
        В java все функции являются методами.
        Описание
        Вызов
        Возвращаемое значение
        Рекурсия



