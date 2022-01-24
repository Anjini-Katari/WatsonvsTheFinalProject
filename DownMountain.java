import java.io.*;
import java.util.ArrayList;

public class DownMountain {
	protected String __name;
	protected ArrayList<String> _treasure;

	protected int choice;
	protected boolean gameOver;

	protected InputStreamReader isr;
	protected BufferedReader in;

	public DownMountain() {
		gameOver = false;
		isr = new InputStreamReader( System.in );
		in = new BufferedReader( isr );
		choice = 0;

	}

	public DownMountain( String name, ArrayList<String> treasure) {
		this();
	        __name = name;
		_treasure = treasure;
		Mountain();
    	}

    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public String getName() { return __name;}
	public ArrayList<String> getTreasure() { return _treasure; }

    public void Mountain(){
        String s = "You and your friend descend down the mountain. \n You pass a trio of menacing looking goblins. \n You attempt to walk by them, but one of them blocks your path. \n";
	s += "'HALT! Whoever dare pass, must first beat us goblins in a deathly battle of BlackJack'\n";
	System.out.print(s);
	BlackJack FIGHT = new BlackJack();
	if (FIGHT.getDeath() == false) {
		Win();
	}
   }

   public void Win(){
	String s = "A pheonix materializes \n 'Congrats on winning BlackJack, that was a very impressive game' the pheonix chirps \n";
	s += "The pheonix beckons for your to follow it, and soon you come across a giant pile of ruins. \n Even though the structure is very destroyed, ";
	s += "you can tell that it was once a very majestic building. \n Your friend appears captivated by a part of the ruin and moves towards it. \n they reach";
	s += " out and touch it. \n 'look ";
	s += getName();
	s += " it's a portal!' \n 'This portal will lead you to an ancient city' the pheonix chirps, 'follow me, I'll show you around!' \n";
	System.out.print(s);
	City newYork = new City(__name, _treasure);
    }
}
