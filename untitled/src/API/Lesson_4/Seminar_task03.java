package API.Lesson_4;
/*
Реализовать консольное приложение, которое:
1. Принимает от пользователя и “запоминает” строки.
2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
3. Если введено revert, удаляет предыдущую введенную строку из памяти.
 */

import java.util.*;

public class Seminar_task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        boolean work = true;
        while (work) {
            System.out.println("Введите строку");
            String line = scanner.nextLine();
            switch (line) {
                case "print":
//                    for (int i = list.size()-1; i < 0; i--) {    //LinkedList плохо работает с индексами
//                        System.out.println(list.get(i));
//                    }
//                    Iterator<String> iterator = list.iterator();    //Тоже плохо потому что, то же самое что и цикл for
//                    while (iterator.hasNext()){
//                        System.out.println(iterator.next());
//                    }
//                    ListIterator<String> iterator = list.listIterator(list.size());    //может работать с размером листа
//                    while (iterator.hasPrevious()){    // идет по предыдущему индексу
//                        System.out.println(iterator.previous());
//                    }
                    for (String s: list){    // по условию задачи нам не нужен прямой лист, только обратный
                        System.out.println(s);
                    }
                    break;
                case "revert":
                    list.remove(0);    // по условию задачи нам не нужен прямой лист, только обратный, поэтому удаляем первый
                    break;
                case "finish":
                    work = false;
                    break;
                default:
                    list.add(0, line);    // по условию задачи нам не нужен прямой лист, только обратный, поэтому добавляем в начало
            }
        }
        System.out.println("До новых встреч");
    }
}
