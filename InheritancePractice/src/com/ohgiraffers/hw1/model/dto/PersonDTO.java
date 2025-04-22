package com.ohgiraffers.hw1.model.dto;

public class PersonDTO {
    private String name;
    private int age;
    private double height;
    private double weight;

    public PersonDTO() {
    }

    public PersonDTO(int age, double height, double weight){
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String information(String[][] person){
        for (int i = 0; i < person.length; i++ ){
            for (int j = 0; j < person[i].length; j++ ) {
                System.out.println(person[i][j]);
            }
        }
        // 여기서부터 다시 시작.
        return "information";
    }
}
