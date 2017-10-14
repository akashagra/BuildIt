package com.example.avma1997.buildit;

/**
 * Created by Avma1997 on 10/14/2017.
 */

 public class Labourer {
    String name;
    String email;
    String password;
    Task[] tasks;

    public Labourer(String name, String email, String password, Task[] tasks) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.tasks = tasks;
    }
    public Labourer()
    {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Task[] getTasks() {
        return tasks;
    }

    public void setTasks(Task[] tasks) {
        this.tasks = tasks;
    }
}


