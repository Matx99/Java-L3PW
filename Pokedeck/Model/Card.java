package Model;

public class Card { 
	// variables declaration
	private int id;
	private static int cardNumber;
	private String name;
	private String type;
	private String description;
	
	// constructor
	public Card(int id, String name, String type, String description) {
		this.id = cardNumber++;
		this.name = name;
		this.type = type;
		this.description = description;
	}

	// accessors
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {// the setters aren't used for this pokedeck but they're necessary incase of eventual evolution such as editing cards
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
}
