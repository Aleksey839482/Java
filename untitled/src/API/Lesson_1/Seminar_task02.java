package API.Lesson_1;
/*
Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
максимальное количество подряд идущих 1.
 */

public class Seminar_task02 {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        System.out.println(getCount(arr));
    }

    static int getCount(int[] arr){
        int count = 0;
        int maxCont = 0;
        for (int item: arr) {
            if (item == 1) {
                count++;
                if (maxCont < count) {
                    maxCont = count;
                }
            } else {
                count = 0;
            }
        }
        return maxCont;
    }
}
