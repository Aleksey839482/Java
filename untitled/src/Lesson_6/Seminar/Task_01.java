package Lesson_6.Seminar;

import java.util.*;

/*
1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.

2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.

3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.

 */
public class Task_01 {
    public static void main(String[] args) {
        Integer[] arr = {4, 5, 1, 2, 3, 2, 6, 3};  // Set хранит только уникальные элементы, повторы не будут добавлены
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr)); // Рандомный порядок, кроме чисел (порядок по хэшу)
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr)); // Будут храниться как добавлены
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(arr)); // Будет храниться в отсортированном виде

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }
}
