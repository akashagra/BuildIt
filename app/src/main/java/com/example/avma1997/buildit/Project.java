package com.example.avma1997.buildit;

/**
 * Created by Avma1997 on 10/14/2017.
 */

class Project {
    Contractor[] contractors;
    Equipment[] equipments;
    DailyReports[] dailyReports;
    ConstructionMaterial[] constructionMaterials;

    public Project(Contractor[] contractors, Equipment[] equipments, DailyReports[] dailyReports) {
        this.contractors = contractors;
        this.equipments = equipments;
        this.dailyReports = dailyReports;
    }
    public Project(){

    }

    public Contractor[] getContractors() {
        return contractors;
    }

    public void setContractors(Contractor[] contractors) {
        this.contractors = contractors;
    }

    public Equipment[] getEquipments() {
        return equipments;
    }

    public void setEquipments(Equipment[] equipments) {
        this.equipments = equipments;
    }

    public DailyReports[] getDailyReports() {
        return dailyReports;
    }

    public void setDailyReports(DailyReports[] dailyReports) {
        this.dailyReports = dailyReports;
    }
}
