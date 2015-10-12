/**
 * Created by Maarten Gregoire on 12/10/2015.
 */
public class ExpertFerrariRaceCar extends RaceCar{

    public ExpertFerrariRaceCar(){
        name = "Ferrari (Expert)";
        speed = 500;
        acceleration = 100;
        gravity = 30;
        brake = 50;
        steering = 50;
        options.add("Turbo Engine");
        options.add("extra gear");
    }

    public void brake(){
        System.out.println("Braking, Ferrari style...");
    }

}
