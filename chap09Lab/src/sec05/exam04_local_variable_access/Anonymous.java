package sec05.exam04_local_variable_access;

public abstract class Anonymous implements Calculatable{
	
	int field;
	
	
	
	//�޼ҵ�
	public void method(int arg1, int arg2) {
		int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		//Local variable arg1 defined in an enclosing scope must be final or effectively final
		//arg1 = 20;
		var1 = 30;
		
		//���ú��� clalc�� �͸�����ü�� ���Խ�Ų��.
		Calculatable calc = new Calculatable() {
			@Override
			public int sum() {
				//int result = field + arg1 + arg2 + var1 + var2;
				return 0;
			}
		};
	}


}
