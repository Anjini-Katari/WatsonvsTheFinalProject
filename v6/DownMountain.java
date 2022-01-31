import java.io.*;
import java.util.ArrayList;

public class DownMountain {
	protected String __name;
    protected String prompt;
	protected ArrayList<String> _treasure;

	protected int playerChoice;
	protected boolean gameOver;

	protected InputStreamReader isr;
	protected BufferedReader br;

	public DownMountain() {
		gameOver = false;
		isr = new InputStreamReader( System.br );
		in = new BufferedReader( isr );
		playerChoice = 0;

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
        String prompt  = " As you and your friends descend from the mountain that you have spent for the past few days, you try to engrain this beautiful scene into mind: noticing every spec of grass and trees around you.\n 
        Your moment of happiness is quickly interrupted as you noticed a trio of menacing goblins straight up ahead. Keeping your head down, you and your friends tried to pass through them without arising any troubles.
        You and your friends were almost succcessful, but at the last moment, the biggest goblin blocks your path. With his outward stomach bulging out, he declares: \n";
	prompt += "'HALT! All who dares to pass this road must first beat us goblins in a deathly battle of BlackJack'\n";
	System.out.print(prompt);
	BlackJack FIGHT = new BlackJack();
	if (FIGHT.getDeath() == false) {
		Win();
	}
   }

   public void Win(){
	String prompt = "After a few moments, a pheonix suddenly materializes in front of you. \ \n 'Congradulations on winning BlackJack! That was no easy feat and I am very impressed by all your skills.' the pheonix chirps \n";
	prompt += "Beckoning you and your friends to follow, the pheonix guided us to a new location: a dilapidated pile of ruins that seemed untouched by centuries. \n";
	prompt += "Even though it was clear how badly destroyed the buildings are, you can still tell from the architecture it once was a very majestic building in its glory days. Captivated by a particularly old part of the ruin, one of your friends decided to venture towards it.\n";
	prompt += " Reaching out to touch it, your friends hand suddenly disappeared! \n 'Look!, he replied."\n;
	prompt += getName();
	prompt += " This is a portal, one of few ways to travel instantaneously in this world.' \n 'This particular one will lead you to an ancient city' the pheonix chirps, 'Follow me and I will show you wonders you have never even dreamed about.' \n";
	System.out.print(prompt);
	City newYork = new City(__name, _treasure);
    }
}
