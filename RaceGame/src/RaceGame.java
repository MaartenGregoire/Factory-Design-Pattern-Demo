/**
 * Created by Maarten Gregoire on 12/10/2015.
 */
public abstract class RaceGame {

    public RaceCar requestCar(String item){
        RaceCar raceCar = createRaceCar(item);
        System.out.println("Creating a racecar with name " + raceCar.getName() + "...");
        return raceCar;
    }

    public abstract RaceCar createRaceCar(String type);

}
