package sec07.exam03_field_polymorphisnm;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRaotation) {
		super(location, maxRaotation);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "KumhoTire ¼ö¸í" + (maxRotation - accumulatedRotation) + "È¸");
			return true;
		}else {
			System.out.println("***" + location + " KumhoTire ÆãÅ© ***");
			return false;
		}
	}

}
