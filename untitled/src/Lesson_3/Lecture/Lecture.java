package Lesson_3.Lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
В класс Object можно положить переменные разного типа
Распаковка типа Object происходит в методе

Если бы не было класса Object, то нужно было бы писать отдельные методы для всех типов переменных
(Integer, Double, String...)
 */
public class Lecture {
    static void GetType(Object obj){
        System.out.println(obj.getClass().getName());
    }
    static Object Sum(Object a, Object b){
        if (a instanceof Double && b instanceof Double){            // Если a является Double и т.д.
            return (Object) ((Double) a + (Double) b);      // Переводим a и b к типу Double а результат к типу Object
        } else if (a instanceof Integer && b instanceof Integer) {
            return (Object) ((Integer) a + (Integer) b);
        } else return 0;
    }
    public static void main(String[] args) {
        Object o = 1;
        GetType(o);
        o = 1.2;
        GetType(o);
//--------------------------------------------------------------------------------------------------------
        ArrayList list = new ArrayList();    // Является коллекцией
//        ArrayList<Integer> list = new ArrayList<Integer>();    //Уже не добавим строку так как мы указываем тип.
        list.add(2809);                     // Когда добавляем то отправляем в лист тип Object
        list.add("12345");
        /*
        List - пронумерованный набор элементов.
        Пользователь этого интерфейса имеет точный контроль над тем, где в списке вставляется каждый элемент.
        Пользователь может обращаться к элементам по их целочисленному индексу (позиции в списке) и искать
        элементы в списке. ArrayList, LinkedList (Vector, Stack - устаревшие).
         */
        for (Object i : list){
            System.out.println(i);
        }
        System.out.println(Sum(1, 2));
        System.out.println(Sum(1.0, 2));
        System.out.println(Sum(1, 2.3));
        System.out.println(Sum(1.2, 2.1));
//----------------------------------------------------------------------------------------
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(123);
//        list1.add("string.line");         // Тут будет ошибка так как мы указали тип данных Integer.
        for (Object j : list1){
            System.out.print(j + " ");
        }
        /*
        add(args) - добавляет элемент в список (в т.ч. на нужную позицию)
        get(pos) - возвращает элемент из списка по указанной позиции
        indexOf(item) - первое вхождение или -1
        lastIndexOf(item) - последнее вхождение или -1
        remove(pos) - удаление элемента на указанной позиции и его возвращение
        set(int pos, T item) - gjvtoftn значение item элементу, который находится на позиции pos
        void sort(Comparator) - сортирует набор данных по правилу
        subList(int start, int end) - получение набора данных от позиции start до end
         */
        StringBuilder day = new StringBuilder("27");
        StringBuilder month = new StringBuilder("8");
        StringBuilder year = new StringBuilder("1993");
        StringBuilder[] date = new StringBuilder[]{day, month, year};
        List<StringBuilder> data = Arrays.asList(date);
        System.out.println(data);
        date[1] = new StringBuilder("08");
        System.out.println(data);
        /*
        clear() - очистка списка
        toString() - "конвертация" списка в строоку
        Arrays.asList - преобразует массив в список
        containsAll(col) - проверяет включение всех элементов из col
        removeAll(col) - удаляет элементы, имеющиеся в col
        retainAll(col) - оставляет элементы, имеющиеся в col
        toArray() - конвертация списка в массив Object'ов
        toArray(type array) - конвертация списка в массив type
        List.copyOf(col) - возвращает копию списка на основе имеющегося
        List.of(item1, item2,...) - возвращает неизменяемый список
         */
        Character value = null;
        List<Character> list2 = List.of('A', 'l', 'e', 'k','s', 'e', 'y'); // если создаем методом List.of
//        List<Character> list2 = new ArrayList<Character>();                 // то просто удалить элемент не получится
//        list2.add('A');
//        list2.add('l');
//        list2.add('e');
//        list2.add('x');
        System.out.println(list2);
//        list2.remove(1);
        System.out.println(list2);
        List<Character> list3 = List.copyOf(list2);
    }

}
