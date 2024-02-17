
import controller.Controller;
import model.StudyGroup;
import model.Student;
import model.Teacher;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Student student = controller.createStudent(new Student("Иван", "Иванов", 1998));
        Student student2 = controller.createStudent(new Student("Петр", "Петров", 1999));
        Student student3 = controller.createStudent(new Student("Михаил", "Крутов", 1999));
        Student student4 = controller.createStudent(new Student("Алексей", "Смирнов", 2001));
        Teacher teacher = controller.createTeacher(new Teacher("Константин", "Сидоров", 1984));
        Teacher teacher2 = controller.createTeacher(new Teacher("Дмитрий", "Веселов", 1971));
        StudyGroup group123 = controller.createGroup(123, teacher, student, student2);
        StudyGroup group413 = controller.createGroup(413, teacher2, student3, student4);
        System.out.println(group123.toString());
        System.out.println(group413.toString());

        // controller.printStudents(student);
        // System.out.println(controller.returnStudents());
    }
}