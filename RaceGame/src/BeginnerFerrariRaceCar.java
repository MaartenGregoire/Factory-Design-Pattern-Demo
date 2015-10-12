/**
 * Created by Maarten Gregoire on 12/10/2015.
 */
public class BeginnerFerrariRaceCar extends RaceCar {
    public BeginnerFerrariRaceCar(){
        name = "Ferrari (Beginner)";
        speed = 200;
        acceleration = 10;
        gravity = 100;
        brake = 100;
        steering = 100;
        options.add("Turbo Engine");
        options.add("automatic acceleration");
    }
    public void brake(){
        System.out.println("Braking, Ferrari style...");
    }


}
