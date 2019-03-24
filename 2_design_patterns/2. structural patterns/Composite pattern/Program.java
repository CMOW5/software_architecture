package javaTest2;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Housing building = new Housing("123 street");
		Housing floor1 = new Housing("123 - street first floor");
		int firstFloor = building.addStructure(floor1);
		
		Room washRoom1m = new Room("1F men's washroom");
		Room washRoom1w = new Room("1F women's washroom");
		Room common1 = new Room("1F Common Area");
		
		int firstMens = floor1.addStructure(washRoom1m);
		int firstWomans = floor1.addStructure(washRoom1w);
		int firstCommon = floor1.addStructure(common1);
		
		building.enter(); // enter the building
		Housing currentFloor = building.getStructure(firstFloor);
		currentFloor.enter(); // walk into the first floor
		Room currentRoom = currentFloor.getStructure(firstMens);
		currentRoom.enter(); // walk into the men's room
		currentRoom = currentFloor.getStructure(firstCommon);
		currentRoom.enter(); // walk into the common area
		
	}

}
