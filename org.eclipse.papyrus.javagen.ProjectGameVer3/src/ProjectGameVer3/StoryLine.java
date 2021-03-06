// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package ProjectGameVer3;

import java.util.ArrayList;


/************************************************************/
/**
 * 
 */
public class StoryLine {
	
	/**
	 * Empty default constructor.It can be used to initialize a StoryLine class to generate
	 * help display.
	 */
	public StoryLine() {
	}

	/**
	 * This initializes the the StoryLine using a team of heros.
	 * @param teamHeros
	 */
	public StoryLine(ArrayList<Hero> teamHeros) {
		this.teamHeros = teamHeros;
	}

	/**
	 * An array of strings that stores the story.
	 */
	private String[] storyList= new String[10];
	/**
	 * A list of heros which the user selects.
	 */
	private ArrayList<Hero> teamHeros;

	/**
	 * A function that generates the Story List.Any modification to story can be done here.
	 */
	public void genStory() {
		this.storyList[0]= new String("As the sunsets, the brave and courageous heroes descend into the deep dark EtherDungeons,"+"\n"+"a team of heros : "+this.teamHeros.get(0).getName()
				+", "+this.teamHeros.get(1).getName()+", "+this.teamHeros.get(2).getName()+", "+this.teamHeros.get(3).getName()+", "+"\n"+this.teamHeros.get(2).getName()+" lights a fire torch to guide the team, just as the light spreads to the room...\nThey see a casket "+this.teamHeros.get(2).getName()+" inquisitively opens it to see potions then...");					
				this.storyList[1]= new String("The alert and aware heros after an enticing battle, take their first steps towards the second dungeon chamber."+"\n"+"They slowly tiptoe across the hall not to awaken the beast, near one of the pillars they see a bright casket...");
				this.storyList[2]= new String("'CacaRumpapapa' the  battle cry of the Heros prevails over the Monsters, \n"+this.teamHeros.get(2).getName()+" motivates the edgy heros to once again recuperate and go to the inner sanctums of the dungeon.\n"+"Brushing off the wounds the heros embark on the journey,"
						+ "\nas they get closer, the familiar casket with potions is seen... ");
				this.storyList[3]= new String("Heros can feel that they are at the grasps of victory as they move to the penultimate dungeon,\nthey shuffle across the "
						+ "hallways all of a sudden 'ACHHHHHCCACHHH' a cracking sound is heard \nall the heros draw their weapons anticipating a large monster, as they turn their heads \n they see "+this.teamHeros.get(3).getName()+" wiping his nose. 'Shhhh'a simulataneous order from all the "
								+ "heros , \nThe same bright glow of the lucky/unlucky casket is seen and\n"+this.teamHeros.get(3).getName()+"opens it then...");
				this.storyList[4]= new String("The heros may have obliterated the monsters until now!! \nNow comes the final destination for each one of them where the survival of the fittest comes \ninto play...Its upto "+this.teamHeros.get(1).getName()+" and "
						+"team to lift the curse from the dungeons \nbefore  the showdown one last chance to get something special...");
				this.storyList[5]= new String("...A large grunt is heard, the heros turn their heads only to see... ");
				this.storyList[6]= new String("...they carry forward their journey to the second chamber...");
				this.storyList[7]= new String("...moving on,a large display of human skull comes to be seen 'This is the sacred room of Monsters,\nbeware tresspasser'. Undettered the heros step in the room...the heros lift their heads only to see... ");
				this.storyList[8]= new String("...the troupe quietly they make their way to another monsters resting place...");
				this.storyList[9]= new String("...THE SHOWDOWN... ");
				return ;
	}

	/**
	 * A function to display help.
	 */
	public void genHelp() {
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("This is a RPG text based Java Game where you need to select a team of \n"
				+ "four heros and embark on a conquest to free Etherdungeons...");
		System.out.println("The Heros: \nAsssasin:\t High attack,low HP \nWarrior:\t Medium attack, above-average HPs \nPaladin:\t Low attack, high HPs \nCleric:\t  Does not attack but heal instead (target an ally and give them back HPs), low HPs"
				+ "\nRogue:\t  Medium attack, low HPs, poisons the target (A poisoned target will lose 3 HPs at the beginning of its turn up to three times \nBerserker:\t Medium attack, below-average HPs, gets heal on kill (When berserkers kill a monster, they recover 5 HPs)  \nMonk:\t  High attack, low HPs, can dodge attacks (When hit, the monk have a 33% chance to dodge the attack, avoiding HP damage completely)"
				+ "\nDuelist:\t Above-average attack, medium HPs, attacks twice (Instead of attacking once and ending its turn, the Duelist attack a first target, then a second, then the turn is over) \nDefender:\t Below-average attack, above-average HPs, retaliate when hit, 50% chance of being targeted.");
		System.out.println("The Monsters: \nSpider:\t Low attack, low HP, can poison its target (same effect as the Rogue) \nMummy:\t High attack, medium HP, only attacks once every two turns \nSlime:\t Low attack, low HP, the character hit by the attack loses the next turn"
				+ "\nOrc:\t High attack, medium HP an can activate Orc boost on killing a hero \nOgre:\t Medium attack, High HP \nKing Koopa(Manticore):\t High attack, High HP and can ward off attacks, it is like a boss monster");
		System.out.println("Potions are always given at the beginning of every encounter.\n"
				+ "The kinds of potions available are...it will be a Suprise");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("Credits: Text taken from Project Specification 2019 for OOPS at ISAE SUPAERO,given by Mr Clement Michel");  
	}

	/**
	 * @return the storyList
	 */
	public String[] getStoryList() {
		return storyList;
	}

	
};
