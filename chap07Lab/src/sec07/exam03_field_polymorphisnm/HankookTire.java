package sec07.exam03_field_polymorphisnm;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRaotation) {
		super(location, maxRaotation);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire ����" + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		}else {
			System.out.println("***" + location + " HankookTire ��ũ ***");
			return false;
		}
	}

}
