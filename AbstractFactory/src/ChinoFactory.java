/**
 * Created by Maarten Gregoire on 13/10/2015.
 */
class ChinoFactory extends BroekFactory{
    SlimFit createSlimFit(){
        return new ChinoSlimFit("Chino slim fit");
    }
    StraightFit createStraightFit(){
        return new ChinoStraightFit("Chino straight fit");
    }
}
