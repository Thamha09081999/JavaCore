package model;

public class HouseholdProduct extends Product {

    //Atribute

    public  HouseholdProduct(String name, String material, String manufacture){
        super(name, material, manufacture);
    }

    @Override
    public void printInformation(){
        System.out.println("Household_product: " + getName() + ", " + getMaterial() + ", " + getManufacture());
    }

    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }


}
