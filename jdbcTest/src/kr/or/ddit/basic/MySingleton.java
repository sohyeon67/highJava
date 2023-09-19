package kr.or.ddit.basic;

/*

- singleton패턴 ==> 객체가 1개만 만들어지게 하는 방법
		(외부에서 new 명령을 사용하지 못하게 한다.)
		
- 사용 이유
1) 메모리 낭비 방지할 수 있다.
2) 데이터의 공유가 쉽다.

- singleton 클래스 만드는 방법 (필수 구성 요소)
1. 자신 class의 참조값이 저장될 변수를 private static으로 선언한다.

2. 모든 생성자의 접근 제한자를 private으로 한다.

3. 자신 class의 인스턴스를 생성하고 반환하는 메서드를 public static으로 작성한다.
	(이 메서드의 이름은 보통 getInstance로 한다.)


*/

public class MySingleton {
	// 1번
	private static MySingleton single;
	
	// 2번 ==> 생성자가 없으면 기본 생성자를 작성해야 한다.
	private MySingleton() {
		System.out.println("생성자 호출입니다...");
	}
	
	// 3번
	public static MySingleton getInstance() {
		// 1) 만약 1번의 변수값이 null이면 현재 객체를 생성하여 변수에 저장한다.
		// 2) 1번의 변수값을 반환한다.
		if(single==null) single = new MySingleton();
		
		return single;
	}
	
	// 기타... ==> 이 클래스의 용도에 맞는 내용들을 작성한다.
	public void displayTest() {
		System.out.println("싱글톤 클래스의 메서드 호출입니다...");
	}
}
