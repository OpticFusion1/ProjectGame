// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package ProjectGame;

import java.util.ArrayList;
import java.util.Scanner;

import ProjectGame.Encounter;

/************************************************************/
/**
 * 
 */
public class Game {
	/**
	 * 
	 */
	public Encounter [] encounter = new Encounter[5];
	public InitTeams initgame;

	/**
	 * 
	 */
	/**
	 * 
	 */
	public Game() {
		super();
		this.initgame = new InitTeams();
	}
	
	public void dispData() {
		char option;
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the dugeons of EtherDragon");
		System.out.println("***************************************************************");
		System.out.println("It has always been misty in EtherDragon from when the curse of wicked wizard Etherian was cast");
		System.out.println("***************************************************************");
		System.out.println("Are you ready to take on the challenge to restore glory to this place and clear the mist ?");
		System.out.println("A.Bring it ON !!");
		System.out.println("B.I'm scared and want to exit");
		option = in.next().charAt(0);
		switch(option) {
		case 'A':
			ArrayList <Hero> k  = this.initgame.selectHeroes();
			for(int i=0 ; i <5 ; i++) {
				ArrayList <Monster> m= this.initgame.randMonsters();
				encounter[i] = new Encounter(m,k);
			}
			System.out.println("The sunsets as "+encounter[0].getTeamHeros().get(0).getName()+", "+encounter[0].getTeamHeros().get(1).getName()
					+", "+encounter[0].getTeamHeros().get(2).getName()+", "+encounter[0].getTeamHeros().get(3).getName()+" begin the quest ");
			for(int j=0 ; j<=encounter.length; j++) {
				System.out.println("Welcome to stage: "+(j+1));
				while(encounter[j].indicatorWin == 0) {
					encounter[j].heroChance();
					encounter[j].monstersChance();
					System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
					encounter[j].choice();
				}
				if(encounter[j].indicatorWin ==1) {
					encounter[j].getFaintHeros();
				}
				if(encounter[j].indicatorWin ==2) {
					System.out.println("Game Over Sucker!");
					break;
				}
			}
			if(encounter[4].indicatorWin ==1) {
				System.out.println("Congraulations! You freed etherdragon from the etharian curse");
			}
			//encounter[1].heroChance();
			//encounter[1].monstersChance();
			//System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			//encounter[1].choice();
			in.close();
			
			break;
		case 'B':
			System.out.println("Ha haah haa , Coward.See you in your dreams muhahaaha!!");
			break;
			}
	}
	
	
	
};