import java.io.*;
import java.util.ArrayList;

public class City{
	protected String __name;
    protected String prompt;
	protected ArrayList<String> _treasure;

	protected int playerChoice;
	protected boolean gameOver;

	protected InputStreamReader isr;
	protected BufferedReader br;

	public City() {
		gameOver = false;
		isr = new InputStreamReader( System.br );
		br = new BufferedReader( isr );
		playerChoice = 0;

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
        String prompt = "\n *portal whooshing noises* \n \n";
        prompt += "Ka-boom! \n With the air rushing right past you, you see all kinds of magical creatures flying around in what appears to be a hidden city of another world. \n";
        prompt += " Seeing a burning pheonix fly above you, you decided to follow the enchanted creature until you sudden stumble across a centaur";
        prompt += " The centaur seemed to have dropped a bag of mysteriously glowing blue apples. \n Frantically pounding their hooves against the ground, the centur appears extremely distressed about this. \n ";
        prompt += " You believe this unknown food might be something of great importance to the creature. Perhaps without it, it might even die!\n ";
        prompt += "\t1: Help the centaur \n";
        prompt += "\t2: Continue to follow the pheonix \n";
        prompt += "Selection: ";
        System.out.print( prompt );

        try {
            choice  = Integer.parseInt( br.readLine() );
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
        String prompt = "Seeing the centaur become even more increasingly frustrated, you quickly rush over to pick up the strange looking apples. \n";
        prompt += "'Holding it in your hands, you feel the fruit is unusually cold.'\n";
        prompt += "'Thank you there, young adventurer. I become very panicked when I dropped those apples because they in fact are not only of the finest fruits in the land, but also serves as medicinal treatment to cure illness.'\n";
        prompt += "The centaur hands you one of the apples.\n";
        prompt += "' To show my appreciation for your generosity, I will give you this sacred fruit. Keep it close to you. You will know when you need it in the future.'\n";
        prompt += "' Thank you, sir. I really appreciate your hospitality.'\n";
        prompt += "\n *treasure + 1* \n";

        _treasure.add("strange blue apple");

        prompt += "Noticing your friends are already so far ahead, you quickly stuff the fruits away into your bag before rushing to catch up to them and the pheonix ahead. \n";
        prompt += "Luckily, you noticed there was a map at your previous meet-up location. You realize your friends must have left it behind  so you could follow.\n";
        prompt += " Following the instructions on the map, you begin walking towards this unknown destination before finally arriving at a large castle made surprisingly of stone and glass.\n";
        prompt += " Seeing your friends are actually about to enter, you quickly break into a run: just making it in time. \n";
        prompt += " Upon entering the castle, you see the same pheonix you have been chasing at the very beginning fly into a massive hall to a room filled with mirrors.\n";
        prompt += " You and your friends decided to continue following the creatures, hoping to understand its behaviors. \n";
        prompt += " After entering the room, you see the pheonix actually bowing its heads to you, almost kneeling down before a shifting glass window.\n";
        
        prompt += " One of your friends rushes over to this enigmatic window before exclaiming it is a portal! \n";
        prompt += " Confused, you ask him how he knows such a fact to which he replied he saw other creatures entering this similar portal to travel between the worlds. \n";
        prompt += " Though reluctant at first, you realize you have no other alternative but this portal to go home so you and your friends decide to take the leap of faith and walk through the mirror. \n";
        prompt += " Whoosh! As your visions start blackening and you see the world melts around you, you and your friends suddenly wake up in the same cabin as if nothing had ever happened.\n";
        prompt += " You have made it back home!\n";
        
        System.out.print(prompt);

        Mirror onTheWall = new Mirror(__name, _treasure);
    }

}//city class end
