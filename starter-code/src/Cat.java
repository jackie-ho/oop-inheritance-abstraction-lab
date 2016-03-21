/**
 * Created by JHADI on 3/21/16.
 */
public class Cat extends Pet {
    String name;

    public Cat(String name, int age) {
        super(name, age);
        this.name = name;
    }

    @Override
    public void groom() {
        System.out.println("Brush "+name+" fur");
    }

    @Override
    public void play() {
        System.out.println("Give "+name+" a ball of yarn");
    }

    @Override
    public void feed() {
        System.out.println("Let "+name+" hunt mice in basement");
    }

    @Override
    public String toString() {
        return name;
    }
}
