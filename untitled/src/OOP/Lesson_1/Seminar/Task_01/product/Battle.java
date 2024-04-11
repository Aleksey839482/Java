package OOP.Lesson_1.Seminar.Task_01.product;

public class Battle extends Product{
    private final double volume;

    public Battle(String name, double cost, double volume) {
        super(name, cost);
        this.volume = volume;
    }
    public double getVolume(){
        return volume;
    }

    @Override
    public String toString() {
        return super.toString() + ", volume: " + volume + " л";
    }
}
