package com.example.bookmanagement1.model;

public class BookDTO {

    private int id;

    private String name;

    private String description;

    public BookDTO(){

    }
    public BookDTO(int id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }


}
