package day31_methodOverriding.employeeTask;

public class Teacher extends Employee {

    public Teacher(String name, int age, char gender, String id, String jobTitle, String companyName, double salary) {
        super(name, age, gender, id, jobTitle, companyName, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is teaching");
    }
}
