package Animals;

public class Animal {
	public int age;
	public String name;
	public String breed;
	
	public Animal(String name, int age, String breed) {
		this.name = name;
		this.age = age;
		this.breed = breed;
	}
	
	public void makeSound() {
		System.out.println("Animal is making sound!");
	}
}
