package Lesson_6.Lecture;
/*
Set только имеет ключ, значение константа
Коллекции, содержащие уникальные элементы, быстрая работа с данными,
"основан" на Map только без пары, порядок добавления не хранится.

HashSet:
isEmpty() - проверка на пустоту
add(V) - добавление элемента в коллекцию
remove(V) - удаление элемента из коллекции
contains(V) - проверка на включение элемента в коллекции
clear() - удаление всех элементов коллекции
size() - возвращает количество элементов коллекции
addAll(Coll) - объединение множеств
retainAll(Coll) - пересечение множеств
removeAll(Coll) - разность множеств

 */

import java.util.HashSet;
import java.util.Set;

public class Lecture_01 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1); set.add(12);
        set.add(123); set.add(1234);
        System.out.println(set.contains(12));
        set.add(null);
        System.out.println(set.size());
        System.out.println(set);
        set.remove(12);
        for (var item: set) {
            System.out.println(item);
        }
        set.clear();
        System.out.println(set);
        System.out.println("---------------------------------------------------------------------------------------");

        /*
        TreeSet
        В основе HashMap, упорядочен по возрастанию, null быть не может.

        LinkedHashSet
        На основе HashMap, помнит порядок добавления.
        Используется тогда когда нужен HashSet с порядком добавления элементов
         */
    }


}
