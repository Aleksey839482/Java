package Lesson_4.HW_02;
/*
В классе MyQueue реализуйте очередь для типа данных Integer с помощью LinkedList со следующими методами:

enqueue() - помещает элемент в конец очереди
dequeue() - возвращает первый элемент из очереди и удаляет его
first() - возвращает первый элемент из очереди, не удаляя
getElements() - возвращает все элементы в очереди

 */
import java.util.LinkedList;


class MyQueue<T> {
    // Напишите свое решение ниже
    public MyQueue() {

    }
    private LinkedList elements = new LinkedList<>();
    public MyQueue(LinkedList<T> elements) {
        this.elements = elements;
    }
    public void enqueue(T element){
        // Напишите свое решение ниже
        elements.add(element);
    }

    public T dequeue(){
        // Напишите свое решение ниже
        T first = (T) elements.getFirst();
        elements.removeFirst();
        return first;
    }

    public T first(){
        // Напишите свое решение ниже
        T first = (T) elements.getFirst();
        return first;
    }

    public LinkedList<T> getElements() {
        // Напишите свое решение ниже
        return elements;
    }
    public void setElements(LinkedList<T> elements) {
        this.elements = elements;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(45);
            queue.enqueue(2);
            queue.enqueue(6);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}
