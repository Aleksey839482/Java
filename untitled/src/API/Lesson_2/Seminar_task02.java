package API.Lesson_2;

/*
Напишите метод, который сжимает строку.
Пример: вход aaaabbbcdd.
Результат: a4b3cd2
 */

public class Seminar_task02 {
    public static void main(String[] args) {
        String st = "aaaabbbcddtttt";
        System.out.println(compression(st));
    }
    static String compression(String st){
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        for (int i = 1; i < st.length(); i++) {
            if (st.charAt(i) == st.charAt(i - 1)){                  //charAT позволяет проверят символ по индксу
                count++;
            } else {
                stringBuilder.append(st.charAt(i-1));               //append.charAT добавляет символ по индксу
                if (count > 1) {
                    stringBuilder.append(count);
                    count = 1;
                }
            }

        }
        stringBuilder.append(st.charAt(st.length()-1));
        if (count > 1) {
            stringBuilder.append(count);
        }
        return stringBuilder.toString();

    }
}
