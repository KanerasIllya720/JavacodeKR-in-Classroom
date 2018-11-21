package MDP;

import java.util.ArrayList;

public class Player {
	ArrayList<Card> list = new ArrayList<Card>();

	void getCard(Deck deck) {
		list.add(deck.deal());
	}

	void showCard() {
		System.out.println(list);
	}

	void choiceCard(Player my, Player opposite) {
		int cardNum = (int) (Math.random() * opposite.list.size());
		my.list.add(opposite.list.get(cardNum));
		opposite.list.remove(cardNum);
	}

	void dropCard(Player player) {
		for (int k = 0; k < 2; k++) {
			for (int i = 0; i < player.list.size() - 1; i++) {
				for (int j = i + 1; j < player.list.size(); j++)
					if (player.list.get(i).number == player.list.get(j).number) {
						player.list.remove(i);
						player.list.remove(j - 1);
					}
			}
		}
	}
}
