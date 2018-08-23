package 제02차시;

class Class01 {
	int i=0;
	
	Class01(){
		i+=3;
		System.out.println("난 Class01 클래스의 생성자란다.");
		System.out.println("Class01 클래스의 모양으로 객체를 만든 즉시 호출됐지.");
		System.out.println("난i, 필드 또는 맴버 변수라고도 하지. c언어의 전역 변수 정도로 이해하자.");
		System.out.println("현재i:"+i);
		
		doIt();
	}
	void doIt() {
		i+=5;
		System.out.println("난 doIt() 메소드란다. 맴버 함수라고도 부르지.");
		System.out.println("내가 필요할 땐 나를 불러줘. 언제든지 달려갈게.");
		System.out.println("난i, 뭐라고 부른다고? 필드 또는 맴버 변수라니깐.");
		System.out.println("현재i:"+i);
	}
}
