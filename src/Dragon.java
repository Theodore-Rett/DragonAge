import DragonAgeState.Age;
import DragonAgeState.Hatchling;
import DragonColourState.*;

public class Dragon {

    private double age;
    private Age ageState;
    private final Colour colour;

    public Dragon(){
        this.age = 0;
        this.ageState = new Hatchling();
        this.colour = new Red();
    }



}
