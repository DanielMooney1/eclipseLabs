package lab7;
public class Cow extends Animal{

    public Cow(String name,int age, char sex)
    {
        super(name, age ,sex);
    }
    public void MakeSound() {
        System.out.println(name + "is mooing");
    }
    
}
