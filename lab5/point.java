package lab5;

public class point {
    
    protected int x;
	protected int y;
	private int radius;

	public point () // constructor
	{
		setX(x);
        setX(y);
	}
	
	public point (int theX,int theY, int theRadius) // constructor
	
	{
		setX(theX);
        setY(theY);
		
	}
	public void setX (int theX)
	
	{
		x = theX;
	}
	public void setY (int theY)
	{
		y = theY;
	}
	public void setRadius(int theRadius)
	{
		radius = theRadius;
	}

	public int getX ()
	{
		return x;
	}
	
	public int getY()
	
	{
		return y;
	}
	public String toString ()
	
	{
		String myString;
		
		myString = "";
		myString += "X position: " + x;
		myString += "y position: " + y;
		myString += "radius position: " + radius;
		return myString;
	}
}
