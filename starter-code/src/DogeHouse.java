/**
 * Created by JHADI on 3/21/16.
 */
public class DogeHouse extends Household {

    int income;
    Pet dogPet;

    public DogeHouse(int yearlyIncome, Pet householdPet) {
        super(yearlyIncome);
        income = yearlyIncome;
        dogPet = householdPet;
    }

    @Override
    public void payTaxes() {
        //tax bracket of30%
        double taxesPaid = income*0.30;
        System.out.println("Paying yearly taxes of: "+taxesPaid);
    }

    @Override
    public void gainIncome() {
        System.out.println("Made yearly income of :"+income);
    }

    @Override
    public Pet getPet() {
        return dogPet;
    }

    public int getIncome() {
        return income;
    }
}
