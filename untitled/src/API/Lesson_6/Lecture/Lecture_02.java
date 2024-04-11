package API.Lesson_6.Lecture;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Lecture_02 {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.firstName = "Name_1";
        w1.lastName = "LastName_1";
        w1.salary = 100;
        w1.id = 1000;

        Worker w3 = new Worker();
        w3.firstName = "Name_3";
        w3.lastName = "LastName_3";
        w3.salary = 300;
        w3.id = 3000;

        Worker w4 = new Worker();
        w4.firstName = "Name_1";
        w4.lastName = "LastName_1";
        w4.salary = 100;
        w4.id = 1000;

        System.out.println(w1);
        System.out.println(w3);
        System.out.println(w4);

        System.out.println(w1 == w4);
//        var workers = new HashMap<Worker>(Arrays.asList(w1, w3));
//        System.out.println(workers.containsKey(w4));
    }
}
