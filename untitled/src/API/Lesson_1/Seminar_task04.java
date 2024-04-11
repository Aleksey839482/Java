package API.Lesson_1;
/*
Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
 */

public class Seminar_task04 {
    public static void main(String[] args) {
        String line = "Добро пожаловать на курс по Java";
        String[] arr = line.split(" ");
        String res = "";
        for (int i = arr.length - 1; i >= 0 ; i--) {
            res += arr[i] + " ";
        }
        System.out.println(res.trim());
    }
}
