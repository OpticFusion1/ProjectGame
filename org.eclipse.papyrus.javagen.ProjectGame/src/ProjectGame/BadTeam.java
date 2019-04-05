package ProjectGame;

public class BadTeam {
	private Monster [] monster=new Monster[6];

	public BadTeam() {
		super();
		this.monster[0] = new Spider (30,60,"Vaidyanath5");
		this.monster[1] = new Mummy (60,70,"Vaidyanath6");
		this.monster[2] = new Slime (10,50,"Vaidyanath7");
		this.monster[3] = new KingKoopa (90,190,"Vaidyanath8");
		this.monster[4] = new Orc (90,100,"Vaidyanath9");
		this.monster[5] = new Ogre (90,100,"Vaidyanath10");
	}

	public Monster[] getMonster() {
		return monster;
	}
	public String toString() {
		return String.format("\t"+this.monster[0]+"\n"+this.monster[1]+"\n"+this.monster[2]+"\n"+this.monster[3]+"\n");

	}
};
