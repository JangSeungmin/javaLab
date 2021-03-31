package sec07.exam04_other_constructor_call;

public class Car {
		String company = "현대자동차";
		String model;
		String color;
		int maxSpeed;
		
		Car(){
				
		}
		
		// 생성자 오버로딩(constructor overloading)
//		this() : 자신의 생성자를 호출한다.
//		this : 자신의 객체를 지칭한다
//		super() : 부모 객체의 생성자를 호출한다.
//		super : 부모 객체를 지칭한다
		Car(String model){
			//this.model = model;
			this(model, null, 0);
		}
		
		Car(String model, String color){
//			this.model = model;
//			this.color = color; 
			this(model, color, 0);
		}
		
		Car(String model, String color, int maxSpeed){
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
		}
}
