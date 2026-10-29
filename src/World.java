
public class World {

	public static Room buildWorld() {
		Room livingRoom = new Room("Living Room", "This is a small living room with a couch and coffee table.");
		Room office = new Room("Office", "This is your father's office. There is a small desk with some compartments.");
		Room bedroom = new Room("Bedroom",
				"This is your brother's bedroom. He is currently sitting on his bed playing on his phone.");
		Room kitchen = new Room("Kitchen", "This is the kitchen. There is a fridge sitting in the corner of the room.");
		Room attic = new Room("Attic", "This is the attic. There are some boxes hiding towards the back wall.");
		Room garage = new Room("Garage",
				"This is the garage. The car is in the middle of the room, but it is not currently started.");
		office.setLocked(true);
		attic.setLocked(true);
		garage.setLocked(true);
		Item officeKey = new OfficeKey();
		Item tool = new Tool();
		Item musicbox = new Item("musicbox");
		Item flashlight = new Item("flashlight");
		Item knife = new Item("knife");
		Item mysteriousorb = new Item("mysteriousorb", true);
		livingRoom.addExit(office, 1);
		livingRoom.addExit(bedroom, 2);
		livingRoom.addExit(kitchen, 0);
		office.addExit(livingRoom, 0);
		bedroom.addExit(attic, 4);
		bedroom.addExit(livingRoom, 3);
		kitchen.addExit(livingRoom, 1);
		kitchen.addExit(garage, 3);
		attic.addExit(bedroom, 5);
		garage.addExit(kitchen, 2);
		bedroom.addItem(officeKey);
		livingRoom.addItem(tool);
		livingRoom.addItem(musicbox);
		kitchen.addItem(flashlight);
		kitchen.addItem(knife);
		kitchen.addItem(mysteriousorb);
		return livingRoom;
		
		
	}

	
}
