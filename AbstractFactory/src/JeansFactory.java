/**
 * Created by Maarten Gregoire on 13/10/2015.
 */
class JeansFactory extends BroekFactory{
    SlimFit createSlimFit(){
        return new JeansSlimFit("Jeans slim fit");
    }
    StraightFit createStraightFit(){
        return new JeansStraightFit("Jeans straight fit");
    }
}
