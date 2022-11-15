/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author Laptop
 */
public class Manager implements Serializable{

    private String id, name, date, assignee, reviewer, taskType;
    private double planFrom, planTo,h;

    public Manager() {
    }

    public Manager(String id, String name,  String taskType,String date, double planFrom, double planTo, String assignee, String reviewer,double h) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.assignee = assignee;
        this.reviewer = reviewer;
        this.taskType = taskType;
        this.planFrom = planFrom;
        this.planTo = planTo;
        this.h=h;
    }

    public Manager(String id, String name, String taskType, String date, double planFrom, double planTo, String assignee, String reivew) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public double getPlanFrom() {
        return planFrom;
    }

    public void setPlanFrom(double planFrom) {
        this.planFrom = planFrom;
    }

    public double getPlanTo() {
        return planTo;
    }

    public void setPlanTo(double planTo) {
        this.planTo = planTo;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    

}
