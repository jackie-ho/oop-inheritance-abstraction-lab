/**
 * Created by JHADI on 3/21/16.
 */
public class Mother extends Family {
    String name;
    public Mother(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name +" eating salad.");
    }
    @Override
    public void goToBathroom() {
        System.out.println(name + " spends 2 hours in bathroom.");

    }
    @Override
    public void sleep() {
        System.out.println(name + " goes to bed at 11 at night.");

    }

    @Override
    public String toString() {
        return name;
    }
}
