package demoTest;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import model.Product;

public class DemoTest {
    public static void main(String[] args) {

        //Set
//     Set<String> stringSet = new HashSet<>();
//        stringSet.add("A");
//        stringSet.add("B");
//        stringSet.add("C");
//        stringSet.add("null");
//        stringSet.add("null");

        //Set k co phan tu trung lap
//        System.out.println(stringSet.size());




        //Cach 1 dung for duyet qua cac phan tu cua vong lap
//        for (String i : stringSet) {
//            System.out.print(i +" ");
//        }

        //Cach 2 dung iterator duyet qua cac phan tu cua vong lap và
        // Cach 1 remove phần tử
//        Iterator<String>iterator = stringSet.iterator();

//        while (iterator.hasNext()){     // Kiem tra co phan tu nao nua khong
//            String s = iterator.next(); //Lay phan tu tiep theo
//            if (s.equals("null")){
//                iterator.remove();
//                while (iterator.hasNext()){
//                    s = iterator.next();
//                }
//            }
//            System.out.println(s + " ");
//        }

//      Cach 2 remove phan tu

//        while (iterator.hasNext()) {
//            String s = iterator.next();
//            if (s == null) {
//                System.out.println("null");
//            } else if (s.equals("null")) {
//                iterator.remove();
//            } else {
//                System.out.println(s);
//            }
//        }


        //TreeSet
        //Doi vs so nguyen, so thuc, string,...
//        Set <Integer> numbers = new TreeSet<>();
//        numbers.add(1);
//        numbers.add(4);
//        numbers.add(3);
//        numbers.add(10);
//        numbers.add(9);
//
//        for (int i :numbers) {
//            System.out.println( i + " ");
//        }



        //TreeSet doi voi Object
//        Set <Product> products = new TreeSet<>();
//        products.add(new Product("banh mi","bot mi","VietNam"));
//        products.add(new Product("nuoc ngot","nuoc","ThaiLan"));
//        products.add(new Product("pho","gao","VietNam"));
//        products.add(new Product("chocolate","cacao","Bi"));

        //Sap xep name theo bang chu cai
        Set <String> strs = new TreeSet<>();
        strs.add("Lan Anh");
        strs.add("Khanh My");
        strs.add("Tien Dat");
        strs.add("Phuong Anh");


        Iterator <String> iter = strs.iterator();
        while (iter.hasNext()) {
            String s = iter.next();
            System.out.println(s + " ");
        }





    }
}
