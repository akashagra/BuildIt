package com.example.avma1997.buildit;

/**
 * Created by Avma1997 on 10/14/2017.
 */

public class StakeHolder {
    String image;
    String email;
    String password;
    Project[] projects;

    public StakeHolder(String image, String email, String password, Project[] projects) {
        this.image = image;
        this.email = email;
        this.password = password;
        this.projects = projects;
    }

    public String getImage() {
        return image;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Project[] getProjects() {
        return projects;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setProjects(Project[] projects) {
        this.projects = projects;
    }
    public StakeHolder(){
    }
}
