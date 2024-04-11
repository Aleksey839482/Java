package API.Lesson_5.HW_01;

/*
Напишите программу, представляющую телефонную книгу. Программа должна иметь следующие функции:

add(String name, Integer phoneNum): Добавляет запись в телефонную книгу.
Если запись с именем name уже существует, добавляет новый номер телефона в существующую запись.
Если запись с именем name не существует, создает новую запись с этим именем и номером телефона phoneNum.

find(String name): Поиск номеров телефона по имени в телефонной книге.
Если запись с именем name существует, возвращает список номеров телефона для этой записи.
Если запись с именем name не существует, возвращает пустой список.

getPhoneBook(): Возвращает всю телефонную книгу в виде HashMap, где ключи - это имена, а значения - списки номеров телефона.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {

// Введите свое решение ниже
//        List<Integer> list = new ArrayList<>();
//        list.add(phoneNum);
//        phoneBook.put(name, (ArrayList<Integer>) list);
//        System.out.println(phoneBook);

        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNum);
        } else {
            List<Integer> list = new ArrayList<>();
            list.add(phoneNum);
            phoneBook.put(name, (ArrayList<Integer>) list);
            }

//        List<Integer> list1 = phoneBook.getOrDefault(name, new ArrayList<>());  //короткая запись
//        list1.add(phoneNum);
//        phoneBook.put(name, (ArrayList<Integer>) list1);
//        System.out.println(phoneBook);
    }

    public ArrayList<Integer> find(String name) {
// Введите свое решение ниже
        List<Integer> list = new ArrayList<>();
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        } else {
            return (ArrayList<Integer>) list;
        }
//        return phoneBook.get(name);
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
// Введите свое решение ниже

        return phoneBook;

    }
}
// Не удаляйте этот класс - он нужен для

public class Printer {
    public static void main(String[] args) {
        String name1;
        String name2;
        int phone1;
        int phone2;

        if (args.length == 0) {
            name1 = "Ivanov";
            name2 = "Petrov";
            phone1 = 123456;
            phone2 = 654321;
        } else {
            name1 = args[0];
            name2 = args[1];
            phone1 = Integer.parseInt(args[2]);
            phone2 = Integer.parseInt(args[3]);
        }

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name1, phone2);
        myPhoneBook.add(name2, phone2);

        System.out.println(myPhoneBook.find(name1));
        System.out.println(PhoneBook.getPhoneBook());
        System.out.println(myPhoneBook.find("Me"));
    }
}
