package Model;

public class EnergyCard extends Card {
	/* 
	 * this Class is created because of an eventual app evolution where we would
	 * need to create new methods etc... even through if here, no additional stuff from Card class
	 * is being added
	*/ 
	
	public EnergyCard (int id, String name, String type, String description) {
		super(id, name, type, description); // call to the Card constructor
	}
}
