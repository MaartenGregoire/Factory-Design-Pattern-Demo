/**
 * Created by Maarten Gregoire on 12/10/2015.
 */
public class ExpertRaceGame extends RaceGame {

    public RaceCar createRaceCar(String type){
        RaceCar raceCar;
        switch (type){
            case "Ferrari":
                raceCar = new ExpertFerrariRaceCar();
                break;
            case "Porche":
                raceCar = new ExpertPorcheRaceCar();
                break;
            case "Alpha Romeo":
                raceCar = new ExpertAlphaRomeoRaceCar();
                break;
            default:
                raceCar = new DefaultCar();
        }
        return raceCar;
    }

}
