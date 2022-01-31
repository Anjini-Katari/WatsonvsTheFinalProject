import java.io.*;
import java.util.ArrayList;

public class UpMountain {
	protected String __name;
    protected String prompt;
	protected ArrayList<String> _treasure;

	protected int playerChoice;
	protected boolean gameOver;

	protected InputStreamReader isr;
	protected BufferedReader br;


	public UpMountain() {
		gameOver = false;
		isr = new InputStreamReader( System.br );
		br = new BufferedReader( isr );
		playerChoice = 0;

	}

	public UpMountain( String name, ArrayList<String> treasure) {
		this();
	        __name = name;
		_treasure = treasure;
		Mountain();
    	}

    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
	public String getName() { return __name;}
	public ArrayList<String> getTreasure() { return _treasure; }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	public void Mountain() {
		String prompt = "Ascending up the mountain, you and your friends suddenly encounter two magical beings! \n 
        In front of you was a majestic pheonix whose eyes light upnas it telepathically beckons for you to follow it. \n 
        On the other hand was the pixie who rolls its eyes before sarcastically saying, 'Don't listen to that pheonix of a fool! Follow me instead!' ";
		prompt += "Who will you follow? \n";
		prompt += "\t1: The pheonix \n";
		prompt += "\t2: The pixie \n";
		prompt += "Selection: ";
		System.out.print( prompt );

		try {
			playerChoice  = Integer.parseInt( br.readLine() );
                }

		catch ( IOException e ) { }

                if (playerChoice == 1) {
			pheonix();
                }
                else {
			pixie();
                }
	}

	public void pixie() {
		String prompt = "Seeing you choose the second route, the pixie giggles in light before flying off, , leaving a trail of pixie dust behind for you to follow. 
        \n Following this path, you eventually see yourself in the entrance of a small witches hut. You start to experience a bad feeling in your stomach, but you decide to enter anyway.
        \n As the door slowly creaks open, you encounter a witch! \n";
		prompt += "The witch cackles mysteriously, '";
		prompt += getName();
		prompt += " right? I've heard all about you, young fellow...' Seeing the venomous looks behind her eyes, your inner danger alarm blarres out frantically. As you slowly make your way back to the door, the witch cackles again, 'don't worry, I'll make sure everything is as painless as possible \n'";
		prompt += "\t1: run \n";
                prompt += "\t2: FIGHT \n";
                prompt += "Selection: ";
                System.out.print( prompt );

                try {
                        choice  = Integer.parseInt( br.readLine() );
                }

                catch ( IOException e ) { }

                if (playerChoice == 1) {
                        run();
                }
                else {
                        fight();
                }
	}

	public void run() {
		String prompt = "Knowing you have no way to defeat this witch, you bolt towards the front door and run away as fast as you possibly can knowing you would die if she laid her hands on you. Somehow, you made it back log cabin and see no pursuit of the witch behind you. You must have lost her in your escape. Perhaps you should try a different path this time instead... \n";
		System.out.print( prompt );
		Cabin.cabin();
	}

	public void fight() {
		String prompt = "You decide to fight! \n 
        With the adrenaline coursing through your vewins, you punch the witch in the face with all your might as your friend finds a nearby weapon of a water bucket and slams it onto her.\n
        Screaming, the witch begins to slowly dissolve as she clutches her face in pain and tried to curse you and your friends.\n 
        After a few moments of horrifying sight, you both watch her body completely dissolve with only a small obsidian horse at the center of the puddle. \n
        Disgustingly, you pick up the horse and place it in your pocket. \n ";

		_treasure.add("tiny obsidian horse");
		prompt += "\n *treasure + 1*";
		prompt += "\n Taking another look around the hut, you and your friend sought to salvage any leftover materials that might be helpful on your way back home. Unfortunately, you find nothing of value and proceed to make your way back to the cabin.\n";
		System.out.print(prompt);
		Cabin trees = new Cabin(__name, _treasure);
	}
	public void pheonix() {
		String prompt = "Knowing the pheonix is a symbol of rebirth, you decide to follow the pheonix as a new beginning. The pixie flys off in anger before the pheonix nods slightly in approval and leads you up a rocky path. \n";
		prompt += "Following the creature, you soon arrive at a massive clear lake to which the pheonix beckons you to follow before diving headfirst into the water. \n";
		prompt += "After a brief moment of hesitation, you decide to take the leap of faith and jump into the unknown water with your friend doing the same close behind.\n";
		System.out.print(prompt);
		City atlantis = new City(__name, _treasure);

	}


}
