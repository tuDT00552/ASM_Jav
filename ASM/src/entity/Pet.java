/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author duong
 */
public class Pet {
    private String name, infopet;
    private int price, contactnumber;

    public Pet() {
        
    }

    public Pet(String name, String infopet, int contactnumber, int price) {
        this.name = name;
        this.infopet = infopet;
        this.contactnumber = contactnumber;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfopet() {
        return infopet;
    }

    public void setInfopet(String infopet) {
        this.infopet = infopet;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(int contactnumber) {
        this.contactnumber = contactnumber;
    }
}
