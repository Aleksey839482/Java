package Lesson_5.Lecture;

import java.util.HashMap;
import java.util.Map;

public class Lecture {
    /*
    Map – это множество коллекций, работающих с данными
    по принципу <Ключ / Значение>.
    Ключевые особенности:
    ● ускоренная обработка данных;
    ● порядок добавления не запоминается.
    ● допускаются только уникальные ключи, значения могут повторяться;
    ● помните про null значения*;
    ● ускоренная обработка данных;
    ● порядок добавления не запоминается.

    В HashMap элементы располагаются как угодно и могут
    менять свое положение.

     */
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один");  // произвести добавление если ключ не найден
        db.put(2, "два");  // добавляет пару или изменить значение если ключ имеется
        db.put(null, "!null");
        System.out.println(db); //{null=!null, 1=один, 2=два}
        System.out.println(db.get(44)); // получение значений по указанному ключу
//        db.remove(null);  // удаляет пару по указанному ключу
        System.out.println(db); //{1=один, 2=два}
        System.out.println(db.containsValue("один")); // проверка наличия значения
//        System.out.println(db.containsValue(1)); // false
//        System.out.println(db.containsKey("один")); //false
        System.out.println(db.containsKey(1)); // проверка наличия ключа
        System.out.println(db.keySet());  // коллекция всех ключей (возвращает множество ключей)
        System.out.println(db.values());  // коллекция всех значений (возвращает набор значений)


        System.out.println("------------------------------------------------------------------------------------");


        Map<Integer, String> db1 = new HashMap<>();
        db1.putIfAbsent(33, "ghfjd");
        db1.put(22, "ghdjse");
        db1.put(44, "kkals");
        System.out.println(db1);

        for (var item : db1.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }
    }
}
