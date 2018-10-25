package 제18차시;

public class TruckMain {

	public static void main(String[] args) {
		Truck myTruck=new Truck();
		myTruck.carName="프론티어";
		myTruck.ton=3;
		System.out.println("나의 트럭은 "+myTruck.color+"이다");
		System.out.println(myTruck.carName+"는"+myTruck.ton+"톤을 실을 수 있다.");

	}

}
