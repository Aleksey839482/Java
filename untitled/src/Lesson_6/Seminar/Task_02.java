package Lesson_6.Seminar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
1. Напишите метод, который заполнит массив из 1000 элементов случайными
цифрами от 0 до 24.
2. Создайте метод, в который передайте заполненный выше массив и с
помощью Set вычислите процент уникальных значений в данном массиве и
верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее
количество чисел в массиве.
 */
public class Task_02 {
    public static void main(String[] args) {
        Integer[] arr = createArray(0, 24, 1000);
        System.out.println(Arrays.toString(arr));
        System.out.println(unicPercent(arr));

    }

    static Integer[] createArray(int min, int max, int count){
        Integer[] arr = new Integer[count];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(min, max + 1);
        }
        return arr;
    }
    private static double unicPercent(Integer[] arr){
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        return set.size() * 100.0 / arr.length;
    }
}
