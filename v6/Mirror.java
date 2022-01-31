import java.io.*;
import java.util.ArrayList;

public class Mirror{
	protected String __name;
    protected String prompt;
	protected ArrayList<String> _treasure;

	protected int playerChoice;
	protected boolean gameOver;

	protected InputStreamReader isr;
	protected BufferedReader br;

	public Mirror() {
		gameOver = false;
		isr = new InputStreamReader( System.br );
		br = new BufferedReader( isr );
		playerChoice = 0;

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
        String prompt = "Blinking yoru eyes to adjust to the new light, you find yourself in a completely new forest brooming with vegetation and animal life. \n ";
        prompt += "Looking around, you and your friends investigate the surrounding environment in hopes of finding anyone or anything that could help you get back home. \n";
        prompt += "After what seemed like to be a 15 minute walk, you encounter a an eagle with a lower body of a lion parched upon one of the branches. It's a gryffin, you realized! \n";

        prompt += "\t1: Bow in respect\n";
        prompt += "\t2: Prepare for battle! \n";
        prompt += "Selection: ";
        System.out.print( prompt );

        try {
            choice  = Integer.parseInt( br.readLine() );
        }

        catch ( IOException e ) { }

        if (playerChoice == 1) {
            kind();
        }
        else {
            stabby();
        }
    }

    public void kind() {
        String prompt = "Watching in awe of the legendary creature in front of you, you decide the wisest choice would be to kneel down in respect. Placing one knee down on the ground, you bow your head down as a form of deference to which the gryffin responds in a happy squack and proceeds to bow back.\n";
        prompt += "Grinning at this encounter, you slowly reached your hands out almost as if asking the creature for permission to touch it. The gryffin joyfully obliges, and you proceed to pet the incredible animal. \n";
        prompt += "It squacks in delight from your gentle touch before turning around, gesturing for you to get on its back with its head. \n";
        prompt += "Realizing the creature is asking us to climb on its back, the two of you gently climbed over the creature and held fervently onto its fur.\n"; 
        prompt += "Once both of you are steadily secured, the gryffin flaps its powerful wings, blowing a heavy gush of wind, and propels itself into the air.\n ";
        prompt += "You and your friend exclaim in both terror and joy at the view you are seeing, almost 500 feet in air. The next few minutes are full of wide emotions, before eventually the gryffin begins to descend.\n";
        prompt += "With a gentle stop, the gryffin lands softly on the ground, in front of what appears to be a giant portal. \n";
        prompt += "Sliding off the gryffin's back, you following gryffin towards the portal, realizing this was your ticket home.\n";
        prompt += "Mysteriously, both your friends begin hearing a voice confirming your thoughts. Ecstatic you and your friend thank the gryffin and pet it for the final time before entering the portal to go back home.\n";

        prompt += "\n *portal whooshing noises* \n";

        prompt += "Opening your eyes, you have arrived back onto the same cabin you were on the nights before. You rush outside to see if your friend has made it, only to see your friend also doing the same.";
        prompt += "Welcome back home. \n";

        if (_treasure.size() > 0) {
            s += "Feeling a weight in your pockets, you curiously reach inside your pockets to see what you find. \n";
            for (int i = 0; i < _treasure.size(); i++){
                prompt += _treasure.get(i);
                prompt += "\n";
            }
            prompt += "Taking the object out, you surprisingly realize it is a treasure! n";
        }
        
        System.out.print(prompt);
    }
    
    public void stabby() {
        String prompt = "Balling your fist into a punch, you thrust your fist with all your power into the gryffin's eye. \n ";
        prompt += "The gryffin cries in agony before growling in rage and devoring you whole in a single bite. \n";

        System.out.print(prompt);
    }


}
