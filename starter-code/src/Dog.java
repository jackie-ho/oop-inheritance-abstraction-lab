/**
 * Created by JHADI on 3/21/16.
 */
public class Dog extends Pet {
    String name;
    public Dog(String name, int age) {
        super(name, age);
        this.name = name;
    }

    @Override
    public void groom() {
        System.out.println("Throw "+ name+" into a body of water");
    }

    @Override
    public void play() {
        System.out.println("Take "+ name+" out for walk and play fetch");
    }

    @Override
    public void feed() {
        System.out.println("Feed "+ name+" with food scraps left over from dinner");
    }

    @Override
    public String toString() {
        return name;
    }
}
