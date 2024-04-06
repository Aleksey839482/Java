package Lesson_5.Seminar.Task_04;

import java.util.*;

/*
Взять набор строк, например:

Мороз и солнце день чудесный
Еще ты дремлешь друг прелестный
Пора красавица проснись.

Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с
одинаковой длиной не должны “потеряться”.

TreeMap<Integer, List<String>>
В TreeMap нужно сначала определиться как будут храниться значения что будет ключом, а что значением,
так как у TreeMap структура дерева и все значения упорядочены.
 */
public class Task_04 {
    public static void main(String[] args) {
        String s = "Мороз и солнце день чудесный\n" +
                "Еще ты дремлешь друг прелестный\n" +
                "Пора красавица проснись.";
        sortByLenght(s);
    }
    static void sortByLenght(String s){
        Map<Integer, List<String>> treeMap = new TreeMap<>();
        s = s.replace("\n", " ");
        s = s.replace(".", "");
        s = s.toLowerCase();
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));

        for (String word: arr){
            int len = word.length();
            if (treeMap.containsKey(len)){
                List<String> list = treeMap.get(len);
                list.add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                treeMap.put(len, list);
            }
//            List<String> list = treeMap.getOrDefault(len, new ArrayList<>());  //короткая запись
//            list.add(word);
//            treeMap.put(len, list);
        }
        System.out.println(treeMap);
    }
}
