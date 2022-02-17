package com.examly.springapp;
import javax.persistence.*;
@Entity
public class Car {
    @Id
    @Column(name="carId")
    private String carId;
    @Column(name="carModel")
    private String carModel;
    @Column(name="carNo")
    private String carNo;
    @Column(name="status")
    private String status;
    public String getCarId()
    {
        return this.carId;
    }
    public void setCarId(String id)
    {
        this.carId=id;
    }
    public String getCarModel()
    {
        return this.carModel;
    }
    public void setCarModel(String m)
    {
       this.carModel=m;
    }
    public String getCarNo()
    {
        return this.carNo;
    }
    public void setCarNo(String no)
    {
         this.carNo=no;
    }
    public String getStatus()
    {
        return this.status;
    }
    public void setStatus(String s)
    {
        this.status=s;
    }
}
