package API.Lesson_4;

public class MyStack {
    private int[] arr = new int[10];    //Поле класса, видны только в этом классе
    private int size = 0;

    int size(){    // Число
        return size;
    }
    boolean empty(){    // Логический
        return size == 0;
    }
    void push(int elem){    // Метод с помощью которого добавляется элемент в коллекцию
        arr[size++] = elem;
    }
    int peek(){    // Позволяет посмотреть элемент на верхушке стека т.е. последний добавленный
        return arr[size - 1];
    }
    int pop(){    // Показывает и удаляет последний добавленный элемент стека
        return arr[--size];
    }
}
