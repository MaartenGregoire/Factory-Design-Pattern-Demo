/**
 * Created by Maarten Gregoire on 12/10/2015.
 */
public class AdvancedRaceGame extends RaceGame {

    public RaceCar createRaceCar(String type) {
        RaceCar raceCar;
        switch (type) {
            case "Ferrari":
                raceCar = new AdvancedFerrariRaceCar();
                break;
            case "Porche":
                raceCar = new AdvancedPorcheRaceCar();
                break;
            case "Alpha Romeo":
                raceCar = new AdvancedAlphaRomeoRaceCar();
                break;
            default:
                raceCar = new DefaultCar();
        }
        return raceCar;
    }

}
