package API.Lesson_2;

/*
Напишите метод, который составит строку, состоящую из 100
повторений слова TEST и метод, который запишет эту строку в
простой текстовый файл, обработайте исключения.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Seminar_task04 {
    static Logger logger = Logger.getAnonymousLogger();
    public static void main(String[] args) {
        String s = "test";
        int count = 8;
        String filePath = "untitled/src/API.Lesson_2/test.txt";
        String logPath = "untitled/src/API.Lesson_2/log.txt";

        createLogger(logPath);

        String res = repeat(s, count);
        writeInFile(res, filePath);
        System.out.println(readFile(filePath));

        clouseLogger();
    }

    static void clouseLogger() {
        Handler[] handlers = logger.getHandlers();
        for (Handler handler: handlers){
            handler.close();
        }
    }
    static void createLogger(String logPath){
        try {
            FileHandler handler = new FileHandler(logPath, true);
            logger.addHandler(handler);
//            SimpleFormatter formatter = new SimpleFormatter();                //другой формат вывода лога.
//            handler.setFormatter(formatter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static void writeInFile(String s, String filePath){

        try (FileWriter writer = new FileWriter(filePath, true)){
            writer.write(s);
            writer.write("\n");
            logger.info("Запись проша успешно!");
        } catch (IOException e){
            e.printStackTrace();
            logger.warning("Не удалось записать файл!");
        }

    }
    static String readFile(String filePath){
        File file = new File(filePath);
        StringBuilder stringBuilder = new StringBuilder();
        try(Scanner scanner = new Scanner(file)){
            while (scanner.hasNext()){
                stringBuilder.append(scanner.nextLine()).append("\n");
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
    static String repeat(String s, int count){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            stringBuilder.append(s);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
//        return s.repeat(count);
    }
}
