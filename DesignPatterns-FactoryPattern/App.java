
public class App {

	public static void main(String[] args) {
		Animals myAnimal=AnimalFactory.createAnimal(AnimalFactory.CAT);
		myAnimal.speak();
	}

}
