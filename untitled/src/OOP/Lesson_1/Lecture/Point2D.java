package OOP.Lesson_1.Lecture;

/**
 * Класс точка 2D
 */
public class Point2D {
    private int x, y;

    /**
     * Конструктор
     * @param valueX координата X
     * @param valueY координата Y
     */
    public Point2D(int valueX, int valueY){ //3
        x = valueX;
        y = valueY;
    }
    public Point2D(int value){  //2
        this(value, value);
    }
    public Point2D(){           //1
        this(0);
    }
//    public Point2D(){
//        x = 0;
//        y = 0;
//    }
//    public Point2D(int value){
//        x = value;
//        y = value;
//    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int value){
        this.x = value;
    }
    public void setY(int value){
        this.y = value;
    }
    private String getInfo(){                       // приватный метод, не может использоваться дольше этого файла
        return String.format("x: %d; y: %d", x, y);
    }

    @Override
    public String toString() {
        return getInfo();
    }
    static double distance(Point2D a, Point2D b){
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }
}
