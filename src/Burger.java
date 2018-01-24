
public class Burger extends FoodItem{
    
    public Burger(){
        super();
    }
    
    public Burger(double p, String to){
        p=price;
        to=topping;
    }
    
    @Override
    public double getPrice(){
        return price;
    }
    
     public String getBurgerInformation(){
        return "Burger bought for " + getPrice();
    }
}
