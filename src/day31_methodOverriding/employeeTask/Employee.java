package day31_methodOverriding.employeeTask;

import day31_methodOverriding.studentTask.Person;

public class Employee extends Person {

    private String id, jobTitle, companyName;
    private double salary;

    public Employee(String name, int age, char gender, String id, String jobTitle, String companyName, double salary) {
        super(name, age, gender);
        setId(id);
        setJobTitle(jobTitle);
        setCompanyName(companyName);
        setSalary(salary);
    }

    @Override
    public void setAge(int age) {
        if(age <= 0){
            System.err.println("Invalid age " + age);
            System.exit(1);
        } else if(age < 18){
            System.out.println("Age should be not less than 18");
            System.exit(1);
        }
        super.setAge(age);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 0){
            System.err.println("Invalid salary " + salary);
            System.exit(1);
        }
        this.salary = salary;
    }

    public void work(){
        System.err.println(getName() + " is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString().replace("}", "") +
                "id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                '}';
    }


}
