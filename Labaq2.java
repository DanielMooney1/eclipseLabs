package itcarlow.lab2;

public class Labaq2 {

		public static void main(String args[]) {
			
			HotelRoom roomA = new HotelRoom();
			
			roomA.setRoomNumber(200);
			roomA.setRate(100.00);
			roomA.setRoomType("Single");
			roomA.setOccupied(1);
			
			HotelRoom roomB = new HotelRoom();
			
			roomB.setRoomNumber(201);
			roomB.setRate(80.00);
			roomB.setRoomType("Double");
			roomB.setOccupied(0);
			
			System.out.println("Information about Room A");
			System.out.println("The price of room A is " + roomA.getRate());
			System.out.println("The number of room A is " + roomA.getRoomNumber());
			System.out.println("The type of room A is " + roomA.getRoomType());
			System.out.println("The number of room A is ocuupied " + roomA.getOccupied());

			System.out.println("Information about Room B");
			System.out.println("The price of room A is " + roomB.getRate());
			System.out.println("The number of room A is " + roomB.getRoomNumber());
			System.out.println("The type of room A is " + roomB.getRoomType());
			System.out.println("The number of room A is ocuupied " + roomB.getOccupied());

		}

	}

