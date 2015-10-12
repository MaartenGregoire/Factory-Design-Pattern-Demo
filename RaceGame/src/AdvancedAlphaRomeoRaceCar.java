/**
 * Created by Maarten Gregoire on 12/10/2015.
 */
public class AdvancedAlphaRomeoRaceCar extends RaceCar {

    public AdvancedAlphaRomeoRaceCar() {
        name = "Alpha Romeo (Advanced)";
        speed = 360;
        acceleration = 70;
        gravity = 65;
        brake = 73;
        steering = 55;
        options.add("Alpha Romeo Power");
    }

    public void accelerate(){
        System.out.println("Accelerating, Alpha Romeo style...");
    }

}
