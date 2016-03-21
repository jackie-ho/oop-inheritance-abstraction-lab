import java.util.Comparator;

/**
 * Created by JHADI on 3/21/16.
 */
public abstract class Pet implements Comparable<Pet>{
    String name;
    int age;
    public Pet(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract void groom();
    public abstract void play();
    public abstract void feed();

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Pet o) {
        if (this.getAge() == o.getAge()){
            return 0;
        } else if (this.getAge() > o.getAge()){
            return 1;
        } else {
            return -1;
        }
    }
}
