package sec05_try_with_resources;

public class TryWithResourceExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("file.txt");
			fis.read();
			throw new Exception(); // ���ܸ� ������ �߻���Ų��.
		} catch (Exception e) {
			System.out.println("���� ó�� �ڵ尡 �߻��Ǿ����ϴ�.");
		} finally {
			fis.close();
		}
		*/
		
		//�ڵ����� ���ҽ��� �ݴ´�.
		try(FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception(); // ���ܸ� ������ �߻���Ų��.
		} catch (Exception e) {
			System.out.println("���� ó�� �ڵ尡 �߻��Ǿ����ϴ�.");
		} 
		
	}

}
