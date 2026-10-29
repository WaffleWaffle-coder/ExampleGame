import java.io.Serializable;

public class Item implements Serializable{
	private String name;
	private boolean heavy;
	
	public Item(String n) {
		name = n;
		heavy = false;
	}
	
	public Item(String n, boolean h) {
		name = n;
		heavy = h;
	}
	public void use() {
		Game.print("Sorry, you can't use this item.");
	}
	public String getName()
	{
		return name;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public String toString()
	{
		return name;
	}
	
	public boolean isHeavy() {
		return heavy;
	}
}