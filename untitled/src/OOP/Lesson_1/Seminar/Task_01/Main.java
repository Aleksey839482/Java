package OOP.Lesson_1.Seminar.Task_01;

import OOP.Lesson_1.Seminar.Task_01.machine.VendingMachine;
import OOP.Lesson_1.Seminar.Task_01.product.Battle;
import OOP.Lesson_1.Seminar.Task_01.product.Product;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        Product product1 = new Product("twix", 80);
        Product product2 = new Battle("cola", 100, 2);
        Product product3 = new Product("lays", 120);

        vendingMachine.add(product1);
        vendingMachine.add(product2);
        vendingMachine.add(product3);

        System.out.println(vendingMachine);
    }
}
