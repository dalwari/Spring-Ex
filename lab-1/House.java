package com.examly.springapp;
import javax.persistence.*;
@Entity
public class House {
    @Id
    @Column(name="houseId")
    private String houseId;
    @Column(name="houseNo")
    private String houseNo;
    @Column(name="status")
    private String status;
    @Column(name="type")
    private String type;
    public String getHouseId()
    {
        return this.houseId;
    }
    public void setHouseId(String id)
    {
        houseId=id;
    }
    public String getHouseNo()
    {
        return this.houseNo;
    }
    public void setHouseNo(String no)
    {
        houseNo=no;
    }   
    public String getStatus()
    {
        return this.status;
    }
    public void setStatus(String s)
    {
        status=s;
    }
    public String getType()
    {
        return this.type;
    }
    public void setType(String t)
    {
        type=t;
    }
}
