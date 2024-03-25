package Lesson_1;
/*
Дан массив nums = [3,2,5,3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести
эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива
должны быть отличны от заданного, а остальные - равны ему.
 */

import java.util.Arrays;

public class Seminar_task03 {
    public static void main(String[] args) {
        int[] arr = {3,2,5,3};
        int number = 3;
        System.out.println(Arrays.toString(getArr(arr, number)));
        System.out.println(Arrays.toString(sortArr(arr, number)));
    }
    static int[] getArr(int[] arr, int number){
        int[] arr1 = new int[arr.length];
        Arrays.fill(arr1, number);
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != number){
                arr1[j++] = arr[i];
            }
        }
        return arr1;
    }
    static int[] sortArr(int[] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == number){
                    int number1 = arr[j];
                    arr[j] = arr[i];
                    arr[i] = number1;
                }
            }
        }
        return arr;
    }
}
