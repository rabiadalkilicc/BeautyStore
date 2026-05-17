
package beautystore;


public class BeautyStore {

   
    public static void main(String[] args) {
        
        Foundation foundation1 = new Foundation("Rena Foundation", 500, 23, "Combination skin", 101);
        Foundation foundation2 = new Foundation("Rena Foundation", 500, 23, "Combination skin", 102);
        Foundation foundation3 = new Foundation("Rena Foundation", 500, 23, "Combination skin", 103);

        Blush blush1 = new Blush("Rena Blush", 300, 21, 01);
        Blush blush2 = new Blush("Rena Blush", 300, 21, 02);
        Blush blush3 = new Blush("Rena Blush", 300, 21, 03);
        
        Lipstick lipstick1 = new Lipstick("Rena Lipstick", 270, 29, "Red", "Matte", true);
        Lipstick lipstick2 = new Lipstick("Rena Lipstick", 270, 29, "Purple", "Bright", false);
        
        Mascara mascara1 = new Mascara("Rena Mascara", 400, 23, true, "Flat");
        
        Primer primer1 = new Primer("Rena Mascara", 450, 19);
        
        Cart cart = new Cart();
        
        cart.addProduct(foundation3);
        cart.addProduct(foundation1);
        cart.addProduct(lipstick2);
        cart.addProduct(mascara1);
        cart.addProduct(primer1);
        
        cart.showCart();
        
        cart.totalPrice();
        
    }
    
}
