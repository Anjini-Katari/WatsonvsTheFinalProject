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
		String s = "The goblin deals you your first card..."
		Math.random()* 52
