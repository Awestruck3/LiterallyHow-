
public class ChiliFry extends FoodItem{
    double chili;
    
    
    public ChiliFry(){
        super();
    }
    
    @Override
    public double getPrice(){
        chili = 0.75;
        return price + chili;
        
    }
    
    
    public String getFryInformation(){
        return "Cheesefry $1.50";
    }
    
}
