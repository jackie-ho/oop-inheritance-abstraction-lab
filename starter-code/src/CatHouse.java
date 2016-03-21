/**
 * Created by JHADI on 3/21/16.
 */
public class CatHouse extends Household {
    Pet petCat;
    int income;

    public CatHouse(int yearlyIncome, Pet householdPet) {
        super(yearlyIncome);
        income = yearlyIncome;
        petCat = householdPet;
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
        return petCat;
    }



    @Override
    public int getYearlyIncome() {
        return super.getYearlyIncome();
    }
}
