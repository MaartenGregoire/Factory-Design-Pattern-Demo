/**
 * Created by Maarten Gregoire on 12/10/2015.
 */
public class BeginnerRaceGame extends RaceGame {

    public RaceCar createRaceCar(String type){
        RaceCar raceCar;
        switch (type){
            case "Ferrari":
                raceCar = new BeginnerFerrariRaceCar();
                break;
            case "Porche":
                raceCar = new BeginnerPorcheRaceCar();
                break;
            case "Alpha Romeo":
                raceCar = new BeginnerAlphaRomeoRaceCar();
                break;
            default:
                raceCar = new DefaultCar();
        }
        return raceCar;
    }

}
