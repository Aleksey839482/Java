package API.Lesson_2;

/*
Дано четное число N (>0) и символы c1 и c2.
Написать метод, который вернет строку длины N, которая
состоит из чередующихся символов c1 и c2, начиная с c1.
 */

import java.util.Scanner;

public class Seminar_task01 {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = 'b';
        int n = 8;
        System.out.println(contact(c1, c2, n));
    }
    static String contact(char c1, char c2, int n){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n/2; i++) {
            stringBuilder.append(c1).append(c2);
        }
        return stringBuilder.toString();
    }
}
