package sec02_runtime_exception;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		changeDog(dog);
		System.out.println("----------");
		
		Cat cat = new Cat();
		changeDog(cat);
	}

	public static void changeDog(Animal animal) {
		if(animal instanceof  Dog) {
			Dog dog = (Dog) animal; //java.lang.ClassCastException
		} else {
			System.out.println("타입 변환할 수 없습니다.");
		}
	}
	
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}