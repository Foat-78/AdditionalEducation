package Task3;
//Семинар.
//Работа с файлами по простецкии.


import java.io.*;

public class StatUmnee5{
    public static void main(String[] args) {
        try {
            // Что бы появился Привет Фоат я записал его в файл text
            FileWriter writer = new FileWriter("text");
            writer.write("Привет Фоат!!!");
            // Закрыли (обязательное условие!!!!)
            writer.close();

            // Считали из файла text
            FileReader reader = new FileReader("text");
            // Объявили новую строку str
            String str = "";
            // В строку str по символьно записали текст
            while (reader.ready()) {
                str += (char)reader.read();
            }
            // Закрыли
            reader.close();
            // Вывели в консоль
            System.out.println(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

