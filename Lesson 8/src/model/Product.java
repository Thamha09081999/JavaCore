package model;

public class Product {

    // Atribute

    public String name;

    public String material;

    public String manufacture;

    //Constructor


    public Product( String name, String material, String manufacture){
        this.name = name;
        this.material = material;
        this.manufacture = manufacture;
    }

    public  void printInformation(){
        System.out.println("Name: " + this.name + " ,material: " + this.material + " ,manufacture: "+this.manufacture);
    }

    public void setName(String name){
        this.name = name;
    }


}
