public class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void printing() {
        System.out.println("----------------------------");
        System.out.println("Name:" + super.getName());
        System.out.println("Age:" + super.getAge());
        System.out.println("Grade:" + grade);
        System.out.println("----------------------------");
    }
}