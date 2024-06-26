package API.Lesson_5.Seminar.Task_02;

import java.util.HashMap;
import java.util.Map;

/*
Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными
и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на
некоторую букву во втором слове, при этом
1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
порядка следования. (Например, add - egg изоморфны)
2. буква может не меняться, а остаться такой же. (Например, note - code)
Пример 1:
Input: s = "foo", t = "bar"
Output: false
Пример 2:
Input: s = "paper", t = "title"
Output: true

len == len
p = t
a = i
 */
public class Task_02 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("add", "egg"));
        System.out.println(isIsomorphic("note", "code"));
        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("bar", "foo"));
    }
    static boolean isIsomorphic(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        char[] c1 = s1.toCharArray(); // Делает из строки массив символов
        char[] c2 = s2.toCharArray();

        for (int i = 0; i < c1.length; i++) {
            if (map.containsKey(c1[i])){  // Метод, который проверяет есть ли элемент среди ключей
                if (map.get(c1[i]) != c2[i]){
                    return false;
                }
            } else {
                if (map.containsValue(c2[i])){
                    return false;
                }
                map.put(c1[i], c2[i]);
            }
        }
        return true;
    }
}

