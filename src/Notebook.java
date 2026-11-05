
public class Notebook extends Item{
	private boolean hasPassword;
	public Notebook() {
		super("notebook");
		hasPassword = false;
	}
	
	@Override
	public void read() {
			if (hasPassword) {
				Game.print("You read every other page in the notebook to no avail. Nothing's there.");
				hasPassword = false;
			}
			else {
				Game.addInventoryItem(new Item("Password"));
				Game.print("You open the notebook and find the password to the computer on the first page! It's almost too easy.");
			}
		
	}
}
