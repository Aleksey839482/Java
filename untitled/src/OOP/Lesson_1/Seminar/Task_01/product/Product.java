package OOP.Lesson_1.Seminar.Task_01.product;

public class Product {
    private final String name;
    private final double cost;

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
    public String getName() {
        return name;
    }
    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "name: " + name + ", cost: " + cost + "р.";
    }
}
