/**
 * Created by Maarten Gregoire on 12/10/2015.
 */
public class RaceGameTestDrive {

    public static void main(String[] args) {
        RaceGame beginnerRaceGame = new BeginnerRaceGame();
        RaceGame advancedRaceGame = new AdvancedRaceGame();
        RaceGame expertRaceGame = new AdvancedRaceGame();
        RaceCar raceCar = beginnerRaceGame.requestCar("Ferrari");
        System.out.println("This car is a " + raceCar.getName());
        raceCar.accelerate();
        raceCar.brake();
        raceCar = advancedRaceGame.requestCar("Alpha Romeo");
        System.out.println("This car is a " + raceCar.getName());
        raceCar.accelerate();
        raceCar.steerLeft();
        raceCar = advancedRaceGame.requestCar("Ferrari");
        System.out.println("This car is a " + raceCar.getName());
        raceCar.steerRight();
        raceCar = expertRaceGame.requestCar("Porche");
        System.out.println("This car is a " + raceCar.getName());
        raceCar.steerLeft();
        raceCar = expertRaceGame.requestCar("Unexisting car");
        System.out.println("This car is a " + raceCar.getName());
        raceCar.steerLeft();
    }

}
