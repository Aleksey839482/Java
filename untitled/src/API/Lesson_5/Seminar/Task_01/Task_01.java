package API.Lesson_5.Seminar.Task_01;

/*
Создать структуру для хранения Номеров паспортов и Фамилий
сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов

Вывести данные по сотрудникам с фамилией Иванов.
 */
public class Task_01 {
    public static void main(String[] args) {
        Passport passport = new Passport();
        passport.add("123456", "Иванов");
        passport.add("321456", "Васильев");
        passport.add("234561", "Петрова");
        passport.add("234432", "Иванов");
        passport.add("654321", "Петрова");
        passport.add("345678", "Иванов");

        System.out.println(passport.findByName("Иванов"));
        System.out.println(passport.getallRecords());

    }
}
