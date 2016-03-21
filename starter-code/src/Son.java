/**
 * Created by JHADI on 3/21/16.
 */
public class Son extends Family {
    String name;
    public Son(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " eating pizza.");
    }

    @Override
    public void goToBathroom() {
        System.out.println(name + " takes a 5 min shower.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " goes to sleep at 2am for 5 hours.");
    }
}
