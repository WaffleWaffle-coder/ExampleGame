
public class Flashlight extends Item{
	private boolean foundKey;
	public Flashlight() {
		super("flashlight");
		foundKey = false;
	}
	
	@Override
	public void use() {
		if(Game.getCurrentRoom().getName().equals("Bedroom")) {
			if (foundKey) {
				Game.print("Despite your best efforts, you couldn't find anything else interesting here.");
			}
			else {
			Game.print("You turn on the flashlight and start searching for clues and hidden treasure. Instead, you find the office key hidden under the bed.");
			Game.getCurrentRoom().addItem(new OfficeKey());
			}
		}
		else {
			Game.print("Despite your best efforts, you couldn't find anything interesting here.");
		}
	}
	

}
