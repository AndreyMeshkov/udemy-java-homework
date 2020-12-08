package homework.homework5.task2;

public class Student {
    int studentId;
    String name;
    String surname;
    short course;
    float averageMath;
    float averageEconomics;
    float averageForeignLanguage;
    void info(Student student){
        System.out.println("student " + student.name + " " +student.surname + " has average grade " + (student.averageMath + student.averageEconomics + student.averageForeignLanguage) / 3);
    }
}

class StudentTest{
    public static void main(String[] args) {
        homework.homework5.task2.Student student1 = new homework.homework5.task2.Student();
        student1.studentId = 12345;
        student1.name = "Petr";
        student1.surname = "Petrov";
        student1.course = 2;
        student1.averageMath = 4.5f;
        student1.averageEconomics = 4.3f;
        student1.averageForeignLanguage = 4.1f;
        student1.info(student1);

        homework.homework5.task2.Student student2 = new homework.homework5.task2.Student();
        student2.studentId = 12346;
        student2.name = "Ivan";
        student2.surname = "Ivanov";
        student2.course = 3;
        student2.averageMath = 4.3f;
        student2.averageEconomics = 4.8f;
        student2.averageForeignLanguage = 4.7f;
        student2.info(student2);


        homework.homework5.task2.Student student3 = new homework.homework5.task2.Student();
        student3.studentId = 12347;
        student3.name = "Klim";
        student3.surname = "Klimov";
        student3.course = 4;
        student3.averageMath = 4.0f;
        student3.averageEconomics = 4.2f;
        student3.averageForeignLanguage = 4.9f;
        student3.info(student3);
    }
}
