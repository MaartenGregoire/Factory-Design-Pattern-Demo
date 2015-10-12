import java.util.ArrayList;

/**
 * Created by Maarten Gregoire on 12/10/2015.
 */
public abstract class RaceCar {

    String name;
    int speed;
    int acceleration;
    int gravity;
    int brake;
    int steering;
    ArrayList<String> options = new ArrayList<>();

    void makeCar(){
        System.out.println("Creating the car...");
    }

    void accelerate(){
        System.out.println("Accelerating...");
        System.out.println("Acceleration: " + acceleration);

    }

    void brake(){
        System.out.println("braking...");
        System.out.println("Brake: " + brake);

    }

    void steerRight(){
        System.out.println("Steering right...");
        System.out.println("Steering: " + steering);
    }

    void steerLeft(){
        System.out.println("Steering left...");
        System.out.println("Steering " + steering);

    }

    public String getName(){
        return name;
    }

}
