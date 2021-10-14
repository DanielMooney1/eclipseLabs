package itcarlow.lab2;

public class HotelRoom {

	private int roomNumber;
	private String roomType;
	private int occupied;
	private double rate;
	private boolean isOccupied;
	
	public HotelRoom() 
	{
		setRoomNumber(roomNumber);
		setRoomType(roomType);
		setOccupied(occupied);
		setRate(rate);
	}
	
	public HotelRoom(int newRoomNumber,String newRoomType,int newOccupied,Double newRate) 
	{
		setRoomNumber(newRoomNumber);
		setRoomType(newRoomType);
		setOccupied(newOccupied);
		setRate(newRate);
	}
	 
	
	public int getRoomNumber()
	{
		return roomNumber;
	}
	
	public void setRoomNumber(int newRoomNumber)
	{
	    this.roomNumber = newRoomNumber;
	}
	
	public String getRoomType()
	{
		return roomType;
	}
	
	public void setRoomType(String newRoomType)
	{
		this.roomType = newRoomType;
	}
	
	public int getOccupied()
	{
		return occupied;
	}
	
	public void setOccupied(int newOccupied)
	{
		this.occupied = newOccupied;
	}
	public Double getRate()
	{
		return rate;
	}
	
	public void setRate(Double newRate)
	{
		this.rate = newRate;
	}
	public boolean IsOccupied(int ocuupied)
	{
		if(ocuupied == 0)
		{
			isOccupied = false;
			setOccupied(1);
		}
		 else {
			isOccupied = true;
		}
		return isOccupied;
	}

	
}
