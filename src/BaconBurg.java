
public class BaconBurg extends FoodItem{
    double bacon;
    boolean extraba=false;
    public BaconBurg(){
        super();
        bacon=0.75;
    }
    
    public BaconBurg(double p, String to){
        p=price;
        to=topping;
    }
    
    @Override
    public double getPrice(){
        bacon = 0.75;
        if(extraba==false)
            return price + bacon;
        else
            return price + (bacon*2);
        
    }
}
