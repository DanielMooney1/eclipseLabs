package lab7;

public class Cat extends Animal {
    
    public  Cat (String name,int age, char sex)
    {
        super(name, age ,sex);
    }
    public void makeSound() {
        System.out.println(name + "is pouring...");
    }
}