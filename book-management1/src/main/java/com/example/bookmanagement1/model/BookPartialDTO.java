package com.example.bookmanagement1.model;

import java.util.Optional;

public class BookPartialDTO {

    private Optional <Integer> id;

    private Optional <String> name;

    private Optional <String> description;

    public BookPartialDTO(){

    }
    public void setId(int id) {
        this.id = Optional.of(id);
    }

    public  Optional <Integer> getId() {
        return id;
    }

    public void setName(String name) {
        this.name = Optional.of(name);
    }

    public Optional <String> getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = Optional.of(description);
    }

    public Optional <String> getDescription(){
        return this.description;
    }

}
