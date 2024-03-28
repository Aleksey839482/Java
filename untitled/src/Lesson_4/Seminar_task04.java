package Lesson_4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
1) Написать метод, который принимает массив элементов,
помещает их в стэк и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов,
помещает их в очередь и выводит на консоль содержимое очереди.
 */
public class Seminar_task04 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        arrayAsStack(arr);
        arrayAsQueue(arr);

    }
    static void arrayAsStack(Integer[] arr){
        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(arr));
//        System.out.println(stack);    // Выводит не как Stack
//        for (int a: stack){
//            System.out.println(a);
//        }
        while (!stack.isEmpty()){    // потому что нужно использовать методы stack
            System.out.println(stack.pop());
        }
    }
    static void arrayAsQueue(Integer[] arr){
        Queue<Integer> queue = new LinkedList<>(); //Queue это интерфейс он не может работать отдельно
        queue.addAll(Arrays.asList(arr));    // так же как и в стеке нужно использовать свои команды
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }
}
