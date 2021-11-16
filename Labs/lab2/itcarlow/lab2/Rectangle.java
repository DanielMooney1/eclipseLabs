package itcarlow.lab2;

public class Rectangle
 {
     private double length;
     private double width;

    
 public Rectangle()
 {
     setLength(length);
     setWidth(width);
 }  

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
    public double getArea()
    {
        double area;
        area = width * length;
        return area;
    }
    public double getPerimeter()
    {
        double perimeter;
        perimeter = 2 *(width * length);
        return perimeter;
    }
      public  String printRectangle(String newshape)
      {
        int spaces = 4;
        
        for (width =0; width<spaces ;width++)
        {
            for(length =0 ; length <= spaces;length++)
            {
                if(width == 0 || length==0|| width == spaces || length == spaces)
                {
                    System.out.println("*");
                }
                else{
                    System.out.println("      ");
                }
            }
        }
        return newshape;
    }
}

