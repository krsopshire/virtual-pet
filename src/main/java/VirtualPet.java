import java.util.Scanner;


public class VirtualPet {
	Scanner input = new Scanner(System.in);

	private String name;
	private String breed;
	private String furColor;
	private String petTask;
	private int hunger = 50;
	private int thirst = 50;
	private int boredom = 100;
	private int waste = 100;
	private int cleanliness = 100;
		
	
	//Name
	public String getName() {
		return name; }
	public void setName(String name) {
		this.name = name; }
	
	//Breed
	public String getBreed() {
		return breed; }
	public void setBreed(String breed) {
		this.breed = breed;	}
	
	//Fur Color
	public String getFurColor() {
		return furColor; }
	public void setfurColor(String furColor) {
		this.furColor = furColor; }
	
	//Hunger
	public int getHunger() {
		return hunger; }
	public void setHunger(int hunger) {
		this.hunger = hunger; }

	//Thirst
	public int getThirst() {
		return thirst; }
	public void setThirst(int thirst) {
		this.thirst = thirst; }
	
	//Boredom
	public int getBoredom() {
		return boredom; }
	public void setBoredom(int boredom) {
		this.boredom = boredom; }
	
	//Waste
	public int getWaste() {
		return waste; }
	public void setWaste(int waste) {
		this.waste = waste; }
	
	//Cleanliness
	public int getCleanliness() {//Getter
		return cleanliness;}
	public void setCleanliness(int cleanliness) {//Setter
		this.cleanliness = cleanliness;
	}
	
	//Name
	public String petTask() {
		return petTask; }
	public void petTask(String task) {
		this.petTask = task; }	

	//Default Constructor
	public VirtualPet (String name, String breed, String furColor) {
		this.name = name;
		this.breed = breed;
		this.furColor = furColor;
	}
	
	
	public void Poop() {
		this.cleanliness = this.cleanliness -10;
		this.hunger = this.hunger +10; 
		this.thirst = this.thirst +10; 
		this.waste = this.waste -20;
		}
		
	public void Eat() {
		this.hunger = this.hunger -10;
		this.thirst = this.thirst +10; 
		this.waste = this.waste +10;
		}
	
	public void Drink() { 
		this.thirst = this.thirst -10; 
		this.waste = this.waste +10;
		}
	
	public void Play( ) {
		this.boredom = this.boredom -20;
		this.thirst = this.thirst +10; 
		Tick();}
	
	public void Bathe( ) {
		this.cleanliness = this.cleanliness +20; 
		Tick();}
	
	public void Tick() {
		this.hunger = this.hunger +10;
		this.cleanliness = this.cleanliness -10;
		this.waste = this.waste +10;
		this.thirst = this.thirst +10;
		this.boredom = this.boredom +20;
		
	}
	}
