package Animals;

public class Cat extends Animal {
	public String hairType;
	
	public Cat(String name, int age, String breed, String hairType) {
		super(name, age, breed);
		this.hairType = hairType;
	}
	
	@Override
	public void makeSound() {
		System.out.println("Cat is meowing!");
	}
}