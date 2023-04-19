package part2_1;

public class Animal {
    private String name;
    private int age;

    Animal(String name, int age){
        setName(name);
        setAge(age);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void makeSound(){
        System.out.println("The animal is making a sound");
    }

    // Part 2.1.4 demonstrating overloading
    public void makeSound(int volume) {
        System.out.println("The animal is making a sound at volume " + volume);
    }
}
