package Lesson_5.Seminar.Task_01;

import java.util.HashMap;
import java.util.Map;

public class Passport {
    Map<String, String> passport = new HashMap<>();

    public void add(String numpPassport, String name){
        passport.put(numpPassport, name);
    }
    public String getallRecords(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Паспорт: \n");
        for (Map.Entry<String,String> entry: passport.entrySet()){
            stringBuilder.append(entry);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    public String findByName(String name){
        StringBuilder stringBuilder = new StringBuilder();
        for (String key: passport.keySet()){
            if (passport.get(key).equalsIgnoreCase(name)) {
                stringBuilder.append(key);
                stringBuilder.append(": ");
                stringBuilder.append(passport.get(key));
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
}
