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
		String s;
		String name = "";

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

	} //end new game

	public static void main( String[] args ) {
		//loading...
		Woo game = new Woo();

		System.out.println( "This marks the end of your journey!");

	}//end main
} //end class woo
