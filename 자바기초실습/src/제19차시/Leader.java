package 제19차시;

public class Leader extends Student {
	Leader(String name,String hakbun,boolean tf){
		super(name,hakbun);
		this.name=name;
	}
	void isLeader() {
		System.out.println(name+"은 학생회장이다.");
	}
}
