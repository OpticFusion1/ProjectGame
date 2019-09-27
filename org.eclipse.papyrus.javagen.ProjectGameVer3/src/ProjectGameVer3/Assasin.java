// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package ProjectGameVer3;


/************************************************************/
/**
 * 
 */
public class Assasin extends Hero {

	/**
	 * Default parameters for an Assasin.
	 */
	public Assasin() {
		super();
		this.name = "Assasin";
		this.attackPower = 80;
		this.maxHP = 45;
		this.hp = this.maxHP;
	}

	/**
	 * Initializes an Assasin with an attack power, name and Max Health points.
	 * @param attackPower
	 * @param name
	 * @param maxHP
	 */
	public Assasin(int attackPower, String name, int maxHP) {
		super(attackPower, name, maxHP);
		this.name += " the Assasin";
	}

	/**
	 * Initializes an Assasin with a name and default parameters.
	 * @param name
	 */
	public Assasin(String name) {
		super(name);
		this.name += " the Assasin";
		this.attackPower = 80;
		this.maxHP = 45;
		this.hp = this.maxHP;
	}
	
};