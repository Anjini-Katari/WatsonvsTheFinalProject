import java.io.*;
import java.util.*;

public class Cabin {

	protected String _name;
	protected String[] _pronouns;
	private int choice;
	private boolean gameOver;
	public String name = "";
	private InputStreamReader isr;
	private BufferedReader in;
	public String s; 


        public Cabin() {
                gameOver = false;
                isr = new InputStreamReader( System.in );
                in = new BufferedReader( isr );
                choice = 0;
        }

        public Cabin( String name, String[] pronouns ) {
		this();
                _name = name;
                _pronouns = pronouns;
		cabin();
        }
       	public void cabin() {
                s = "\t1: Up the mountain\n";
                s += "\t2: Down the mountain \n";
                s += "Selection: ";

                System.out.println(s);

                try {
                        choice  = Integer.parseInt( in.readLine() );
                }

                catch ( IOException e ) { }

                if (choice == 1) {
                        s = "Up the mountain we go!";
                        System.out.println(s);
                        UpMountain up = new UpMountain(_name, _pronouns);
                }
                else {
                        s = "Down, down, down the mountain!";
                        System.out.println(s);
                        //down = new DownMountain();
                }


        }
}
