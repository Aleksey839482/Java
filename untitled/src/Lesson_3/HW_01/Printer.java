package Lesson_3.HW_01;
/*
Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел,
реализует алгоритм сортировки слиянием. Метод должен возвращать отсортированный массив.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MergeSort {
    public static Integer[] mergeSort(int[] a) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        list.sort(null);
        Integer[] b = list.toArray(new Integer[0]);
        return b;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort1 answer = new MergeSort1();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}