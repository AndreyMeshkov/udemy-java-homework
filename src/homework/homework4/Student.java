package homework.homework4;

public class Student {
    int studentId;
    String name;
    String surname;
    short course;
    float averageMath;
    float averageEconomics;
    float averageForeignLanguage;
}

class StudentTest{
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentId = 12345;
        student1.name = "Petr";
        student1.surname = "Petrov";
        student1.course = 2;
        student1.averageMath = 4.5f;
        student1.averageEconomics = 4.3f;
        student1.averageForeignLanguage = 4.1f;
        System.out.println("student " + student1.name + " " +student1.surname + " has average grade " + (student1.averageMath + student1.averageEconomics + student1.averageForeignLanguage) / 3);

        Student student2 = new Student();
        student2.studentId = 12346;
        student2.name = "Ivan";
        student2.surname = "Ivanov";
        student2.course = 3;
        student2.averageMath = 4.3f;
        student2.averageEconomics = 4.8f;
        student2.averageForeignLanguage = 4.7f;
        System.out.println("student " + student2.name + " " +student2.surname + " has average grade " + (student2.averageMath + student2.averageEconomics + student2.averageForeignLanguage) / 3);

        Student student3 = new Student();
        student3.studentId = 12347;
        student3.name = "Klim";
        student3.surname = "Klimov";
        student3.course = 4;
        student3.averageMath = 4.0f;
        student3.averageEconomics = 4.2f;
        student3.averageForeignLanguage = 4.9f;
        System.out.println("student " + student3.name + " " +student3.surname + " has average grade " + (student3.averageMath + student3.averageEconomics + student3.averageForeignLanguage) / 3);
    }
}
