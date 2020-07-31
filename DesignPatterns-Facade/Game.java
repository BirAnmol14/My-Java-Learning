//Facade Class
public class Game {
	private InputSystem is = new InputSystem();
	private GameObjects objects=new GameObjects();
	private GameConsole screen=new GameConsole();
	public void refresh() {
		is.getInput();
		objects.update(is);
		screen.draw(objects);
	}
}
