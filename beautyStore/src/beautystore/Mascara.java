
package beautystore;


public class Mascara extends Product{
    
    boolean waterproof;
    String brushType;
    
    public Mascara(String name, int price, int stock, boolean waterproof, String brushType){
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.waterproof = waterproof;
        this.brushType = brushType;
    }
}
