/**
 * Created by Maarten Gregoire on 12/10/2015.
 */
public class ExpertAlphaRomeoRaceCar extends RaceCar {

    public ExpertAlphaRomeoRaceCar() {
        name = "Alpha Romeo (Expert)";
        speed = 500;
        acceleration = 100;
        gravity = 50;
        brake = 60;
        steering = 45;
        options.add("Alpha Romeo Power");
    }

    public void accelerate(){
        System.out.println("Accelerating, Alpha Romeo style...");
    }

}
