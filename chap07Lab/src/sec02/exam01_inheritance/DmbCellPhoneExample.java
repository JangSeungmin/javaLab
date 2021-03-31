package sec02.exam01_inheritance;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		//Cellphone으로부터 상속받은 필드
		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("색상 : " + dmbCellPhone.color);
		
		// DmbCellPhone 의 필드
		System.out.println("채널 : " + dmbCellPhone.channel);
		
		// CellPhone 으로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.recieveVoice("안녕하세요!");
		dmbCellPhone.sendVoice("좋은아침~");
		dmbCellPhone.hangUp();
	}

}
