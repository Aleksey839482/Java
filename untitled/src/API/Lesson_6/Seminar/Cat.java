package API.Lesson_6.Seminar;

import java.util.Objects;

public class Cat {
    int age;
    String name;
    String owner;
    boolean sterilization;
    String color;

    @Override                   // Аннотация важна для кода, проверяет что вы не опечатались
    public String toString() {
        return "Кличка: " + name + ", Имя хозяина: " + owner + ", Возраст: " + age
                + ", Стерилизация: " + sterilization + ", Цвет: " + color;    // super делает ссылку на родительский класс(Object)
    }

//    @Override
//    public String toString() {            // Сгенерировано автоматом
//        return "Cat{" +
//                "age=" + age +
//                ", name='" + name + '\'' +
//                ", owner='" + owner + '\'' +
//                ", sterilization=" + sterilization +
//                ", color='" + color + '\'' +
//                '}';
//    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj instanceof Cat cat){
//            Cat cat = (Cat) obj;
            return age == cat.age && name.equals(cat.name) && owner.equals(cat.owner) &&
                    sterilization == cat.sterilization && color.equals(cat.color);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return age + 7*name.hashCode() + 11*owner.hashCode() + 13*Objects.hashCode(sterilization) + 17*color.hashCode();
        //10+5+6+1+10=32
    }
}
