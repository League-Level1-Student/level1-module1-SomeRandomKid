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

public class Smurf {
	public static void main(String[] args) {
		Smurf Boi = new Smurf("Dingle");
		Boi.eat();
		String x = Boi.getName();
		System.out.println(x);
		Smurf Why = new Smurf("Papa Smurf");
		String y = Why.getName();
		System.out.println(y);
		String z = Why.getHatColor();
		System.out.println(z);
		String a = Why.isGirlOrBoy();
		System.out.println(a);
		Smurf Why2 = new Smurf("Smurfette");
		String b = Why2.getName();
		System.out.println(b);
		String c =  Why2.getHatColor();
		System.out.println(c);
		String d = Why2.isGirlOrBoy();
		System.out.println(d);
	}

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
			return "My hat is red";
		}else {
			return "My hat is white";
		}
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		// 4. Fill in this method
			if (name.equals("Smurfette")) {
				return "I am a girl";
			}else {
				return "I am a boy";
			}
		}
	}



