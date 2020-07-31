
public class App {
	public static void main(String[] args) {
		Game game=new Game();
		/*
		 * InputSystem is = new InputSystem();
		GameObjects objects=new GameObjects();
		GameConsole screen=new GameConsole();
		Not facade style
		*/
		while (true) {
			/* Implementation not using the Facade Pattern
			// Game is a massive loop
			// Takes User input
			is.getInput();
			// Updates objects like hero,villain etc..
			objects.update(is);
			// draw these objects on screen
			screen.draw(objects);
			*/
			game.refresh();
		}
	}

}
