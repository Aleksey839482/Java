package API.Lesson_1.HW.HW_01;

class Answer {
    public int countNTriangle(double n){
        return (int) (n / 2 * (n + 1));
    }
}
public class Printer{
    public static void main(String[] args) {
        double n = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            n = 5;
        }
        else{
            n = Integer.parseInt(args[0]);
        }

        // Вывод результата на экран
        Answer ans = new Answer();
        int itresume_res = ans.countNTriangle(n);
        System.out.println(itresume_res);
    }
}
