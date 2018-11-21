package MDP;

import javax.swing.JFrame;

/*https://kin.naver.com/qna/detail.nhn?d1id=1&dirId=1040
	202&docId=251103995&qb=7J6Q67CUIOuPhOuRkeyeoeq4sA=
	=&enc=utf8&section=kin&rank=4&search_sort=0&spq=0&
	pid=T/6gGlpySElssvbDOdsssssss2s-329491&sid=c7FPvJP
	Lo37Nw4IpX1Ti5A%3D%3D*/

public class CardGame {
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		Player p1 = new Player();
		Player p2 = new Player();
		for (int i = 0; i < 26; i++) {
			p1.getCard(deck);
			p2.getCard(deck);
		}
		p2.getCard(deck);// 조커를 위해 한번더

		System.out.println("\n↓Erased The Same Thing↓\n"); // 반복된 카드를 지움
		p1.dropCard(p1);
		p2.dropCard(p2);
		System.out.print("Computer : ");
		p1.showCard();
		System.out.print("Player : ");
		p2.showCard();
		if (p1.list.size() < p2.list.size()) { //
			while (true) {
				System.out.println();
				System.out.println("Computer Turn");
				System.out.println();
				p1.choiceCard(p1, p2);
				p1.dropCard(p1);
				System.out.print("Computer : ");
				p1.showCard();
				System.out.print("Player : ");
				p2.showCard();
				if (p1.list.size() == 0) {
					System.out.println("Computer Win!");
					break;
				} else if (p2.list.size() == 0) {
					System.out.println("Player Win!");
					break;
				}

				System.out.println();
				System.out.println("Player Turn");
				System.out.println();
				p2.choiceCard(p2, p1);
				p1.dropCard(p2);
				System.out.print("Computer : ");
				p1.showCard();
				System.out.print("Player : ");
				p2.showCard();
				if (p2.list.size() == 0) {
					System.out.println("Player Win!");
					break;
				} else if (p1.list.size() == 0) {
					System.out.println("Computer Win!");
					break;
				}
			}
		} else {
			while (true) {
				System.out.println();
				System.out.println("Player Turn");
				System.out.println();
				p2.choiceCard(p2, p1);
				p1.dropCard(p2);
				System.out.print("Computer : ");
				p1.showCard();
				System.out.print("Player : ");
				p2.showCard();
				if (p2.list.size() == 0) {
					System.out.println("Player Win!");
					break;
				} else if (p1.list.size() == 0) {
					System.out.println("Computer Win!");
					break;
				}
				System.out.println();
				System.out.println("Computer Turn");
				System.out.println();
				p1.choiceCard(p1, p2);
				p1.dropCard(p1);
				System.out.print("Computer : ");
				p1.showCard();
				System.out.print("Player : ");
				p2.showCard();
				if (p1.list.size() == 0) {
					System.out.println("Computer Win!");
					break;
				} else if (p2.list.size() == 0) {
					System.out.println("Player Win!");
					break;
				}
			}
		}
	}

}
