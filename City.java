/** Watson vs The Final Project
Anjini Katari
Ruby Friedman
Joshua Gao */

import java.io.*;
import java.util.ArrayList;

public class City{
	protected String __name;
	protected ArrayList<String> _treasure;

	protected int choice;
	protected boolean gameOver;

	protected InputStreamReader isr;
	protected BufferedReader in;

	public City() {
		gameOver = false;
		isr = new InputStreamReader( System.in );
		in = new BufferedReader( isr );
		choice = 0;

	}

	public City( String name, ArrayList<String> treasure) {
		this();
	        __name = name;
		_treasure = treasure;
		city();
    	}

    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
	public String getName() { return __name;}
	public ArrayList<String> getTreasure() { return _treasure; }

    public void city(){
        String s = "\n *portal whooshing noises* \n \n";
        s += "Whoa! \n You suddenly appear in a magical, bustling city, filled with all kinds of magical creatures! \n";
        s += "You continue to follow the pheonix into the twisted, narrow streets of the city market, when you see a centaur";
        s += " drop a bag of their blue looking apples. \n The centaur appears extremely distressed about this. \n ";

        s += "\t1: Help the centaur \n";
        s += "\t2: Continue to follow the pheonix \n";
        s += "Selection: ";
        System.out.print( s );

        try {
            choice  = Integer.parseInt( in.readLine() );
        }

        catch ( IOException e ) { }

        if (choice == 1) {
            help();
        }
        else {
            cont();
        }
    }//city method end

    public void help(){
        String s = "You rush over to help the centaur pick up the strange looking apples. \n";
        s += "'Thank you, young one, you are very kind.'\n";
        s += "The centaur hands you one of the apples.\n";
        s += "'These are the finest fruits in the land. I hope you enjoy its taste. '\n";
        s += "\n *treasure + 1* \n \n";

        _treasure.add("strange blue apple");

        s += "You rush after the pheonix and your friend, who have left you behind. \n Luckily they ";
        s += "left behind map so you could follow. \n You follow the map until you reach a large castle";
        s += " made of stone and glass. \n You see your friend about to enter, and jog to catch up to them.\n";
        s += "The pheonix leads you down the halls and into a room of mirrors.\n It bows its head to you";
        s += " in farewell, and flies out an open window. \n Your friend touches the mirror, it's a portal!\n";
        s += "You both walk through. \n";

        System.out.print(s);

        Mirror onTheWall = new Mirror(__name, _treasure);
    }

    public void cont(){
        String s = "You quickly look away and hurry after the pheonix.\n After minutes of walking, you ";
        s += "reach a large castle made of stone and glass. You enter without fanfare and the pheonix leads you";
        s += " down the long halls and into a room of mirrors.\n It bows its head to you";
        s += " in farewell, and flies out an open window. \n Your friend touches the mirror, it's a portal!\n";
        s += "You both walk through. \n";

        System.out.print(s);

        Mirror onTheWall = new Mirror(__name, _treasure);
    }

}//city class end
