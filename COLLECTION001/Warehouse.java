

import java.util.*;


public class Warehouse {
    Map<String, Integer> product = new HashMap<>();
    public Warehouse(){
        
    }
    public void addProduct(String productName, int stock){
        product.put(productName,stock);

    }
    public String stock(String productName){
        if(product.containsKey(productName)){
            return productName +": " +product.get(productName);
        } else {
            return productName +": -99";
        }
    }
}
