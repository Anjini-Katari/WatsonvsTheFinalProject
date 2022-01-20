import java.io.*;
import java.util.ArrayList;

public class DownMountain {
	protected String __name;
	protected String[] _pronouns;
	protected ArrayList<String> _treasure;

	protected int choice;
	protected String[] pronouns = new String[3];
	protected boolean gameOver;

	protected InputStreamReader isr;
	protected BufferedReader in;

	public DownMountain() {
		gameOver = false;
		isr = new InputStreamReader( System.in );
		in = new BufferedReader( isr );
		choice = 0;

	}

	public DownMountain( String name, String[] pronouns, ArrayList<String> treasure) {
		this();
        __name = name;
		_pronouns = pronouns;
		_treasure = treasure;
		Mountain();
    	}

    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public String getName() { return __name;}
    public String[] getPronouns() { return _pronouns; }
	public ArrayList<String> getTreasure() { return _treasure; }

    public void Mountain(){
        
    }