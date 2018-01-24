
public class CheeseFry extends FoodItem {
    double cheese;
    
    
    public CheeseFry(){
        super();
    }
    
    @Override
    public double getPrice(){
        cheese = 0.5;
        return price + cheese;
        
    }
    
    
    public String getFryInformation(){
        return "Cheesefry bought for $" + getPrice();
    }
}
