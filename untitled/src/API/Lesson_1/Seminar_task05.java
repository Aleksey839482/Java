package API.Lesson_1;
/*
Реализовать функцию возведения числа а в степень b. a, b из Z.
Сводя количество выполняемых действий к минимуму.
Пример 1: а = 3, b = 2, ответ: 9
Пример 2: а = 2, b = -2, ответ: 0.25
Пример 3: а = 3, b = 0, ответ: 1
 */

import java.util.Scanner;

public class Seminar_task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число которое хотите возвести в степень");
        double number1 = Double.parseDouble(scanner.nextLine());
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите в какую степень необходимо возвести число");
        double number2 = Double.parseDouble(scanner1.nextLine());
        System.out.println(pow(number1, number2));
    }
    static double pow(double number1, double number2){
        double res = 1;
        if (number1 == 0 || number1 == 1){
            return number1;
        }
        if (number2 < 0){
            number1 = 1 / number1;
            number2 = -number2;
        }
        for (int i = 0; i < number2; i++) {
            res *= number1;
        }
        return res;
    }
}
