package sec05.exam04_local_variable_access;

public abstract class Anonymous implements Calculatable{
	
	int field;
	
	
	
	//메소드
	public void method(int arg1, int arg2) {
		int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		//Local variable arg1 defined in an enclosing scope must be final or effectively final
		//arg1 = 20;
		var1 = 30;
		
		//로컬변수 clalc에 익명구현객체를 대입시킨다.
		Calculatable calc = new Calculatable() {
			@Override
			public int sum() {
				//int result = field + arg1 + arg2 + var1 + var2;
				return 0;
			}
		};
	}


}
