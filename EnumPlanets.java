//Created By: Nicholas Brean
//Created on Nov 2018
//Created to Print out Planets using Enums
import java.util.Scanner;
public class EnumPlanets {
	public static void main(String args[]) {
		Scanner userInput = new Scanner(System.in);
		String userPlanetChoice;
		
		for (PLANETS d: PLANETS.values())
		{
		  System.out.println(d);
		}
		System.out.println();
		System.out.print("Choose one of the above planets: ");
		
		userPlanetChoice = userInput.nextLine();
		
		PLANETS planetName = PLANETS.valueOf(userPlanetChoice.toUpperCase());
		//System.out.print(planetName);
		
		switch (planetName){
			case MERCURY:
				System.out.println("You chose " + PLANETS.MERCURY + " which is the " + PLANETS.MERCURY.position + "st planet in the Solar System");
				break;
			case VENUS:
				System.out.println("You chose " + PLANETS.VENUS + " which is the " + PLANETS.VENUS.position + "nd planet in the Solar System");
				break;
			case EARTH:
				System.out.println("You chose " + PLANETS.EARTH + " which is the " + PLANETS.EARTH.position + "rd planet in the Solar System");
				break;
			case MARS:
				System.out.println("You chose " + PLANETS.MARS + " which is the " + PLANETS.MARS.position + "th planet in the Solar System");
				break;
			case JUPITER:
				System.out.println("You chose " + PLANETS.JUPITER + " which is the " + PLANETS.JUPITER.position + "th planet in the Solar System");
				break;
			case SATURN:
				System.out.println("You chose " + PLANETS.SATURN + " which is the " + PLANETS.SATURN.position + "th planet in the Solar System");
				break;
			case URANUS:
				System.out.println("You chose " + PLANETS.URANUS + " which is the " + PLANETS.URANUS.position + "th planet in the Solar System");
				break;
			case NEPTUNE:
				System.out.println("You chose " + PLANETS.NEPTUNE + " which is the " + PLANETS.NEPTUNE.position + "th planet in the Solar System");
				break;
		}
		
	}
	
	enum PLANETS {
		MERCURY("1"),
		VENUS("2"),
		EARTH("3"),
		MARS("4"),
		JUPITER("5"),
		SATURN("6"),
		URANUS("7"),
		NEPTUNE("8");
		
		private final String position;
		
		private PLANETS(String position) {
			this.position = position;
		

		}
		
	}

}
