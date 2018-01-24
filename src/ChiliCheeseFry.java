
public class ChiliCheeseFry extends CheeseFry{
    double chili;
    
    public ChiliCheeseFry(){
        super();
    }
    
    @Override
    public double getPrice(){
        chili = 0.75;
        return price + chili;
        
    }
}
