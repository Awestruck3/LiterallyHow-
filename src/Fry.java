
public class Fry extends FoodItem {
    public Fry(){
        super();
    }
    
    public Fry(double p, String to){
        p=price;
        to=topping;
    }
    
    @Override
    public double getPrice(){
        return price;
    }
    
     public String getFryInformation(){
        return "Burger bought for " + getPrice();
    }
}
