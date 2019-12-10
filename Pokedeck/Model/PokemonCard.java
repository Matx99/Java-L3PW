package Model;

public class PokemonCard extends Card {
	// variables declaration
	private int hp;
	private int stage;
	private int attackPoints;
	
	// constructor
	public PokemonCard (int id, String name, String type, String description, int hp, int stage, int attackPoints) {
		super(id, name, type, description); // call to the Card constructor
		this.hp = hp;
		this.stage = stage;
		this.attackPoints = attackPoints;
	}
	
	// accessors
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) { 
		/* setters aren't used here but 
		* I have chosen to implement them incase
		* of an eventual evolution like a 
		* pokemon game for example
		*/
		this.hp = hp;
	}
	
	public int getStage() {
		return this.stage;
	}
	
	public void setStage(int stage) {
		this.stage = stage;
	}
	
	public int getAttackPoints() {
		return this.attackPoints;
	}

	public void setAttackPoints(int attackPoints) {
		this.attackPoints = attackPoints;
	}
}
