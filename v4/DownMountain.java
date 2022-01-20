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
        String s = "You and your friend descend down the mountain. \n You pass a trio of menacing looking gremlins, but luckily they appear to be preoccupied.";
	s += "As you continue your decent, the two of you come across a giant pile of ruins. \n Even though the structure is very destroyed, ";
	s += "you can tell that it was once a very majestic building. \n Your friend appears captivated by a part of the ruin and moves towards it. \n they reach";
	s += " out and touch it. \n 'look ";
	s += getName();
	s += " it's a portal!' \n You both walk through. \n";
	System.out.print(s);
	City newYork = new City(__name, _treasure);
    }
}
