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
        	_name = name;
		_pronouns = pronouns;
    	}

    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public String getName() { return _name; }
    public String[] getPronouns() { return _pronouns; }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	public Mountain {
		String s = "You and your friend ascend up the mountain when you encounter two magical beings: A phoenix and a pixie! \n The phoenix's eyes light up as it telepathically beckons for you to follow it. \n The pixie rolls it's eyes, 'Don't listen to the pheonix, follow me!' "
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



}
