/** Watson vs The Final Project
Anjini Katari
Ruby Friedman
Joshua Gao */

import java.io.*;
import java.util.ArrayList;

public class Mirror{
	protected String __name;
	protected ArrayList<String> _treasure;

	protected int choice;
	protected boolean gameOver;

	protected InputStreamReader isr;
	protected BufferedReader in;

	public Mirror() {
		gameOver = false;
		isr = new InputStreamReader( System.in );
		in = new BufferedReader( isr );
		choice = 0;

	}

	public Mirror( String name, ArrayList<String> treasure) {
		this();
        	__name = name;
		_treasure = treasure;
		forest();
    	}

    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
	public String getName() { return __name;}
	public ArrayList<String> getTreasure() { return _treasure; }

    public void forest(){
        String s = "You open your eyes to find yourself in a whole new forest. \n ";
        s += "You and your friend walk around, looking for anyone or anything that could help you get home.\n";
        s += "After a little while of walking, you encounter a gryffin! \n";

        s += "\t1: Bow in respect\n";
        s += "\t2: Prepare for battle! \n";
        s += "Selection: ";
        System.out.print( s );

        try {
            choice  = Integer.parseInt( in.readLine() );
        }

        catch ( IOException e ) { }

        if (choice == 1) {
            kind();
        }
        else {
            stabby();
        }
    }

    public void kind() {
        String s = "You kneel down in respect, and the gryffin lets out a happy squack and bows back.\n";
        s += "Your friend laughs and you grin as you both reach out to pet it.\n";
        s += "It squacks in delight before turning around, gesturing for you to get on its back with its head. \n";
        s += "The two of you gently climb on its back, and hold on tightly to its fur.\n"; 
        s += "The gryffin flaps its wings and propels itself into the air.\n ";
        s += "\n Eventually the gryffin starts to descend, and you both hold on tighter.\n";
        s += "The gryffin lands softly on the ground, in front of a giant portal. \n";
        s += "You slide off and follow the gryffin closer to the portal.\n 'Home,' it whispers in your mind.\n";
        s += "You and your friend look at each other in suprise and thank the gryffin, before entering the portal.\n";

        s += "\n *portal whooshing noises* \n";

        s += "You open your eyes and find yourself back in the cabin. You rush outside only to see that you've made it ";
        s += "back home. \n";

        if (_treasure.size() > 0) {
            s += "Curiously you check your pockets. In them you find:\n";
            for (int i = 0; i < _treasure.size(); i++){
                s += _treasure.get(i);
                s += "\n";
            }
            s += "You look at the treasure in surprise and wonder.\n\n";
        }
        
        System.out.print(s);
    }
    
    public void stabby() {
        String s = "You take your fist and thrust it into the gryffin's eye. \n The gryffin cries in agony";
        s += " before growling in rage and eating you in a single bite. \n";

        System.out.print(s);
    }


}
