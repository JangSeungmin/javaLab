package sec03.exam02_hashcode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap객체 생성
		// 프로그램 = 자료구조 + 알고리즘
		// Map 자료구조 = {key, value}
		HashMap<Key,String> hashMap = new HashMap<Key, String>();

		//식별키 "new Key(1)"로 "홍길동"을 저장함
		hashMap.put(new Key(1), "홍길동");
		
		//식별키 "new Key(1)"로 "홍길동"을 읽어옴
		String value = hashMap.get(new Key(1));
		
		System.out.println(value);
	}

}
