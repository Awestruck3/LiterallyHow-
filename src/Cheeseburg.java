
public class Cheeseburg extends FoodItem {
    
    double cheese=.5;
    boolean extra=false;
    
    
    
    public Cheeseburg(){
        super();    
    }
    
    @Override
    public double getPrice(){
        if(extra==false)
            return price+cheese;
        else
            return price += (cheese*2);
        
    }
}
