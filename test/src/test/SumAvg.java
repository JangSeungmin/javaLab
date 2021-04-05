package test;

public class SumAvg {

	public static void main(String[] args) {
		int i = 1;
		int count = 0;
		int sum = 0;
		double avg = 0;
		for(i = 1;i<=100;i++) {
			sum+=i;
			count++;
		}
		avg = (double)sum / count;
		System.out.println("1~100 ÇÕ°è : "+sum);
		System.out.println("Æò±Õ : "+String.format("%.2f",avg));

	}

}
