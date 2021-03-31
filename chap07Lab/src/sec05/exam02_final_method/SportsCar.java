package sec05.exam02_final_method;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
	}
	/*
	//Cannot override the final method from Car
	public void stop() {
		System.out.println("½ºÆ÷Ã÷Ä«¸¦ ¸ØÃã");
		speed = 0;
	}
	*/
	
	
}
