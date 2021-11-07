package lab4;

public class address {

	private String street;
	private String town;
	private String country;

	public address () // constructor
	
	{
		
	}
	
	public address (String thestreet, String thetown, String theCountry) // constructor
	
	{
		street = thestreet;
		town = thetown;
		country = theCountry;
		
	}
	public void setStreet (String theStreet)
	
	{
		street = theStreet;
	}
	public void setTown (String theTown)
	{
		town = theTown;
	}
	public void setCountry (String theCountry)
	{
		country = theCountry;
	}

	public String getTown ()
	{
		return town;
	}
	
	public String getStreet()
	
	{
		return street;
	}
	
	public String getCountry ()
	
	{
		return country;
	}

	
	public String toString ()
	
	{
		String myString;
		
		myString = "";
		myString += "Street: " + street;
		myString += "Town: " + town;
		myString += "Country: " + country;
		return myString;
	}
}