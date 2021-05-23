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
public class BillingItem {
    private int categoryID;
    private int productID;
    private String categoryName;
    private String productName;
    private String note;
    private int orderitemid;
    
    private int quantity;
    private int price;
    private int total;

    public BillingItem(int categoryID, int productID, String categoryName, String productName, String note, int quantity, int price, int total) {
        this.categoryID = categoryID;
        this.productID = productID;
        this.categoryName = categoryName;
        this.productName = productName;
        this.note = note;
        //this.orderitemid = orderitemid;
        
        this.quantity = quantity;
        this.price = price;
        this.total = total;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public int getProductID() {
        return productID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getProductName() {
        return productName;
    }

    public String getNote() {
        return note;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public int getTotal() {
        return total;
    }
    
    public int getOrderItemId()
    {
        return orderitemid;
    }

    @Override
    public String toString() {
        return "BillingItem{" + "categoryName=" + categoryName + ", productName=" + productName + ", note=" + note + ", quantity=" + quantity + ", price=" + price + ", total=" + total +",orderitemid="+orderitemid+ '}';
    }
    
    
    
    
}
