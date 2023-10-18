package model;

import java.util.Objects;

public abstract class Product {

    // Atribute

    private String name;

    private String material;

    private String manufacture;

    //Constructor

    public Product( String name, String material, String manufacture){
        this.name = name;
        this.material = material;
        this.manufacture = manufacture;
    }

    public abstract void printInformation();

//    public abstract void setName(String name); khi sử dụng private thì override class con ntn ?


    public void setName(String name){
        this.name = name;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public void setManufacture(){
        this.manufacture = manufacture;
    }

    public String getName() {
        return this.name;
    }

    public String getMaterial() {
        return this.material;
    }

    public String getManufacture() {
        return this.manufacture;
    }

    public boolean equals (Object obj){
        //Step 1: Check parameter truyen vao co phai la instance cua ElectricProduct hay khong
        if(obj instanceof Product) {
            obj = (Product) obj;
            //Check xem gia tri cua no co bang nhau khong
            if (getName().equals(((Product) obj).getName()) &&
                    getName().equals(((Product) obj).getMaterial()) &&
                    getManufacture().equals(((Product) obj).getManufacture())) {
                return true;
            }
        }
        return false;
    }
    
}
