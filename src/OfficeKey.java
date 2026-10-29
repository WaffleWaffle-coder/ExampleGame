
public class OfficeKey extends Item{

	private boolean usedTool;
	public OfficeKey() {
		super("officekey");
		usedTool = false;
	}
	@Override
	public void use() {
	if (Game.getCurrentRoom().getName().equals("Living Room")) {
	if (usedTool) {
	Game.print("You already opened the office door!");
	} else {
	Game.getCurrentRoom().getExit(1).setLocked(false);
	usedTool = true;
	Game.print("Using the tool, you are able to unlock the office door.");
	}
	} else
	Game.print("You don't see any way to use the tool in this room. This key is only for the office door, after all.");
	}

}
