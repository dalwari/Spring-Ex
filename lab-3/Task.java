package com.examly.springapp;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Task {
    @Id
    @Column(name="taskId")
    private String taskId;
    @Column(name="taskHolderName")
    private String taskHolderName;
    @Column(name="taskDate")
    private String taskDate;
    @Column(name="taskName")
    private String taskName;
    @Column(name="taskStatus")
    private String taskStatus;
    public String getTaskId()
    {
        return this.taskId;
    }
    public void setTaskId(String id)
    {
        this.taskId=id;
    }
    public String getTaskHolderName()
    {
        return this.taskHolderName;
    }
    public void setTaskHolderName(String hname)
    {
        this.taskHolderName=hname;
    }
    public String getTaskDate()
    {
        return this.taskDate;
    }
    public void setTaskDate(String date)
    {
        this.taskDate=date;
    }
    public String getTaskName()
    {
        return this.taskName;
    }
    public void setTaskName(String tname)
    {
        this.taskName=tname;
    }
    public String getTaskStatus()
    {
        return this.taskStatus;
    }
    public void setTaskStatus(String s)
    {
         this.taskStatus=s;
    }
}
