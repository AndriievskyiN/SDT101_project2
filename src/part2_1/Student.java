package part2_1;

public class Student extends Person {
    private String schoolName;

    public Student() {
        // Even if we don't explicitly call super(), the default constructor of the parent class is called implicitly.
        System.out.println("Student default constructor called.");
    }

    public Student(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
        System.out.println("Student constructor with parameters called.");
    }
}