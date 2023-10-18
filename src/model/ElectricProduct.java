package model;

import java.util.Objects;

public class ElectricProduct extends Product {

    //Atribute
    String electricPotential;

    //Constructor

    public ElectricProduct(String name, String material, String manufacture, String electricPotential) {
        super(name, material, manufacture);
        this.electricPotential = electricPotential;
    }

    public void setElectricPotential(String electricPotential) {
        this.electricPotential = electricPotential;
    }

    public String getElectricPotential(){
        return this.electricPotential;
    }

    @Override
    public void printInformation(){
        System.out.println("Electric_product: " + getName() + ", " + getMaterial() + ", " + getManufacture());
    }

    @Override
    public boolean equals(Object obj){
        super.equals(obj);
        if(obj instanceof ElectricProduct) {
            obj = (ElectricProduct) obj;
            if (getElectricPotential().equals(((ElectricProduct) obj).getElectricPotential())) {
                return true;
            }
        }
        return false;
    }


}
