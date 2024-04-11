package API.Lesson_3;

/*
Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на
экран.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Seminar_task01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        genList(list, 10, 0, 10);
        System.out.println(list);

//        list.sort(null);        //Если хотим сортировку стандартную сортировку по возрастанию
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 2 == 0 && o2 % 2 != 0){
                    return 1;
                } else if (o1 % 2 != 0 && o2 % 2 == 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(list);
    }
    static void genList(List<Integer> list, int capacity, int min, int max){
        Random random = new Random();
        for (int i = 0; i < capacity; i++) {
            list.add(random.nextInt(min, max));
        }

    }
}
