package API.Lesson_3.HW_03;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

class Answer1 {
    public static void analyzeNumbers(Integer[] arr) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr));
        Collections.sort(nums); // сортировка списка по возрастанию
        System.out.println(nums); // вывод списка на экран
        System.out.println("Minimum is " + nums.get(0)); // нахождение минимального значения в списке и вывод на экран
        System.out.println("Maximum is " + nums.get(nums.size()-1)); // нахождение максимального значения в списке и вывод на экран

        int sum = 0;
        for(int i : nums){ // вычисление суммы всех элементов списка
            sum += i;
        }
        System.out.println("Average is = " + (double) sum / nums.size()); // вычисление среднего арифметического значений списка и вывод на экран
    }
}

public class Printer1{
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
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