package com.example.avma1997.buildit;

/**
 * Created by Avma1997 on 10/14/2017.
 */

 public class DailyReports {
    String image1;
    String image2;
    String image3;
    String image4;

    String completedtasks;
    String constructionMaterialBrought;
    String equipmentsBrought;

    public DailyReports(String image1, String image2, String image3, String image4, String completedtasks, String constructionMaterialBrought, String equipmentsBrought) {
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
        this.image4 = image4;
        this.completedtasks = completedtasks;
        this.constructionMaterialBrought = constructionMaterialBrought;
        this.equipmentsBrought = equipmentsBrought;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public String getImage4() {
        return image4;
    }

    public void setImage4(String image4) {
        this.image4 = image4;
    }

    public String getCompletedtasks() {
        return completedtasks;
    }

    public void setCompletedtasks(String completedtasks) {
        this.completedtasks = completedtasks;
    }

    public String getConstructionMaterialBrought() {
        return constructionMaterialBrought;
    }

    public void setConstructionMaterialBrought(String constructionMaterialBrought) {
        this.constructionMaterialBrought = constructionMaterialBrought;
    }

    public String getEquipmentsBrought() {
        return equipmentsBrought;
    }

    public void setEquipmentsBrought(String equipmentsBrought) {
        this.equipmentsBrought = equipmentsBrought;
    }
}
