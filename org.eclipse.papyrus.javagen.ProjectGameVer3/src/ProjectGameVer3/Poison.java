// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package ProjectGameVer3;

import ProjectGameVer3.Potions;

/************************************************************/
/**
 * 
 */
public class Poison extends Potions {
	
	/**
	 * 
	 */
	public Poison() {
		super();
		this.name="Poison Potion";
	}

	/**
	 * @param name
	 */
	public Poison(String name) {
		super(name);
		
	}
	/**
	 *This is the drink function defined for poisoning the drinker.
	 */
	@Override
	public void drink(Hero drinker) {
		drinker.poisoned=3;
		drinker.setName(drinker.name+"(poisoned)");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(drinker.name+" gets poisoned by "+this.name);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
	}
};
