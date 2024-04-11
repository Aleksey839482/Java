package API.Lesson_3;

/*
Каталог товаров книжного магазина сохранен в виде двумерного
списка List<ArrayList<String>> так, что на 0й позиции каждого
внутреннего списка содержится название жанра, а на остальных
позициях - названия книг. Напишите метод для заполнения данной
структуры.

Роман - Унесенные ветром
Фэнтези - Гарри Поттер

[
    ["Роман", "Мастер и Маргарита", "Война и мир", "Унесенные ветром"],
    ["Сказки", "Колобок", "Золотой ключик"],
    ["Фэнтези", "Гарри Поттер"]

 */

import java.util.ArrayList;
import java.util.List;

public class Seminar_task02 {
    public static void main(String[] args) {
        List<List<String>> shopBook = new ArrayList<>();
        addBook(shopBook, "Сказка", "Золотой ключик");
        addBook(shopBook, "Роман", "Война и мир");
        addBook(shopBook, "Фэнтези", "Гарри Поттер");
        addBook(shopBook, "Сказка", "Колобок");
        addBook(shopBook, "Роман", "Мастер Маргарита");

        System.out.println(shopBook);
    }
    static void addBook(List<List<String>> shopBook, String ganre, String nameBook){
        for (List<String> bookshelf : shopBook) {
            if (bookshelf.getFirst().equals(ganre)) {
                bookshelf.add(nameBook);
                return;
            }

        }
        List<String> bookshelf = new ArrayList<>();
        bookshelf.add(ganre);
        bookshelf.add(nameBook);
        shopBook.add(bookshelf);
    }
}
