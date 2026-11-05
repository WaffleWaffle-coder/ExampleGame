
public class Safe extends Item{
	private boolean open;
	private boolean hasNotebook;
	public Safe() {
		super("safe", true);
		open = false;
		hasNotebook = false;
	}
	
	@Override
	public void open() {
		if (Game.getCurrentRoom().getName().equals("Attic")) {
			if (!open) {
				if (hasNotebook) {
					Game.print("Despire reopening the safe like it's a fridge, nothing new appears.");
				}
				else {
				Game.getCurrentRoom().addItem(new Notebook());
				Game.print("You open the safe and find a notebook!");
				open = true;
				hasNotebook = true;
				}
			}
			else {
				Game.print("The safe is already open...");
			}
		}
		else
			Game.print("There isn't a safe in this room.");
	}
	
	@Override
	public void close() {
		if (Game.getCurrentRoom().getName().equals("Attic")) {
			if (open) {
				Game.print("You close the safe.");
				open = false;
			}
			else {
				Game.print("The safe is already closed...");
			}
		}
		else
			Game.print("There isn't a safe in this room.");
	}
	

}
