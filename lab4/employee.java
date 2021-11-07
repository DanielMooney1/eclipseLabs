package lab4;

class Employee
{
	private String name;
	private String employeeId;
	private int age;
	public Employee () 
	{
		
	}
	public Employee (String theName, String theID, int theAge) 
	{
		name = theName;
		employeeId = theID;
		age = theAge;
		
	}
	public void setName (String theName)
	{
		name = theName;
	}
	public void setId (String theId)
	{
		employeeId = theId;
	}
	public void setAge (int theAge)	
	{
		age = theAge;
	}
	
	public String getName ()
	{
		return name;
	}
	public String getId ()
	{
		return employeeId;
	}
	
	public int getAge ()
	
	{
		return age;
	}

	
	public String toString ()
	
	{
		String myString;
		
		myString = "";
		myString += "Name :: " + name;
		myString += "ID   :: " + employeeId;
		myString += "age  :: " + age;
		
		return myString;
    }
}
	