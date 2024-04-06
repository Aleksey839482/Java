package Lesson_6.Seminar;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для
приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва
Можно записать в текстовом виде, не обязательно реализовывать в java.
-----------------------------------------------------------------------------------------------------------
1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно
использовать не все придуманные поля и методы. Создайте несколько
экземпляров этого класса, выведите их в консоль.
2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась
его кличка, цвет и возраст (или другие параметры на ваше усмотрение).
-----------------------------------------------------------------------------------------------------------
1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
Поместите в него некоторое количество объектов.
2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.
Убедитесь, что все они сохранились во множество.
3. Создайте метод public boolean equals(Object o)
Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод
должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
4. Создайте метод public int hashCode()
который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать
Objects.hash(...))
5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.

 */
public class Task_03 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Шаня";
        cat1.age = 2;
        cat1.owner = "Евгения";
        cat1.color = "Коричнево-желтый";
        cat1.sterilization = true;

        Cat cat2 = new Cat();
        cat2.name = "Вася";
        cat2.age = 10;
        cat2.owner = "Тимур";
        cat2.color = "Рыжий";
        cat2.sterilization = true;

        Cat cat3 = new Cat();
        cat3.name = "Зайка";
        cat3.age = 8;
        cat3.owner = "Алексей";
        cat3.color = "Белый";
        cat3.sterilization = true;

        Cat cat4 = new Cat();
        cat4.name = "Мурзик";
        cat4.age = 1;
        cat4.owner = "Миша";
        cat4.color = "Дымный";
        cat4.sterilization = false;

        Cat cat5 = new Cat();
        cat5.name = "Мурзик";
        cat5.age = 1;
        cat5.owner = "Миша";
        cat5.color = "Дымный";
        cat5.sterilization = false;

        System.out.println(cat4.equals(cat5));

        Set<Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);

        printSet(cats);
        System.out.println("----------------------------------------------------------");
        printSet(findByColor("Рыжий", cats));


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Вопрос");
//        String answer = scanner.nextLine();
//        while(!answer.equals("5")){
//
//        }
//        //делаем выборку
    }

    static Set<Cat> findByColor(String color, Set<Cat> cats){
        Set<Cat> res = new HashSet<>();
        for(Cat cat: cats){
            if(cat.color.equals(color)){
                res.add(cat);
            }
        }
        return res;
    }

    static void printSet(Set<Cat> cats){
        for(Cat cat: cats){
            System.out.println(cat);
        }
    }
}
