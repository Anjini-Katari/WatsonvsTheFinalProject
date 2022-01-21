import java.io.*;
//import java.util.*;
import java.util.ArrayList;

public class BlackJack {
	public ArrayList deck= new ArrayList<Integer>();
	public int yourNum = 0;
	public int GobNum = 0;
	public BlackJack() {
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 13; j++) {
				deck.add(j);
			}
		}
		blackjack();

	}

	public blackjack(){
		String s = "The goblin deals you a card...";
		System.out.println(s);
		Humhelper();
		boolean var = true;
		while (var) {
			if (GobNum <= 17) {
				GobHelper();
			}
			else if (GobNum > 21) {
				System.out.println("You win!");
				var = false;
			}
			else if (Gob == 21) {
				System.out.println("The Goblin has won...");
				var = false;
			}
		}


	}
	public Humhelper() {
		String s = "\n It's a ";
		int index = Math.random()* deck.size();
		s += deck.get(index);
		yourNum += deck.get(index);
		deck.remove(index);
		if (index <= 13) {
			s += " of spades!";
		}
		else if (index <= 26) {
			s += " of hearts!";
		}
		else if (index <= 39) {
			s += " of diamonds!";
		}
		else {
			s += " of clubs!";
		}
		s += "\n You now have ";
		s += YourNum;
		s+= " points";
		System.out.print(s);
	}
        public Gobhelper() {
                String s = "\n It's a ";
                int index = Math.random()* deck.size();
                s += deck.get(index);
		GobNum += deck.get(index);
                deck.remove(index);
                if (index <= (deck.size()/4)) {
                        s += " of spades!";
                }
                else if (index <= (deck.size()/2) {
                        s += " of hearts!";
                }
                else if (index <= ((deck.size() * 3) /4)) {
                        s += " of diamonds!";
                }
                else {
                        s += " of clubs!";
                }
                s += "\n The Goblin now has ";
                s += GobNum;
                s+= " points";
                System.out.print(s);
        }

}
