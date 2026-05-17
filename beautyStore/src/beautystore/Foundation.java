
package beautystore;


public class Foundation extends Product {
    
    String skinType;
    int foundationNo;
    
    public Foundation(String name, int price, int stock, String skinType, int foundationNo){
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.skinType = skinType;
        this.foundationNo = foundationNo;
    }
}
