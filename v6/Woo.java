
/** Watson vs The Final Project
Anjini Katari
Ruby Friedman
Joshua Gao */

import java.io.*;
//import java.util.*;
import java.util.ArrayList;


private class Woo {
    private int playerChoice;
    private boolean gameOver;
    public String prompt;
	public String name = "";
    private InputStreamReader isr;
	private BufferedReader br;
    public ArrayList treasure = new ArrayList<String>();

    public Woo() {
		gameOver = false;
		isr = new InputStreamReader( System.in );
		br = new BufferedReader( isr );
		playerChoice = 0;
		newGame();
	}

	// ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
	public Woo() {
		gameOver = false;
		isr = new InputStreamReader( System.br );
		br = new BufferedReader( isr );
		playerChoice = 0;
		newGame();
	}
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	public void newGame() {

		s = "\n ~~~ Welcome to the famous Watson RPG! ~~~\n";
		System.out.print( s );

		s = "What would you like to be called? \n";
		System.out.print( s );

		try {
			name = br.readLine();
		}
		catch ( IOException e ) { }

		s = "
        Hiking across the beautiful mountain on a Saturday afternoon, you and your 3 closest friend decided to spend the rest of the day relaxing at a lovely nearby log cabin
        \n After a night of relaxful sleep, you eagerly go to awake your other friends before discovering a horrible truth: all your food has been stolen by a bear!
        \n Knowing you still had 1 more day left, you and your friends collectively decided to camp the rest of the day and try to find some new food instead of driving back home.
        \n Fortunately, during the hiking trail, you and you friends find some berries! Fantastic news! 
        \n Knowing that the nearby wolf species eat these berries during times of winter, you and your friends reasoned they would be safe to eat. After all, you even see some local robins eating them this morning!
        \n Lady Luck gave us a blessing. That night, we all had enough berries and other fruits found from the forest to eat. 
        \n The following morning, you venture outside your cabin to inhale the incredible aroma of morning dew before realizing nothing looked the same. 
        \n You've been teleported to a different universe!! 
        \n Confused, you run back inside and wake up your friends to your new discovery. 
        \n Astonished at this relevation, you and your friends decided to explore this new terrain as much as possible by splitting into teams of 2 to survey the surrounding.
        \n Which way would you like to explore? \n";
		System.out.println(s);
		Cabin log  = new Cabin(name, treasure);
	}

	public static void main( String[] args ) {
		//loading...
		Woo game = new Woo();

		System.out.println( "This marks the end of your journey!");

	}//end main
} //end class woo








