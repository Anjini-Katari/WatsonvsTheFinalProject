import java.io.*;
import java.util.*;

public class UpMountain {
	protected String _name;
	protected String[] _pronouns;

	protected int choice;
	protected String[] pronouns = new String[3];
	protected boolean gameOver;

	protected InputStreamReader isr;
	protected BufferedReader in;

	public UpMountain() {
		gameOver = false;
		isr = new InputStreamReader( System.in );
		in = new BufferedReader( isr );
		choice = 0;
		Mountain();
	}

	public UpMountain( String name, String[] pronouns ) {
		this();
        	_name = name;
		_pronouns = pronouns;
    	}

    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public String getName() { return _name; }
    public String[] getPronouns() { return _pronouns; }
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
		s += _name;
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

	}
	public void pheonix() {
	}


}
