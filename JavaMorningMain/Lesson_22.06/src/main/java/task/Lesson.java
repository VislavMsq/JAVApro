package task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lesson  {
    public static void main(String[] args) {
        Map<String,Boolean> student = new HashMap<>();
        student.put("Bill", false);
        student.put("Kate", true);
        student.put("John", true);
        student.put("Clark", false);

        System.out.println(getNameStudent(student));
/*
- У вас есть Map<String, Boolean>, представляющая студентов и их оценки
(true - сдал экзамен, false - не сдал).
Напишите функцию, которая находит и возвращает имена студентов, не сдавших экзамен.
*/
    }
    public static List<String> getNameStudent(Map<String, Boolean> student){
        List<String> list = new ArrayList<>();
        for (Map.Entry<String,Boolean> entry : student.entrySet()){
            if(!entry.getValue()){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}
