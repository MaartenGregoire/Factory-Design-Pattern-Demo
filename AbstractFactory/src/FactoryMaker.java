/**
 * Created by Maarten Gregoire on 13/10/2015.
 */
class FactoryMaker{
    private static BroekFactory broekFactory =null;
    static BroekFactory getFactory(String choice){
        if(choice.equals("jeans")){
            broekFactory = new JeansFactory();
        }else if(choice.equals("chino")){
            broekFactory = new ChinoFactory();
        }
        return broekFactory;
    }
}
