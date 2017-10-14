package com.example.avma1997.buildit;

/**
 * Created by Avma1997 on 10/14/2017.
 */

 public class Task{
    String date;
    String status;

    public Task(String date, String status) {
        this.date = date;
        this.status = status;
    }
    public Task()
    {

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
