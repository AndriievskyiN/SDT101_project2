package part2_1;

public class Dog extends Animal{
    private String breed;

    Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound(){
        System.out.println("The dog is barking");
    }

    // Part 2.1.4 demonstrating overloading
    @Override
    public void makeSound(int volume) {
        System.out.println("The dog is barking at volume " + volume);
    }

    @Override
    public String toString(){
        String name = getName();
        int age = getAge();
        return "This is a dog of breed: " + breed + ", its name is " + name + " and it is " + age + " years old";
    }
}
