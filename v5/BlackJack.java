import java.io.*;
//import java.util.*;
import java.util.ArrayList;

public class BlackJack {
	protected int choice;
	protected InputStreamReader isr;
	protected BufferedReader in;
	public boolean death;

	public ArrayList deck= new ArrayList<Integer>();
	public int YourNum = 0;
	public int GobNum = 0;
	public BlackJack() {
		isr = new InputStreamReader( System.in );
		in = new BufferedReader( isr );
		choice = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 13; j++) {
				deck.add(j);
			}
		}
		blackjack();

	}

	public boolean getDeath() { return death;}
	public void blackjack(){
		System.out.print("Attempt to beat the Goblins by getting a count as close to 21 as possible, without going over 21!");
		String s = "\n The goblin deals you a card...";
		System.out.println(s);
		Humhelper();
		boolean var = true;
		while (var) {
			if (GobNum > 21) {
				System.out.println("You win!");
				var = false;
				death = false;
				break;
			}
			else if (GobNum == 21) {
				System.out.println("The Goblin has won... death is your fate");
				var = false;
				death = true;
				break;
			}
			else if(YourNum == 21) {
                                System.out.println("You win!");
				death = false;
                                var = false;
				break;
                        }
   	                else if (YourNum > 21) {
                                System.out.println("The Goblin has won... death is your fate");
				death = true;
                                var = false;
				break;
                        }
			else {
                                if (GobNum <= 17) {
                                        GobHelper();
                                }
        	       		System.out.print("\n Would you like to hit or pass? \n");

	        	        s = "\t1: Hit \n";
	     	          	s += "\t2: Pass \n";
	        	        s += "Selection: ";

	       		        System.out.println(s);

	          	        try {
	               			choice  = Integer.parseInt( in.readLine() );

	               		}
        		        catch ( IOException e ) { }

	                        if (choice == 1) {
			                Humhelper();
	  	                }
		                else {
					if (YourNum > GobNum) {
	        	                        System.out.println("You win!");
						death = false;
        	        	                var = false;
                		                break;
					}
					else if (GobNum > YourNum) {
                	                	System.out.println("The Goblin has won... death is your fate");
						death = true;
                       		        	var = false;
                       		        	break;
					}
	        	        }
			}
		}


	}
	public  void Humhelper() {
		String s = "\n It's a ";
		int index = (int)(Math.random() * deck.size());
		s += deck.get(index);
		YourNum += (int)(deck.get(index));
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
        public void GobHelper() {
                String s = "\n The Goblin draws a card, it's a ";
                int index = (int)(Math.random()* deck.size());
                s += deck.get(index);
		GobNum += (int) (deck.get(index));
                deck.remove(index);
                if (index <= (deck.size()/4)) {
                        s += " of spades!";
                }
                else if (index <= (deck.size()/2)) {
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
