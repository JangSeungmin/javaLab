package verify;

public class Arr04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = { { 85, 60, 70 }, // 0 행
								{ 90, 95, 80 }, // 1 행
								{ 75, 80, 100 }, // 2 행
								{ 80, 70, 95 }, // 3 행
								{ 100, 65, 80 } // 4 행
							   };
		int[] subject = new int[3]; // 과목총점 저장
		int[] student = new int[5]; // 학생의 총점 저장
		
		String[] subName = { "국어:", "영어:", "수학:" };
		String[] stuName = { "1번학생:", "2번학생:", "3번학생:", "4번학생:", "5번학생:" };
		// subject[0]=0, student[0]=0;
		int r, c;
		System.out.println("각 과목별 총점구하기 ");
		// 이곳에 코드를 추가합니다.
		for (int i = 0; i < subject.length; i++) {
			for (int j = 0; j < student.length; j++) {
				subject[i] += score[j][i];
			}
			System.out.println(subName[i] + subject[i]);
		}
		
//		for (int i : subject) {
//			for (int j : student) {
//				subject[i] += score[j][i];
//			}
//			System.out.println(subName[i] + subject[i]);
//		}

		System.out.println();
		System.out.println("학생별 총점구하기");
		// 이곳에 코드를 추가합니다.
		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < subject.length; j++) {
				student[i] += score[i][j];
			}
			System.out.println(stuName[i] + student[i]);
		}
		
	}

}
