package Lesson_3;

/*
Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Seminar_task03 {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(10);
        list.add("15");
        list.add(3.14);
        list.add("sdfll;a");
        list.add(null);
        list.add(23);
        list.add(22);
        list.add(true);

//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) instanceof Integer){
//                list.remove(i--);
//            }
//        }

        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next() instanceof Integer){
                iterator.remove();
            }
        }


        System.out.println(list);
    }
}
