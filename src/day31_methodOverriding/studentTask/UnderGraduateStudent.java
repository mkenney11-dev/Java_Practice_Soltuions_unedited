package day31_methodOverriding.studentTask;

public class UnderGraduateStudent extends Student {

    public UnderGraduateStudent(String name, int age, char gender, String studentID, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender, studentID, fieldOfStudy, schoolName, grade);
    }

    @Override
    public void study() {
        System.out.println(getName() + " studies as an undergraduate student");
    }

}
