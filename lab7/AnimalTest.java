package lab7;

public class AnimalTest {
	public static void main (String args[])
	{
		Animal dog = new Dog("Poodle", 4, 'M');
		System.out.println(dog);
		dog.eat();
		dog.sleep();
		dog.makeSound();
		
		System.out.println();
		
		Animal cat = new Cat("Tom", 2, 'F');
		System.out.println(cat);
		cat.eat();
		cat.sleep();
		cat.makeSound();

		System.out.println();

		Animal cow = new Cow("Daisy", 3, 'F');
		System.out.println(cow);
		cow.eat();
		cow.sleep();
		cow.makeSound();

        Vet vet = new Vet("alice Ryan");
        vet.vaccinate(dog);
        vet.vaccinate(cat);
        vet.vaccinate(cow);
		}
}
