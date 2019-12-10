package Controller;

import View.Menu;

public class Main {
	
	/*
	 * NOTES:
	 * I am aware that this isn't following the whole rules from this Pokedeck project but I have chosen to make something easier and that I can
	 * do rather than using things I don't really know.
	 * Indeed, I for example didn't put graphic interface but I'm using console. 
	 * Here's the class diagram: https://i.ibb.co/ysTm0YB/Capture.jpg
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu = new Menu();
		menu.launchMenu(); // menu could have been implemented in the Main class but for future evolutions, it's better to separate it from Main
	}

}
