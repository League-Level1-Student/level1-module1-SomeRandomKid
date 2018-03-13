/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

/* 
 * 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. 
 */
class Runner {
	public static void main(String[] args) {
		Smurf Boi = new Smurf("Dingle");
		Boi.eat();
		Boi.getName();
		Smurf Why = new Smurf("Papa Smurf");
		Why.getName();
		Why.getHatColor();
		Why.isGirlOrBoy();
		Smurf Why2 = new Smurf("Smurfette");
		Why2.getName();
		Why2.getHatColor();
		Why2.isGirlOrBoy();
		
	}
}

public class Smurf {

	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		// 3. Fill in this method
		if (name.equals("Papa Smurf")) {
			return "red";
		}else {
			return "white";
		}
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		// 4. Fill in this method
			if (name.equals("Smurfette")) {
				return "girl";
			}else {
				return "boy";
			}
		}
	}



