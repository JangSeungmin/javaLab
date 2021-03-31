package sec02_runtime_exception;

public class ArrayIndexOutOfBoundsExceptionExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			
			//java.lang.ArrayIndexOutOfBoundsException
			System.out.println("args[0] : " + data1);
			System.out.println("args[1] : " + data2);
		} else {
			System.out.println("[실행방법]");
			System.out.println("java ClassName 값1 값2");
		}
	}
}
