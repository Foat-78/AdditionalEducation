package Task3;

import com.sun.tools.javac.Main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class StatUmnee10 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        try {
            FileWriter fileWriter = new FileWriter("text.txt");
            fileWriter.write("Hello, Pimpa");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            // Создание FileHandler, указывая путь к файлу и максимальный размер файла (в бфйтах)
            FileHandler fileHandler = new FileHandler("Foat.txt");

            // Настраиваем формат собщений
            fileHandler.setFormatter(new SimpleFormatter());

            // Устанавливаем  FileHandler как обработчик для логгера
            logger.addHandler(fileHandler);

            // Устанавливаем  уровень логирования (напрмер, ALL, INFO, WARNING, SEVERE и тю д.)
            logger.setLevel(Level.ALL);

            // Примеры логирования
            logger.info("Информационное сообщение.");
            logger.warning("Предупреждающее сообщение.");
            logger.severe("Сообщение об опасности");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
