package part2_1;

public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("Person default constructor called.");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor with parameters called.");
    }
}