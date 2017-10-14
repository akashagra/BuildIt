package com.example.avma1997.buildit;

/**
 * Created by Avma1997 on 10/14/2017.
 */

class Contractor {
    String image;
    String email;
    String password;
    Labourer[] labourers;

    public Contractor(String image, String email, String password, Labourer[] labourers) {
        this.image = image;
        this.email = email;
        this.password = password;
        this.labourers = labourers;
    }
    public Contractor()
    {

    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Labourer[] getLabourers() {
        return labourers;
    }

    public void setLabourers(Labourer[] labourers) {
        this.labourers = labourers;
    }
}


