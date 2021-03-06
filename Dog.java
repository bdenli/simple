package simplePackage;

public class Dog extends Animal implements Walkable{

	public Dog() {
		//empty constructor
	}

	public Dog(String name) {
		_name = name;
	}

	@Override
	public void walk() {
		System.out.println("It is walking!");
	}

	@Override
	public void run() {

		System.out.println("It is running!");
	}

	public void makeSound(){

		System.out.println(this._name + " says " + "Bark! Bark!");
	}

	public static void main(String[] args) {

		Dog d = new Dog();

		d.setName("Olivia");
		System.out.println("Let me introduce you to " + d.getName() + ".");

		d.setSpecies("dog");
		System.out.println(d.getName() + " is a " + d.getSpecies() + ".");

		d.makeSound();

		//Polymorphism example
		Animal a = new Dog();
		System.out.println("Animal's name is " + a.getName() + ".");
		a.makeSound();

	}
}
