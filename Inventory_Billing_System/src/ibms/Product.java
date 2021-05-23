/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibms;

/**
 *
 * @author Mihir Zalavadiya
 */
public class Product {
    private int id;
    private String productname;
    private int quantity;
    private int price;
    
    
    public Product(int id, String productname, int quantity, int price) {
        this.id = id;
        this.productname = productname;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    

    @Override
    public String toString() {
        return productname;
    }
   
}
