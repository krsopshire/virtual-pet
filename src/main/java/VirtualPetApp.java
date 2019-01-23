
import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		Scanner task = new Scanner(System.in);
		VirtualPet a = new VirtualPet("Ella", "Dog", "Black, Brown and White");
		
		System.out.println ("What is your pet's name?");
		a.setName(rd.nextLine());
		
		System.out.println ("What kind of pet is it?");
		a.setBreed(rd.nextLine());
		
		System.out.println ("What color is it?");
		a.setfurColor(rd.nextLine());
		
		//Game Starts Here
		System.out.println("\nName:" + " " + a.getName());
		System.out.println("Breed:" + " " + a.getBreed());
		System.out.println("Fur Color:" + " " + a.getFurColor());
		System.out.println("Hunger:" + " " + a.getHunger());
		System.out.println("Thirst:" + " " + a.getThirst());
		System.out.println("Boredom:" + " " + a.getBoredom());
		System.out.println("Waste:" + " " + a.getWaste());
		System.out.println("Cleanliness:" + " " + a.getCleanliness());
		
		System.out.println ("\nWhat do you want to with" + " " + a.getName() + " " + "today?");
		System.out.println ("1: Feed");
		System.out.println ("2: Give Water");
		System.out.println ("3: Play");
		System.out.println ("4: Take Outside");
		System.out.println ("5: Bathe");
		
		String petTask = task.next();	
		
		switch (petTask) {
			case "1": 
				System.out.println ("\nYou fed" + " " + a.getName());
				break;
			case "2": 
				System.out.println ("\nYou gave water to" + " " + a.getName());
				break;
			case "3": 
				System.out.println ("\nYou played with" + " " + a.getName());
				break;
			case "4": 
				System.out.println ("\nGood job outside, " + " " + a.getName());
				break;
			case "5": 
				System.out.println ("\nYou bathed" + " " + a.getName());
				break;
			default: 
				System.out.println ("Please choose a valid choice!");
			}
}
}
