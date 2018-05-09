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
public class Seller {
    private String name, address, textsearch;
    private int age, numberphone,id;

    public Seller() {
        
    }

    public Seller(String name, int age, int numberphone, String address) {
        this.name = name;
        this.age = age;
        this.numberphone = numberphone;
        this.address = address;
    }

    public String getTextsearch() {
        return textsearch;
    }

    public void setTextsearch(String textsearch) {
        this.textsearch = textsearch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberphone() {
        return numberphone;
    }

    public void setNumberphone(int numberphone) {
        this.numberphone = numberphone;
    }
    
}
