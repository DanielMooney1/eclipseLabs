package lab7;

public class Vet {
    private String name;

    public Vet(String name)
    {
        this.name = name;
    }
    public void vaccinate(Animal animal)
    {
       System.out.println(name + " is vaccinated");

       if(animal instanceof Dog)
       {
           System.out.println("Dog has been vaccinated" + animal);
       }
       else if (animal instanceof Cat)
       {
        System.out.println("Cat has been vaccinated" + animal);
       }
       else 
       {
        System.out.println("cant vaccinate anything other than dogs or cats!");

       }
    }
    
}
