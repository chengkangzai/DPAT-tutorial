/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week1.Lec;

import java.util.List;
import java.util.Vector;

/**
 * @author maryting
 */
public class Library {
    public List<Resource> materials;
}

abstract class Resource {
    private String resourceName;
    private String resourceID;

    public String ToString() {
        return "Resource: " + resourceName + "\nID:" + this.resourceID;
    }

    public void setName(String name) {
        this.resourceName = name;
    }

    public String getName() {
        return this.resourceName;
    }

    public void setID(String id) {
        this.resourceName = id;
    }

    public String getID() {
        return this.resourceID;
    }

    abstract public void assignCategory(String x);
}

interface Operation {
    public void loan();

    public void refund();

    public void renew();

    public void payback();

    public void fine();
}

class Book extends Resource implements Operation {
    private int Quantity = 0;
    private String type = "";

    @Override
    public String toString() {
        return "Resource: " + this.getName() + "\nID:" + this.getID();
    }

    public void assignCategory(String x) {
        type = x;
        System.out.println("Book");
    }

    @Override
    public void loan() {
        System.out.println("You need to return the book within 7 days");
    }

    @Override
    public void refund() {
        System.out.println("You account has been updated");
    }

    @Override
    public void renew() {
        System.out.println("you can renew the book two times");
    }

    @Override
    public void payback() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

