package part2_1;

public class Main {
    public static void main(String[] args) {
        // 2.1.1 Create a superclass, subclass which inherits the superclass, create an instance of the subclass
        System.out.println("Part 2.1.1");
        Dog dog = new Dog("Charlie", 2, "German Shepherd");
        System.out.println(dog);

        // 2.1.2 Demonstrate possibility to create instance of subclass while declaring it as of type of superclass
        // (SuperClass a = new SubClass()).
        System.out.println();
        System.out.println("Part 2.1.2");
        Animal a = new Dog("Jack" , 3, "German Shepherd");
        a.makeSound();
        System.out.println(a.getClass());

        // When we create an instance of a subclass and assign it to a variable of the superclass type,
        // it's called "upcasting". It won't error because a subclass is a type of its superclass,
        // which means it has all of the superclass's attributes and methods plus its own additional ones.
        // Therefore, an instance of the subclass can be treated as an instance of the superclass.

        // 2.1.3 Create instance variables for superclass with different access modifiers: private, protected, public.
        // Demonstrate ability to access superclass instance variables inside of the child class methods.
        // Create explanation comment when you have no access to superclass member.
        System.out.println();
        System.out.println("Part 2.1.3");
        ChildClass c = new ChildClass();
        c.printSuperVars();

        // 2.14 Write and call overloaded methods. Demonstrate overloading inside
        // the same class and overloading implemented in inherited class (Do not confuse overloading with overriding).
        // Demonstrate a call of the overloaded methods.
        System.out.println();
        System.out.println("Part 2.1.4");
        Animal animal = new Animal("Bob", 5);
        Dog dog2 = new Dog("Rufus", 3, "Labrador");

        animal.makeSound();
        animal.makeSound(10);

        dog2.makeSound();
        dog2.makeSound(8);

        // 2.1.5 Already showed overriding in the Dog class

        // 2.1.6 Use of super keyword. Demonstrate ability to call overridden method (method of the superclass)
        // inside the overriding method (method of the child class) using super keyword.
        System.out.println();
        System.out.println("Part 2.1.6");
        Vehicle v = new Vehicle("Ford", "F-150");
        v.start();

        Car car = new Car("Toyota", "Corolla", 4);
        car.start();

        // 2.1.7 Use of super keyword for parent constructor call. Demonstrate ability to call superclass constructor
        // inside the child class constructor using super() call.
        //– prove by code that default superclass constructor is called even when no direct superclass constructor call present
        //– demonstrate call of non-default superclass constructor
        System.out.println();
        System.out.println("Part 2.1.7");
        Student student1 = new Student();
        Student student2 = new Student("Jake", 20, "AUK");

        // 2.1.8 Demonstrate abstract classes and methods.
        //Now make the superclass extending another abstract class: SuperClass extends MyAbstractClass.
        // Add declaration of that class.
        //Add abstract method for the abstract class.
        //Implement the method in inherited class.
        MySuperClass mySuperClass = new MySuperClass();
        mySuperClass.abstractMethod();
    }
}