package com.example.bookmanagement1.entity;




public class Book {


    private int id;

    private String name;

    private String description;

    public Book(){

    }

    public Book(int id, String name, String description){
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

    @Override
    public boolean equals(Object o){
        if (o instanceof Book){
            return this.getId() == ((Book) o).getId() && this.getName() == ((Book) o).getName() && this.getDescription() == ((Book) o).getDescription();
        }
        return false;
    }

}
