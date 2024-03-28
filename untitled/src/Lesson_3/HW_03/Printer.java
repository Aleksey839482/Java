package Lesson_3.HW_03;

/*
Реализуйте метод, который принимает на вход целочисленный массив arr:
- Создаёт список ArrayList, заполненный числами из исходого массива arr.
- Сортирует список по возрастанию и выводит на экран.
- Находит минимальное значение в списке и выводит на экран - Minimum is {число}
- Находит максимальное значение в списке и выводит на экран - Maximum is {число}
- Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:

Integer[] arr - массив целых чисел.
 */

import java.util.Arrays;
import java.util.ArrayList;


class Answer {
    public static void analyzeNumbers(Integer[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer integer: arr){
            list.add(integer);
        }
        list.sort(null);
        System.out.println(list);
        System.out.println("Minimum is " + minNumber(list));
        System.out.println("Maximum is " + maxNumber(list));
        System.out.println("Average is = " + averageNumber(list));

    }
    static int minNumber(ArrayList<Integer> list){
        int minNumber = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < minNumber){
                minNumber = list.get(i);
            }
        }
        return minNumber;
    }
    static int maxNumber(ArrayList<Integer> list){
        int maxNumber = list.getFirst();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > maxNumber){
                maxNumber = list.get(i);
            }
        }
        return maxNumber;
    }
    static Double averageNumber(ArrayList<Integer> list){
        Double averageNumber = 0.0;
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            averageNumber = averageNumber + list.get(i);
        }
        return averageNumber / list.size();
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer1 ans = new Answer1();
        ans.analyzeNumbers(arr);
    }
}