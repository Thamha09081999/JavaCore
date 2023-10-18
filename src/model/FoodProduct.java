package model;

public class FoodProduct extends Product {

    //Atribute

    public  FoodProduct( String name, String material, String manufacture){
        super(name, material, manufacture);
    }

    @Override
    public void printInformation() {
        System.out.println("Food_product: " + getName() + ", " + getMaterial() + ", " + getManufacture());
    }

    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }

}
