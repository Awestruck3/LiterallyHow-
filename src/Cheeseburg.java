
public class Cheeseburg extends FoodItem {
    
    double cheese;
    boolean extra=false;
    
    
    
    public Cheeseburg(){
        super();    
    }
    
    @Override
    public double getPrice(){
        cheese = 0.5;
        if(extra==false)
            return price+cheese;
        else
            return price + (cheese*2);
        
    }
}
