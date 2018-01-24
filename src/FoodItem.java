
public class FoodItem {
    protected double price;
    protected String topping;
    final double TAX=0.13;
    
    public FoodItem(){
        price=1;
        topping = "";
    }
    
    public FoodItem(int p, String top){
        price = p;
        topping = top;
    }
    
    public double getPrice(){
        return price;
    }
    
}
