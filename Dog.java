package Animals;

public class Dog extends Animal {
	public String breed;
	
	public Dog(String name, int age, String breed) {
		super(name, age, breed);
		this.breed = breed;
	}
	
	@Override
	public void makeSound() {
		System.out.println("Dog is barking!");
	}
}
