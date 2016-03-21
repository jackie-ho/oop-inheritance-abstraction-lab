/**
 * Created by JHADI on 3/21/16.
 */
public abstract class Household {
    int yearlyIncome;

    public Household(int yearlyIncome) {
        this.yearlyIncome = yearlyIncome;
    }

    public int getYearlyIncome() {
        return yearlyIncome;
    }

    public abstract void payTaxes();

    public abstract void gainIncome();

    public abstract Pet getPet();

}
