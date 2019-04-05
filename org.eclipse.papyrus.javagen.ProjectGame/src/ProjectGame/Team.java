package ProjectGame;

public class Team {
	public Hero [] hero=new Hero[4];
	public Monster[] monster=new Monster[6];
	

	public Team() {
		super();
		this.hero[0]= new Warrior (60,100,"Vaidyanath1");
		this.hero[1]= new Assasin (100,60,"Vaidyanath2");
		this.hero[2]= new Paladin (10,150,"Vaidyanath3");
		this.hero[3]= new Cleric (55,60,"Vaidyanath4");
		this.monster[0] = new Spider (30,60,"Vaidyanath5");
		this.monster[1] = new Mummy (60,70,"Vaidyanath6");
		this.monster[2] = new Slime (10,50,"Vaidyanath7");
		this.monster[3] = new KingKoopa (90,190,"Vaidyanath8");
		this.monster[4] = new Orc (90,100,"Vaidyanath9");
		this.monster[5] = new Ogre (90,100,"Vaidyanath10");
	}

	public Hero[] getHeros() {
		return hero;
	}

	public Monster[] getMonster() {
		return monster;
	}

	public void setMonster(Monster[] monster) {
		this.monster = monster;
	}

	public void setHeros(Hero[] hero) {
		this.hero = hero;
	}
	public String toString() {
		return String.format(this.hero[0]+" | "+this.monster[0]+"\n"+this.hero[1]+" | "+this.monster[1]+"\n"+this.hero[2]+" | "+this.monster[3]+"\n"+this.hero[3]+"\n");
	}

	
	

};
