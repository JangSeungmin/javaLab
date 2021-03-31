package sec06.exam08_advanced_for;

public class AdvancedForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {95,71,84,93,87};
		
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("Á¡¼öÃÑÇÕ=" + sum);
		
		sum = 0;
		for (int score : scores) {
			sum += score;
		}
		System.out.println("Á¡¼öÃÑÇÕ=" + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("Á¡¼öÆò±Õ=" + avg);
		
	}

}
