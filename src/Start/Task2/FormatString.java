package Start.Task2;
// Необходимо вывести текст "Меня зовут Фоат. Мне 45 лет."
// с возможностью изменит переменные значения
//public class FormatString {
//    public static void main(String[] args) {
//        String name = "Фоат";
//        int age = 45;
//        // 1 вариант
//        String phrase = "1. Меня зовут " + name + ". Мне " + age + " лет.";
//        System.out.println(phrase);
//        // 2 Вариант с применением специальных значении. Например: %s, %d
//        String phrase1 = String.format("2. Меня зовут %s. Мне %d лет.", name, age);
//        System.out.println(phrase1);
//        // 3 вариант применение System.out.printf вместо System.out.println
//        System.out.printf("3. Меня зовут %s. Мне %d лет.", name, age);
//    }
//}

public class FormatString {
    public static void main(String[] args) {
        String carMark = "Audio";
        String carModel = "Q3";
        double prise = 15_000.00;
        boolean hasFutomatTransmission = true;
        // Задача: С помощью String Format составить строку:
        // Привет, я менеджер салона [Имя бренда]
        // У нас есть модель - [Имя модели] за [Цену]
        // Есть ли у нее автоматическая коробка передач?
        //[Да/Нет]

        //1 Мой вариант
        System.out.printf("1. Привет, я менеджер салона %s.\nУ нас есть модель - %s за %f.\n", carMark, carModel, prise);
        System.out.println(hasFutomatTransmission ? "Да" : "Нет");

        // 2 вариант преподавателя
        String result = """
                2. Привет, я менеджер салона %s.
                У нас есть модель - %s за %f.
                Есть ли у нее автоматическая коробка передач?
                %s
                """.formatted(carMark, carModel, prise, hasFutomatTransmission ? "Да" : "Нет");
        System.out.println(result);
    }
}
