package com.org.employee.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employee")
@Data
public class Employee {
    public double getEmpSalary;
    @Id
    private int empid;
    private String empname;
    private String empadress;
    private double empsalary;
    private int empage;

    public double getGetEmpSalary() {
        return getEmpSalary;
    }

    public void setGetEmpSalary(double getEmpSalary) {
        this.getEmpSalary = getEmpSalary;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpadress() {
        return empadress;
    }

    public void setEmpadress(String empadress) {
        this.empadress = empadress;
    }

    public double getEmpsalary() {
        return empsalary;
    }

    public void setEmpsalary(double empsalary) {
        this.empsalary = empsalary;
    }
}
