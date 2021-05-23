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
public class Invoice {
    private int id;
    private String note;
    private int tax;
    
    public Invoice(int id,String note,int tax)
    {
        this.id = id;
        this.note = note;
        this.tax = tax;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getNote()
    {
        return note;
    }
    
    public int getTax()
    {
        return tax;
    }
}
