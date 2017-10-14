package com.example.avma1997.buildit;

/**
 * Created by Avma1997 on 10/14/2017.
 */

 public class ConstructionMaterial {
    String name;
    int quantity;
    String image;
    String dateOfPurchase;

    public ConstructionMaterial(String name, int quantity, String image, String dateOfPurchase) {
        this.name = name;
        this.quantity = quantity;
        this.image = image;
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }
}
