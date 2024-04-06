package Lesson_6.DZ;

import Lesson_6.Seminar.Cat;

import java.util.*;

/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
отвечающие фильтру. Критерии фильтрации можно хранить в Map.
Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
5 - поиск
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно
также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.

Работу сдать в виде ссылки на гит репозиторий

Частые ошибки:
1. Заставляете пользователя вводить все существующие критерии фильтрации
2. Невозможно использовать более одного критерия фильтрации одновременно
3. При выборке выводятся ноутбуки, которые удовлетворяют только одному фильтру, а не всем введенным пользователем
4. Работа выполнена только для каких то конкретных ноутбуков, и если поменять характеристики ноутбуков
или добавить еще ноутбук, то программа начинает работать некорректно
 */
public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();          Laptop laptop2 = new Laptop();
        laptop1.ozu = 4;                        laptop2.ozu = 8;
        laptop1.ssd = 256;                      laptop2.ssd = 500;
        laptop1.os = "dos";                     laptop2.os = "windows";
        laptop1.color = "черный";               laptop2.color = "серый";
        laptop1.manufacturer = "HP";            laptop2.manufacturer = "DEXP";

        Laptop laptop3 = new Laptop();          Laptop laptop4 = new Laptop();
        laptop3.ozu = 16;                       laptop4.ozu = 4;
        laptop3.ssd = 1000;                     laptop4.ssd = 128;
        laptop3.os = "windows";                 laptop4.os = "windows";
        laptop3.color = "красный";              laptop4.color = "синий";
        laptop3.manufacturer = "MSI";           laptop4.manufacturer = "Digma";

        Laptop laptop5 = new Laptop();          Laptop laptop6 = new Laptop();
        laptop5.ozu = 36;                       laptop6.ozu = 8;
        laptop5.ssd = 2000;                     laptop6.ssd = 500;
        laptop5.os = "macOC";                   laptop6.os = "linux";
        laptop5.color = "белый";                laptop6.color = "серый";
        laptop5.manufacturer = "Apple";         laptop6.manufacturer = "Dell";

        Laptop laptop7 = new Laptop();          Laptop laptop8 = new Laptop();
        laptop7.ozu = 8;                        laptop8.ozu = 4;
        laptop7.ssd = 256;                      laptop8.ssd = 128;
        laptop7.os = "dos";                     laptop8.os = "windows";
        laptop7.color = "черный";               laptop8.color = "салатовый";
        laptop7.manufacturer = "Lenovo";        laptop8.manufacturer = "Aser";

        Laptop laptop9 = new Laptop();          Laptop laptop10 = new Laptop();
        laptop9.ozu = 16;                       laptop10.ozu = 64;
        laptop9.ssd = 1000;                     laptop10.ssd = 2000;
        laptop9.os = "linux";                   laptop10.os = "windows";
        laptop9.color = "белый";                laptop10.color = "голубой";
        laptop9.manufacturer = "Dell";          laptop10.manufacturer = "ASUS ROG";

        Set<Laptop> laptops = new HashSet<>();
        laptops.add(laptop1);                   laptops.add(laptop2);
        laptops.add(laptop3);                   laptops.add(laptop4);
        laptops.add(laptop5);                   laptops.add(laptop6);
        laptops.add(laptop7);                   laptops.add(laptop8);
        laptops.add(laptop9);                   laptops.add(laptop10);

        Map<String, String> parametr = new HashMap<>();
        Laptop laptopParametr = new Laptop();
        Scanner scanner = new Scanner(System.in);
        String menu = "Введите критерии для поиска ноутбука: \n" +
                "0.Посмотреть список имеющихся ноутбуков в магазине" +
                "\n1.ОЗУ;\n2.Объем SDD;\n3.Операционная система;\n4.Цвет" + "\n5.Производитель." +
                "\n\nДля самого поиска по введенным параметрам введите 6.";
        System.out.println(menu);
        String answer = scanner.nextLine();
        while (!answer.equals("6")) {
            if (answer.equals("1")) {
                System.out.println("Введите объем ОЗУ в Гб:");
                String answer1 = scanner.nextLine();
                parametr.put("ОЗУ(Гб): ", answer1);
                laptopParametr.ozu = Integer.parseInt(parametr.get("ОЗУ(Гб): "));
            }
            if (answer.equals("2")) {
                System.out.println("Введите объем SSD в Гб:");
                String answer1 = scanner.nextLine();
                parametr.put("SSD(Гб): ", answer1);
                laptopParametr.ssd = Integer.parseInt(parametr.get("SSD(Гб): "));
            }
            if (answer.equals("3")) {
                System.out.println("Введите операционную систему: ");
                String answer1 = scanner.nextLine();
                parametr.put("Операционная система: ", answer1);
                laptopParametr.os = parametr.get("Операционная система: ");
            }
            if (answer.equals("4")) {
                System.out.println("Введите цвет ноутбука:");
                String answer1 = scanner.nextLine();
                parametr.put("Цвет: ", answer1);
                laptopParametr.color = parametr.get("Цвет: ");
            }
            if (answer.equals("5")) {
                System.out.println("Введите производителя:");
                String answer1 = scanner.nextLine();
                parametr.put("Производитель: ", answer1);
                laptopParametr.manufacturer = parametr.get("Производитель: ");
            }
            if (answer.equals("0")){
                printSet(laptops);
            }
            System.out.println("Введите еще критерии, если хотите:\n" +
                    "0.Посмотреть список имеющихся ноутбуков в магазине" +
                    "\n1.ОЗУ;\n2.Объем SDD;\n3.Операционная система;\n4.Цвет" + "\n5.Производитель" +
                    "\n\nЕсли никаких больше параметров не нужно введите 6.");
            answer = scanner.nextLine();

        }
        printSet(findByParametrs(laptopParametr, laptops));
    }

    static void printSet(Set<Laptop> laptops){
        for(Laptop laptop: laptops){
            System.out.println(laptop);
        }
    }

    static Set<Laptop> findByParametrs(Laptop laptopParametr, Set<Laptop> laptops){
        Set<Laptop> res = new HashSet<>();
        for(Laptop laptop: laptops){
            if(laptop.ozu == laptopParametr.ozu){
                res.add(laptop);
            }
            if(laptop.ssd == laptopParametr.ssd){
                res.add(laptop);
            }
            if(laptop.os.equals(laptopParametr.os)){
                res.add(laptop);
            }
            if(laptop.color.equals(laptopParametr.color)){
                res.add(laptop);
            }
            if(laptop.manufacturer.equals(laptopParametr.manufacturer)){
                res.add(laptop);
            }
        }
        return res;
    }
}
