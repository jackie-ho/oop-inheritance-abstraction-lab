import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		//Create households and add to list or array
		DogeHouse house1 = new DogeHouse(300000, new Dog("Ruff",2));
		CatHouse house2 = new CatHouse(1000000, new Cat("Neko",6));
		DogeHouse house3 = new DogeHouse(15000, new Dog("Chien",1));
		Household[] households = new Household[]{house1,house2,house3};

		//iterate through list or array and perform required actions

		for (Household household:households){
			household.gainIncome();
			household.payTaxes();
			String petName = household.getPet().getName();
			System.out.println(" Name of pet is: "+petName);
			household.getPet().feed();
			household.getPet().groom();
			household.getPet().play();
		}

		Pet[] allPets = new Pet[]{house1.getPet(),house2.getPet(),house3.getPet()};
		//sort by pet age;
		System.out.println("Before sorting by age: "+Arrays.toString(allPets));
		Arrays.sort(allPets);
		System.out.println("After sorting by age: "+Arrays.toString(allPets));

		Mother mother = new Mother("Momma");
		Son son = new Son("Sonny");
		Family[] families = new Family[]{mother,son};
		for (Family family : families){
			family.eat();
			family.goToBathroom();
			family.sleep();
		}




	}

}
