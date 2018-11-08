package _10추상클래스의이해;

public abstract class 동물 {
	int 나이;
	abstract void 울다();
	abstract void 애교부리다();
	void 무서워하다() {
		System.out.println("뒷걸음질");
	}
}
