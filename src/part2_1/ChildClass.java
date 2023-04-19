package part2_1;

public class ChildClass extends SuperClass {
    void printSuperVars() {
        //System.out.println(privateVar); // Error: cannot access privateVar
        System.out.println(protectedVar); // Accessible, but only in this class, it is not accessible in other classes
        System.out.println(publicVar); // Accessible
    }
}