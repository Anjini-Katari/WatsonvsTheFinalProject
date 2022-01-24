/** Watson vs The Final Project
Anjini Katari
Ruby Friedman
Joshua Gao */

import java.io.*;
import java.util.ArrayList;

public class UpMountain {
	protected String __name;
	protected ArrayList<String> _treasure;

	protected int choice;
	protected boolean gameOver;

	protected InputStreamReader isr;
	protected BufferedReader in;

	public UpMountain() {
		gameOver = false;
		isr = new InputStreamReader( System.in );
		in = new BufferedReader( isr );
		choice = 0;

	}

	public UpMountain( String name, ArrayList<String> treasure) {
		this();
	        __name = name;
		_treasure = treasure;
		Mountain();
    	}

    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
	public String getName() { return __name;}
	public ArrayList<String> getTreasure() { return _treasure; }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	public void Mountain() {
		String s = "You and your friend ascend up the mountain when you encounter two magical beings: A phoenix and a pixie! \n The phoenix's eyes light up as it telepathically beckons for you to follow it. \n The pixie rolls its eyes, 'Don't listen to the pheonix, follow me!' ";
		s += "Who will you follow? \n";
		s += "\t1: The pheonix \n";
		s += "\t2: The pixie \n";
		s += "Selection: ";
		System.out.print( s );

		try {
			choice  = Integer.parseInt( in.readLine() );
                }

		catch ( IOException e ) { }

                if (choice == 1) {
			pheonix();
                }
                else {
			pixie();
                }
	}

	public void pixie() {
		String s = "The pixie giggles and flies off, leaving a trail of pixie dust behind for you to follow. \n Eventually you reach a small witches hut and decide to enter...\n The door creaks open and you enter slowly. As you explore the cabin you encounter a witch! \n";
		s += "The witch cackles mysteriously, '";
		s += getName();
		s += " right? I've heard all about you...' You start to feel a little uneasy and back off slowly \n";
		s += "The witch cackles again, 'don't worry, I'll make sure everything is as painless as possible \n'";
		s += "\t1: run \n";
                s += "\t2: FIGHT \n";
                s += "Selection: ";
                System.out.print( s );

                try {
                        choice  = Integer.parseInt( in.readLine() );
                }

                catch ( IOException e ) { }

                if (choice == 1) {
                        run();
                }
                else {
                        fight();
                }
	}

	public void run() {
		String s = "You sprint away quickly, running as fast as you possibly can. Somehow, you end up back at your log cabin, perhaps you should try a different path this time... \n";
		System.out.print( s );
		Cabin.cabin();
	}

	public void fight() {
		String s = "You decide to fight! \nYou punch the witch in the face as your friend finds a bucket water and dumps it on her. \n You both watch her body dissolve, in her place lies a small obsidian horse. \n You pick up the horse and place it in your pocket. \n ";
		_treasure.add("tiny obsidian horse");
		s += "\n *treasure + 1*";
		s += "\n \n You and your friend take a look around the hut once more.\n Finding nothing else of value, you make your way back to the cabin.\n";
		System.out.print(s);
		Cabin trees = new Cabin(__name, _treasure);
	}
	public void pheonix() {
		String s = "The pheonix nods slightly and leads you up a rocky path. \n";
		s += "You follow it until you reach a lake, after which the pheonix dives in after beckoning you to follow. \n";
		s += "After a moment of hesitation, you jump in after it, your friend close behind.\n";
		System.out.print(s);
		City atlantis = new City(__name, _treasure);

	}


}
