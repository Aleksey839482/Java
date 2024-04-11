package API.Lesson_2;

/*
Напишите метод, который принимает на вход строку (String) и
определяет является ли строка палиндромом (возвращает boolean значение).
 */

public class Seminar_task03 {
    public static void main(String[] args) {
        String text = "А роза упала на лапу Азора";
        System.out.println(isPalindrom1(text));
        System.out.println(isPalindrom2(text));
    }
    static String fixString(String text){
        return text.toLowerCase().replace(" ", "");  //Переводим в нижний регистр и убираем пробелы
    }
    static boolean isPalindrom1(String text){
        text = fixString(text);
        for (int i = 0; i < text.length()/2; i++) {
            if (text.charAt(i) != text.charAt(text.length()-1 -i)){
                return false;
            }
        }
        return true;
    }
    static boolean isPalindrom2(String text){
        text = fixString(text);
        StringBuilder stringBuilder = new StringBuilder(text);
        stringBuilder.reverse();
        return stringBuilder.toString().equals(text);
    }
}
