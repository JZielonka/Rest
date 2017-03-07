package com.spring;

/**
 * Created by Jarek on 2017-03-06.
 */
public class Employee {

private String name;
private String forname;
private String salary;



public Employee(String name,String forname, String salary)
{
    this.name=name;
    this.forname=forname;
    this.salary=salary;

}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForname() {
        return forname;
    }

    public void setForname(String forname) {
        this.forname = forname;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}


