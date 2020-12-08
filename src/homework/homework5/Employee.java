package homework.homework5;

public class Employee {
    Employee(int i, String sn, byte a, float s, String d){
        id = i;
        surname = sn;
        age= a;
        salary = s;
        department = d;
    }
    int id;
    String surname;
    byte age;
    float salary;
    String department;
    void doubleSalary(){
        salary *= 2;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee worker1 = new Employee(1, "Ivanov", (byte) 23,450.1f,"management");
        Employee worker2 = new Employee(2,"Petrov", (byte) 44,560.78f,"marketing");
        worker1.doubleSalary();
        worker2.doubleSalary();
        System.out.println(worker1.surname + "'s new salary " + worker1.salary);
        System.out.println(worker2.surname + "'s new salary " + worker2.salary);
    }
}
