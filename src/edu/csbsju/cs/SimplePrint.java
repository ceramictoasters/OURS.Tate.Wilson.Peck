package edu.csbsju.cs;

/**
 * Eclipse Exercise
 * Group: Ceramic Toasters
 * Subgroup Members: Colin Tate
 * 					 Mitch Peck
 * 					 Tyler Wilson
 * @author Tate, Peck, & Wilson
 * @version March 12th, 2018
 */
public class SimplePrint {
	
	// pName variable
	private String pName;
	// pAge variable
	private int pAge;
	
	/**
	 * Main constructor of the class
	 * @param pName
	 * @param pAge
	 */
	public SimplePrint(String pName, int pAge) {
		super();
		this.pName = pName;
		this.pAge = pAge;
	}
	
	/**
	 * Default constructor of the class
	 */
	public SimplePrint() {
		this.pName = "";
		this.pAge = 0;
	}

	/**
	 * Main method of the class
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Ceramic Toasters:\nSubgroup Members:\n -Colin Tate\n -Mitch Peck\n -Tyler Wilson");

		for (int i=0;i<args.length;i++) {
			System.out.println("args[ " + i + " ] = " + args[i]);
		}
	}

	/**
	 * Getter method for pName
	 * @return the pName
	 */
	public String getpName() {
		return pName;
	}

	/**
	 * Setter method for pName
	 * @param pName the pName to set
	 */
	public void setpName(String pName) {
		this.pName = pName;
	}

	/**
	 * Getter method for pAge
	 * @return the pAge
	 */
	public int getpAge() {
		return pAge;
	}

	/**
	 * Setter method for pAge
	 * @param pAge the pAge to set
	 */
	public void setpAge(int pAge) {
		this.pAge = pAge;
	}

}
