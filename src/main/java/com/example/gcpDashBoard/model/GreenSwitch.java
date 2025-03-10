package com.example.gcpDashBoard.model;

public class GreenSwitch {
    private int id;
    private int resourceId;
    private int expirationDays;

    public GreenSwitch(int id,int resourceId,int expirationDays){
        this.id=id;
        this.resourceId=resourceId;
        this.expirationDays=expirationDays;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public int getResourceId() {
        return resourceId;
    }
    public void setResourceId(int resourceId){
        this.resourceId=resourceId;
    }

    public int getExpirationDays(){
        return expirationDays;
    }
    public void setExpirationDays(int expirationDays){
        this.expirationDays=expirationDays;
    }

}
