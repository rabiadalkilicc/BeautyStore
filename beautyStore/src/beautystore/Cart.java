
package beautystore;

import java.util.ArrayList;

public class Cart {
   
    ArrayList <Product> products = new ArrayList<>();
    
    public void addProduct(Product urun){
        products.add(urun);
        urun.stock--;
        urun.salesCount++;
    }
    
    public void showCart(){
        
        int i = 0;
        
        while(i < products.size()){
            System.out.println(products.get(i).name + "Stock: " + products.get(i).stock 
            + " Sales: " + products.get(i).salesCount);
            i++;
        }
    }
    
    public void totalPrice(){
        
        int total = 0;
        int i = 0;
        
        while(i < products.size()){
            total += products.get(i).price;
            i++;
        }
        System.out.println("Total Price: " + total);
    }
}
