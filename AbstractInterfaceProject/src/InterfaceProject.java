
public class InterfaceProject {
	public static void main(String[] args) {
		Animals[] AnimalArray = new Animals[6];
		AnimalArray[0] = new Dog("Goofy", "Retriever");
		AnimalArray[1] = new Dog("Fido", "Lab");
		AnimalArray[2] = new Cat("Tom", "Tabby");
		AnimalArray[3] = new Cat("Kitty", "Siamese");
		AnimalArray[4] = new Bird("Tweety", "Hummingbird");
		AnimalArray[5] = new Bird("Birb", "Bluebird");
		
		for (int i = 0; i < 6; i++) {
			System.out.println("Name: " + AnimalArray[i].getName() + " Type: " + AnimalArray[i].getType() + " Sound: " + AnimalArray[i].animalSound());
		}
		
		
	}
}
