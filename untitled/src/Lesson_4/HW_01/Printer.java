package Lesson_4.HW_01;
/*
Дан LinkedList с несколькими элементами разного типа.
В методе revert класса LLTasks реализуйте разворот этого списка без использования встроенного функционала.
 */
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class LLTasks {
    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        // Напишите свое решение ниже
//        return ll.reversed();
        List<Object> ll1 = new LinkedList<>();
        Object item;
        Stack<Object> stack = new Stack<>();
        stack.addAll(ll);
        while(!stack.isEmpty()){
            item = stack.pop();
            ll1.add(item);
        }


        return (LinkedList<Object>) ll1;


    }
}
// Решение из автотестов:
// class LLTasks1 {
//    public static void revertLL(LinkedList<Object> ll) {
//        // Напишите свое решение ниже
//        int size = ll.size();
//        for (int i = 0; i < size / 2; i++) {
//            Object temp = ll.get(i);
//            ll.set(i, ll.get(size - i - 1));
//            ll.set(size - i - 1, temp);
//        }
//    }
//}

    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
        public static void main(String[] args) {
            LinkedList<Object> ll = new LinkedList<>();

            if (args.length == 0 || args.length != 4) {
                // При отправке кода на Выполнение, вы можете варьировать эти параметры
                ll.add(1);
                ll.add("One");
                ll.add(2);
                ll.add("Two");
            } else {
                ll.add(Integer.parseInt(args[0]));
                ll.add(args[1]);
                ll.add(Integer.parseInt(args[2]));
                ll.add(args[3]);
            }

            LLTasks answer = new LLTasks();
            System.out.println(ll);
            LinkedList<Object> reversedList = answer.revert(ll);
            System.out.println(reversedList);
        }
}