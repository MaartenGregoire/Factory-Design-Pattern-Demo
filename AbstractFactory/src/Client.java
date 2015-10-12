/**
 * Created by Maarten Gregoire on 12/10/2015.
 */
public class Client{
    public static void main(String args[]){
        BroekFactory broekFactory = FactoryMaker.getFactory("jeans");
        Fit broek1 = broekFactory.createStraightFit();
        Fit broek2 = broekFactory.createSlimFit();
        broekFactory = FactoryMaker.getFactory("chino");
        Fit broek3 = broekFactory.createStraightFit();
        Fit broek4 = broekFactory.createSlimFit();
        broek1.getInfo();
        broek2.getInfo();
        broek3.getInfo();
        broek4.getInfo();
    }
}
