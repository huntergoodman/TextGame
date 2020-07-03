public class Game {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter your name: ");
		String heroName = input.next();
		
		System.out.println("Enter your race: ");
		int heroRace = input.nextInt();
		
		System.out.println("Here is a list of the different classes: ");
		System.out.println("Enter your class: ");
		int heroClass = input.nextInt();
		
		System.out.println("Name: " + heroName);
		
		// Class Display
		if (heroClass == 1) {
			System.out.println("Class: Warrior");
		} else if (heroClass == 2) {
			System.out.println("Class: Rogue");
		}
		
		// Race Display
		if (heroRace == 1) {
			System.out.println("Race: Human");
		}
		
		//Hero Class Case Switch
		switch(heroClass) {
		//Warrior Class
			case 1:
				Hero warrior = new Hero(10,10);
				
				System.out.println("Def: " + warrior.def);
				System.out.println("SP: " + warrior.sp);
				break;
		//Rogue Class
			case 2:
				Hero rogue = new Hero(4,20);
				
				System.out.println("Def: " + rogue.def);
				System.out.println("SP: " + rogue.sp);
				break;
			default:
				System.out.println("Please choose a valid class.");
		}
		//Race Case Switch
		switch(heroRace) {
			case 1:
				Race human = new Race(20);
				
				System.out.println("Hp: " + human.hp);
		}

	}

}
