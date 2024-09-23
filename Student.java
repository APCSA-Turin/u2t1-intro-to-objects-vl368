public class Student {
    
    private String name;
    private int grade;

    public Student(String studentName, int studentGrade) {
        name = studentName;
        grade = studentGrade;
    }

    public void introduce() {
        System.out.println("My name is " + name + ". I am in " + grade + " grade.");
    }
}
