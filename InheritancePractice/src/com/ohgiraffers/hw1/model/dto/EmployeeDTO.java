package com.ohgiraffers.hw1.model.dto;

public class EmployeeDTO extends PersonDTO{
    private int salary;
    private String dept;

    public EmployeeDTO() {

    }
    public EmployeeDTO(String name, int age, double height, double weight, int salary, String dept) {
        super(age,height,weight);
        super.setName(name);
        this.salary = salary;
        this.dept = dept;
    }
    public String information( ){
        return super.information();
    }

}
