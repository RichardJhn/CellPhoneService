package com.pluralsight;
import java.util.Scanner;
public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello World!");
        CellPhone myPhone = new CellPhone();

        //serial

        System.out.println("What is the serial number?: ");
        myPhone.getSerialNumber();
        int sn = scanner.nextInt();
        myPhone.setSerialNumber(sn);
        scanner.nextLine();

        //model
        System.out.print("What is the model?");
        myPhone.getModel();
        String model = scanner.nextLine();
        myPhone.setModel(model);

        //carrier
        System.out.print("Who is your carrier?" );
        myPhone.getCarrier();
        String carrier = scanner.nextLine();
        myPhone.setCarrier(carrier);

        System.out.print("What is your Phone number?: " );
        myPhone.getPhoneNumber();
        String phoneNumber = scanner.nextLine();
        myPhone.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner: " );
        myPhone.getOwner();
        String owner = scanner.nextLine();
        myPhone.setOwner(owner);

        //output
        System.out.println("Serial Number: " + sn);
        System.out.println("Model: " + model);
        System.out.println("Carrier: "  + carrier);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Owner: " + owner);

        System.out.println("Who do you want to call?");
        myPhone.dial(scanner.nextLine());

        }
     private static void display(CellPhone phone){
         //System.out.println("-------------");
         //System.out.println("CELL PHONE [SN:" + phone.getSerialNumber() + "]");
         //System.out.println(" Owner: " + phone.getOwner());
         //System.out.println(" Model: " + phone.getModel());
     }


    }



