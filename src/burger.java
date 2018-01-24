
public class burger extends FoodItem{
    
    public burger(){
        super();
    }
    
    public burger(double p, String to){
        p=price;
        to=topping;
    }
    
    @Override
    public double getPrice(){
        return price;
    }
}
