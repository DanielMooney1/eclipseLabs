package itcarlow.lab2;

public class Rectangle
 {
     private double length;
     private double width;
    

public Rectangle(double newLength,Double newWidh) 
{
    newLength = 1.0;
    newWidh = 1.0;
}
    public double getLength()
	{
		return length;
	}
	
	public void setLength(Double newLength)
	{
	    if(newLength >= 0  && newLength <=40.0)
        {
            this.length = newLength;
        }
		else
        {
            System.out.println("this length is not within the needed amount");
        }
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public void setWidth(Double newWidth)
	{
        if(newWidth >= 0  && newWidth <=40.0)
        {
            this.width = newWidth;
        }
		else
        {
            System.out.println("this width is not within the needed amount");
        }
	}
    public String toString(double lengths,double widths)
    {
        String size = "";
        length = lengths;
        width = widths;
        System.out.println("the length is" + length + "the width is " + width);
        return size;
    }

}
