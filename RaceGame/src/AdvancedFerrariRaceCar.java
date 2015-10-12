/**
 * Created by Maarten Gregoire on 12/10/2015.
 */
public class AdvancedFerrariRaceCar extends RaceCar {

    public AdvancedFerrariRaceCar(){
        name = "Ferrari (Advanced)";
        speed = 350;
        acceleration = 80;
        gravity = 60;
        brake = 70;
        steering = 60;
        options.add("Turbo Engine");
    }

    public void brake(){
        System.out.println("Braking, Ferrari wildstyle...");
    }

}
