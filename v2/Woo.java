/** Watson vs The Final Project
Anjini Katari
Ruby Friedman
Joshua Gao */

import java.io.*;
import java.util.*;

public class Woo {
	private Protagonist bo;
	private int choice;
	public String[] pronouns = new String[3];
	private boolean gameOver;
        public String s;
	public String name = "";
	private InputStreamReader isr;
	private BufferedReader in;

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

		s = "~~~ Welcome to the famous Watson RPG! ~~~\n";
		System.out.print( s );

		s = "What would you like to be called? \n";
		System.out.print( s );

		try {
			name = in.readLine();
		}
		catch ( IOException e ) { }

		s = "What pronouns would you like to use? \n";
		s += "\t1: she/her \n";
		s += "\t2: he/him \n";
		s += "\t3: they/them \n";
		s += "Selection: ";
		System.out.print( s );

		try {
			choice  = Integer.parseInt( in.readLine() );
                }

		catch ( IOException e ) { }

                if (choice == 1) {
                         pronouns[0] = "she";
                         pronouns[1] = "her";
                         pronouns[2] = "hers";
                }
                else if (choice == 2) {
                         pronouns[0] = "he";
                         pronouns[1] = "him";
                         pronouns[2] = "his";
                }
                else {
                         pronouns[0] = "they";
                         pronouns[1] = "them";
                         pronouns[2] = "theirs";
                }

		bo = new Protagonist(name, pronouns);

		s = "You and 3 of your closest friends are spending the weekend in a lovely log cabin in the woods, on a mountain. You wake up after your first night and find that all of your food has been eaten by a bear! \n \n Instead of driving back home, you all decide to try to find some food. While on a hiking trail, you and your friends find some berries. One of your friends finds a group of birds eating them, and reasons that they would be safe to eat. \n \n That night you all snack on berries and other plants found in the forest. \n \n The next morning, you step outside the cabin for some fresh air, only for everything to look different from the day before. You've been teleported to a different universe!! \n \n Confused, you run back inside and wake up your friends. Together you collectively decide to explore the mountain, and split up into groups of 2. \n \n Which way would you like to explore? \n \n";
		System.out.println(s);
		Cabin log  = new Cabin(name, pronouns);
	}

	public static void main( String[] args ) {
		//loading...
		Woo game = new Woo();

		System.out.println( "This marks the end of your journey!");

	}//end main
} //end class woo
