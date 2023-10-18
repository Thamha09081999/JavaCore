package test;

import model.ElectricProduct;
import model.Product;
import model.HouseholdProduct;
import model.FoodProduct;

public class DemoTest {
    public static void main(String[] args) {
//    ElectricProduct electricProduct1 = new ElectricProduct("bong den", "thuy tinh", "VietNam", "kW") ;
////        ElectricProduct electricProduct2 = new ElectricProduct("quat", "sat", "My", "kW") ;
////        HouseholdProduct householdProduct = new HouseholdProduct("tu","go","Trung Quoc");
//
////        FoodProduct foodProduct = new FoodProduct("banh","bot","Phap");
////
////        Product [] products = {electricProduct1, electricProduct2, householdProduct, foodProduct};
////
////        for (Product p:products) {
////            p.printInformation();
////        }
//
////        Product electricProduct1 = new ElectricProduct("bong den", "thuy tinh", "VietNam", "kW") ;
////        electricProduct1.printInformation();
//
////        ElectricProduct electricProduct1 = new ElectricProduct("bong den", "thuy tinh", "VietNam", "kW") ;
////        ElectricProduct electricProduct2 = new ElectricProduct("bong den", "thuy tinh", "VietNam", "kW") ;
////        System.out.println(electricProduct1 == electricProduct2);
////        System.out.println(electricProduct1.equals(electricProduct2));

//        HouseholdProduct householdProduct1 = new HouseholdProduct("tu","go","Trung Quoc");
//        HouseholdProduct householdProduct2 = new HouseholdProduct("tu","go","Trung Quoc");
//        System.out.println(householdProduct1.equals(householdProduct2));

        FoodProduct foodProduct1 = new FoodProduct("banh","bot","Phap");
        FoodProduct foodProduct2 = new FoodProduct("banh","bot","Phap");
        System.out.println(foodProduct1.equals(foodProduct2));
    }
}


