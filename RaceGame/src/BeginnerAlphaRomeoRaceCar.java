/**
 * Created by Maarten Gregoire on 12/10/2015.
 */
public class BeginnerAlphaRomeoRaceCar extends RaceCar{

    public BeginnerAlphaRomeoRaceCar() {
        name = "Alpha Romeo (Beginner)";
        speed = 250;
        acceleration = 20;
        gravity = 95;
        brake = 95;
        steering = 90;
        options.add("Alpha Romeo Power");
    }

    public void accelerate(){
        System.out.println("Accelerating, Alpha Romeo style...");
    }

}
