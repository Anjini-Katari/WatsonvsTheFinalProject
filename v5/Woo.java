/** Watson vs The Final Project
Anjini Katari
Ruby Friedman
Joshua Gao */

import java.io.*;
//import java.util.*;
import java.util.ArrayList;

public class Woo {
	private Protagonist bo;
	private int choice;
	private boolean gameOver;
        public String s;
	public String name = "";
	private InputStreamReader isr;
	private BufferedReader in;
	public ArrayList treasure = new ArrayList<String>();

	// ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
	public Woo() {
		gameOver = false;
		isr = new InputStreamReader( System.in );
		in = new BufferedReader( isr );
		choice = 0;
		newGame();
	}
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	public void newGame() {

		s = "\n ~~~ Welcome to the famous Watson RPG! ~~~\n";
		System.out.print( s );

		s = "What would you like to be called? \n";
		System.out.print( s );

		try {
			name = in.readLine();
		}
		catch ( IOException e ) { }

		s = "You and 3 of your closest friends are spending the weekend in a lovely log cabin in the woods, on a mountain. \n You wake up after your first night and find that all of your food has been eaten by a bear! \n Instead of driving back home, you all decide to try to find some food.\n  While on a hiking trail, you and your friends find some berries.\n One of your friends finds a group of birds eating them, and reasons that they would be safe to eat. \n That night you all snack on berries and other plants found in the forest. \n The next morning, you step outside the cabin for some fresh air, only for everything to look different from the day before. \n You've been teleported to a different universe!! \n \n Confused, you run back inside and wake up your friends. \n Together you collectively decide to explore the mountain, and split up into groups of 2. \n \n Which way would you like to explore? \n";
		System.out.println(s);
		Cabin log  = new Cabin(name, treasure);
	}

	public static void main( String[] args ) {
		//loading...
		Woo game = new Woo();

		System.out.println( "This marks the end of your journey!");

	}//end main
} //end class woo
