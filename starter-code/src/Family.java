/**
 * Created by JHADI on 3/21/16.
 */
public abstract class Family {
    String name;
    public Family(String name){
        this.name = name;
    }

    public abstract void eat();
    public abstract void goToBathroom();
    public abstract void sleep();

}
