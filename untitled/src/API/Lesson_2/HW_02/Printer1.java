package API.Lesson_2.HW_02;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

class BubbleSort1 {
    // Создание логгера с нужным форматом вывода
    private static Logger logger = null;

    static {
        System.setProperty("java.util.logging.SimpleFormatter.format",
                "%1$tF %1$tR %5$s %n");
        logger = Logger.getLogger(BubbleSort1.class.getName());
    }

    public void sort(int[] mas) {

        configureLogger();
        bubbleSort(mas);
    }

    private int[] bubbleSort(int[] mas) {
        boolean isSorted = false;
        int buffer;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buffer = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buffer;
                }
            }
            logger.info(Arrays.toString(mas));
        }
        return mas;
    }

    public void configureLogger() {
        try {
            FileHandler fileHandler = new FileHandler("log1.txt");
            logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

public class Printer1 {
    public static void main(String[] args) {
        int[] arr = {};

        if (args.length == 0) {
            arr = new int[] { 9, 4, 8, 3, 1 };
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        BubbleSort1 ans = new BubbleSort1();
        ans.sort(arr);
    }
}
