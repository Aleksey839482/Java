package API.Lesson_4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
Реализовать консольное приложение, которое:
1. Принимает от пользователя строку вида text~num
2. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
3. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
 */
public class Seminar_task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        boolean work = true;
        while (work){
            System.out.println("Введите строку: ");
            String line = scanner.nextLine();
            String[] arr = line.split("~");
            String text = arr[0];
            if (arr.length != 2){
                System.out.println("Ошибка! Введите корректный формат (text~num):");
                continue;
            }
            int num = Integer.parseInt(arr[1]);
            switch (text) {
                case "print":
                    if(num < 0 || num > list.size() - 1){
                        System.out.println("Индекс " + num + " больше максимального " + (list.size() - 1));
                        continue;
                    }
                    System.out.println(list.remove(num));
                    break;
                case "finish":
                    work = false;
                    break;
                default:
                    list.add(num, text);
            }
        }
        System.out.println("До новых встреч!");
    }
}
