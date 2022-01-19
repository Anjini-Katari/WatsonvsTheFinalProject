import java.io.*;
import java.util.*;

public class Cabin {

	protected static String _name;
	protected static String[] _pronouns;
	private static int choice;
	private static boolean gameOver;
	public static String name = "";
	private static InputStreamReader isr;
	private static BufferedReader in;
	public static String s; 


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
       	public static void cabin() {
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
