package lab5;

public class myCircle {

    private int radius;

    public myCircle () // constructor
	{
	   setRadius(radius);
	}
	
	public myCircle (int theRadius) // constructor
	{
		setRadius(theRadius);
		
	}
    
    public void setRadius(int theRadius)
	{
		radius = theRadius;
	}
    public int getRadius ()
	
	{
		return radius;
	}
    public String toString ()
	
	{
		String myString;
		
		myString = "";
		myString += "radius position: " + radius;
		return myString;
	}
    
}
