package service;

import model.StudyGroup;
import model.Student;
import model.Teacher;

import java.util.ArrayList;

public class GroupService {

    public StudyGroup CreateGroup(Integer num, Teacher teacher, Student... students) {
        ArrayList<Student> listStudents = new ArrayList<>();
        for (Student student : students) {
            listStudents.add(student);
        }
        return new StudyGroup(num, teacher, listStudents);
    }
}