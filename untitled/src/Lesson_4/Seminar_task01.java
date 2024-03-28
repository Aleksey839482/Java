package Lesson_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
Сравните с предыдущим.
 */
public class Seminar_task01 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>(); //плох по чтению по индексам

        long t1 = test(list1);
        long t2 = test(list2);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(test1(list1));
        System.out.println(test1(list2));
    }

    static long test(List<Integer> list){
        long timeStart = System.currentTimeMillis(); // время начала операции
        for (int i = 0; i < 100000; i++) {
            list.add(0, i);
        }
        long timeFinish = System.currentTimeMillis(); // время начала операции
        return timeFinish - timeStart; // разница = время выполнения операции
    }
    static long test1(List<Integer> list){
        long sum = 0;
        long timeStart = System.currentTimeMillis(); // время начала операции
//        for (int i = 0; i < 100000; i++) {
//            sum += list.get(i);
//        }
        for (int a: list){
            sum += a;
        }
        long timeFinish = System.currentTimeMillis(); // время начала операции
        System.out.println("sum = " + sum);
        return timeFinish - timeStart; // разница = время выполнения операции
    }
}
