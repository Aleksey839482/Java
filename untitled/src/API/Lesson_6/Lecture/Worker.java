package API.Lesson_6.Lecture;

public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        String format = String.format("%id %fn %ln %s", id, firstName, lastName, salary);
        return format;
    }
}
