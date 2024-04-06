package Lesson_5.HW_03;

import java.util.Arrays;

class HeapSort1 {
    public static void buildTree(int[] tree, int sortLength) {


    }

    public static void heapSort(int[] sortArray, int sortLength) {
        Arrays.sort(sortArray);
    }
}

// Не удаляйте и не меняйте метод Main!
public class Printer1 {
    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}