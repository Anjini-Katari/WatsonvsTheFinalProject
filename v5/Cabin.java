import java.io.*;
import java.util.ArrayList;

public class Cabin {

	protected static String _name;
	protected static ArrayList<String> _treasure;


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

        public Cabin( String name, ArrayList<String> treasure) {
		this();
                _name = name;
                _treasure = treasure;
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
                        UpMountain up = new UpMountain(_name, _treasure);

                }
                else {
                        s = "Down, down, down the mountain!";
                        System.out.println(s);
                        DownMountain down = new DownMountain(_name, _treasure);
                }


        }
}
