package API.Lesson_4.Lekture;

import java.util.*;

import static java.lang.Character.isDigit;

/*
LinkedList представляет собой двусвязный список.
Список - гибкая структура данных, позволяющая легко менять свой размер.
Элементы доступны для вставки или удаления в любой позиции.
LinkedList нужен для небольшого количества
элементов, в которых операции добавления\удаления
встречаются чаще операций чтения.
В LikedList объекты имеют информацию не только о том какое значение идет после, но и то что идет перед.
 */
public class Lecture {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(1);
        System.out.println(linkedList);
//    ----------------------------------------------------------------------------------------
    /*
    Коллекция Queue работает по принципу то кто первый пришел тот и будет первым обработан как очередь в магазине.
     */
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        int item = queue.remove();
        queue.add(4);
        queue.add(5);
        int item1 = queue.remove();

        System.out.println(queue);

//    ----------------------------------------------------------------------------------------------
        /*
        PriorityQueue в приоритете наименьший объект.
         */
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(123);
        priorityQueue.add(1);
        priorityQueue.add(23);
        priorityQueue.add(12);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

//    -----------------------------------------------------------------------------------------------------
        /*
        Deque Линейная коллекция, которая поддерживает вставку и удаление элементов на обоих концах.
         */

        /*
        Stack представляет собой обработку данных по принципу LIFO.
        Расширяет Vector пятью операциями, которые позволяют рассматривать вектор как стек.
         */

        //        Вычислить значение выражения в постфиксной форме записи
//        var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3
//        int res = 0;
//        System.out.println(Arrays.toString(exp));
//        Stack<Integer> st = new Stack<>();
//        for (int i = 0; i < exp.length; i++) {
//
//            if(isDigit(exp[i])){
//                st.push(Integer.parseInt(exp[i]));
//            } else {
//                switch (exp[i]) {
//                    case "+":
//                        res = st.pop() + st.pop();
//                        st.push(res);
//                        break;
//                    case "-":
//                        res = st.pop() - st.pop();
//                        st.push(res);
//                        break;
//                    case "*":
//                        res = st.pop() * st.pop();
//                        st.push(res);
//                        break;
//                    case "/":
//                        res = st.pop() / st.pop();
//                        st.push(res);
//                        break;
//                    default:
//                        break;
//                }
//            }
//
//        }
//        System.out.println(st.pop() + "\n");
    }
}

