/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyClasses;

import com.sun.security.ntlm.Client;
import java.util.Date;

/**
 *
 * @author pupil
 */
public class History {
    private Customer customer;
    private Model model;
    private Date givenDate;
    private Date returnedDate;
    
    public Customer getCustomer(Customer customer) {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Model getModel(Model model) {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Date getGivenDate(Date givenDate) {
        return givenDate;
    }

    public void setGivenDate(Date givenDate) {
        this.givenDate = givenDate;
    }

    public Date getReturnedDate(Date returnedDate) {
        return returnedDate;
    }

    public void setReturnedDate(Date returnedDate) {
        this.returnedDate = returnedDate;
    }

    @Override
    public String toString() {
        return "History{" 
                + "customer=" + customer 
                + ", model=" + model 
                + ", givenDate=" + givenDate 
                + ", returnedDate=" + returnedDate 
                + '}';
    }

    public Object getModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getClient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setClient(Client client) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setGivendate(Date time) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

 

