import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        int[] arrNumber = new int[5];
        Exercise2 exe2 = new Exercise2();

        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao su lua chon: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                exe2.input(arrNumber);
                System.out.println("Day sau khi sap xep tang dan: ");
                exe2.increaseList(arrNumber);
                for (int i = 0; i < arrNumber.length; i++) {
                    System.out.print(arrNumber[i] +" ");
                }
                break;
            case 2:
                exe2.input(arrNumber);
                System.out.println("Day sau khi sap xep giam dan: ");
                exe2.decreaseList(arrNumber);
                for (int i = 0; i < arrNumber.length; i++) {
                    System.out.print(arrNumber[i] +" ");
                }
                break;
            default:
                break;
        }
    }
    public void input(int[] arrNumber){
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.println("Nhap phan tu thu " + i + ":");
            Scanner sc = new Scanner(System.in);
            arrNumber[i] = sc.nextInt();
        }
    }



    public void increaseList(int[] number) {
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] > number[j]) {
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }

            }

        }

    }

    public void decreaseList(int[] number) {
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] < number[j]) {
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }

            }

        }

    }
}
