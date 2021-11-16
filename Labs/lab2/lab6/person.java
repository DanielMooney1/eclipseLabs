package lab6;

public class person {
	   // Variables
	   private String name;
	   private String address;
	   
	   // Constructors
	   public person(String name, String address) {
	      this.name = name;
	      this.address = address;
	   }
	   
	   // Getters & Setters
	   public String getName() {
	      return name;
	   }
	   public String getAddress() {
	      return address;
	   }
	   //toString
	   public String toString() {
	      return name + "(" + address + ")";
	   }
	}