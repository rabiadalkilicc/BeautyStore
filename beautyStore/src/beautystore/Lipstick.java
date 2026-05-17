
package beautystore;


public class Lipstick extends Product {
    
    String color;
    String finishType;
    boolean permanent;
    
    public Lipstick (String name, int price, int stock, String color, String finishType, boolean permanent){
        
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.color = color;
        this.finishType = finishType;
        this.permanent = permanent;
        
    }
}
