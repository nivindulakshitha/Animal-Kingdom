package Animals;

public class Test {

	public static void main(String[] args) {
		Animal anAnimal = new Animal("Kandu", 10, "Asian");
		Dog aDog = new Dog("Batti", 2, "Dachshund");
		Cat aCat = new Cat("Deasy", 5, "British Shorthair", "awn");
		
		anAnimal.makeSound();
		aDog.makeSound();
		aCat.makeSound();

	}

}
