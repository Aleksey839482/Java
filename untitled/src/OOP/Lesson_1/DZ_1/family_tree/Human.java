package OOP.Lesson_1.DZ_1.family_tree;

import java.time.LocalDate;
import java.util.List;

public class Human {
    String name;
    LocalDate dob, dod;
    Gender gender;
    Human father, mother;
    List<Human> children;

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }
}
