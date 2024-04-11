package API.Lesson_6.DZ;

import java.util.Objects;

public class Laptop {
    int ozu;
    int ssd;
    String os;
    String color;
    String manufacturer;


    @Override
    public String toString() {
        return "Производитель: " + manufacturer + "\nЦвет: " + color + "\nОЗУ(Гб): " + ozu +
                "\nSSD(Гб): " + ssd + "\nОперационная система: " + os +
                "\n***********************************************\n";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj instanceof Laptop laptop){
            return ozu == laptop.ozu && ssd == laptop.ssd &&
                    color.equals(laptop.color) && os.equals(laptop.os) && manufacturer.equals(laptop.manufacturer);
        }
        return false;
    }
    @Override
    public int hashCode() {
        return ozu + 11*ssd + 7*color.hashCode() +
                9*os.hashCode() + 13*manufacturer.hashCode();
    }


}
