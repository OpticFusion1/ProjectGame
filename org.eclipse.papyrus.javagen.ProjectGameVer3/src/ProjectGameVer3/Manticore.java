// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package ProjectGameVer3;


/************************************************************/
/**
 * 
 */
public class Manticore extends Monster {

	/**
	 * Any Manticore initialized without any parameter will be a King Koopa with 35% dodge chance.
	 */
	public Manticore() {
		super();
		this.name = "King Koopa";
		this.attackPower = 90;
		this.maxHP = 100;
		this.hp = this.maxHP;
		this.dodgeChance = 0.35;
	}

	/**
	 * This initializes an Orc with   name , Attack Power and max health points.
	 * @param attackPower
	 * @param name
	 * @param maxHP
	 */
	public Manticore(int attackPower, String name, int maxHP) {
		super(attackPower, name, maxHP);
		this.name += " the Boss Monster";
		this.dodgeChance = 0.75;
	}

	/**
	 * Any Manticore initialized with a name will be a Boss Monster with 55% dodge chance.
	 * @param name
	 */
	public Manticore(String name) {
		super(name);
		this.name += " the Boss Monster";
		this.attackPower = 90;
		this.maxHP = 100;
		this.hp = this.maxHP;
		this.dodgeChance = 0.75;
	}
	
};
