package lab4;

public class office {

	private int employee;
	private static int roomNumber = 100;
    private int nextRoom;

	public office () 
	{
        if(employee > 2 )
        {
	       roomNumber = nextRoom++;
        }	
	}
	
	public office (int theEmployee, int TheRoomNumber, int thenextRoom ,int newEmployee) 
	{
		employee = theEmployee;
		roomNumber = TheRoomNumber;
		nextRoom = thenextRoom;	
        
        if(employee > 2)
        {
            employee = newEmployee;
            roomNumber = nextRoom;
        }
	}
	public void setEmployee (int theEmployee)
	{
		employee = theEmployee;
	}
	public void setRoomNumber (int theRoomNumber)
	{
		roomNumber = theRoomNumber;
	}
	public void setNextRoom(int theNextRoom)
	{
		nextRoom = theNextRoom;
	}
	public int getEmployee ()
	{
		return employee;
	}
	
	public int getroomNumber ()
	{
		return roomNumber;
	}
	
	public int getNextRoom()
	{
		return nextRoom;
	}

	
	public String printEmployeeDetails ()
	
	{
		String myString;
		
		myString = "";
		myString += "employee: " + employee;
		myString += "room number: " + roomNumber;
		myString += "next room number:  " + nextRoom;
		return myString;
	
	}
}
