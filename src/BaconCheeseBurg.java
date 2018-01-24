
public class BaconCheeseBurg extends Cheeseburg{
    double bacon;
    boolean extrab=false;
    
    public BaconCheeseBurg(){
        super();
        bacon=.75;
    }
    
    @Override
    public double getPrice(){
        bacon = 0.75;
        if(extrab==false)
            return price + bacon;
        else
            return price + (bacon*2);
        
    }
}
