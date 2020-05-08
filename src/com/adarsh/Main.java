package com.adarsh;

public class Main {

    public static void main(String[] args) {


    Bank bank  = new Bank("National Bhopal Bank");
    if(bank.addBranch("bhopal")){
        System.out.println("bhopal branch created.");
    }

    bank.addCustomer("bhopal", "adarsh", 50.05);
    bank.addCustomer("bhopal", "atishay", 1234.79);
    bank.addCustomer("bhopal", "abhishek", 2345.08);

    bank.addBranch("indore");
    bank.addCustomer("Indore", "harshit", 548.3);

    bank.addCustomerTransaction("bhopal", "amitej", 765.99);
    bank.addCustomerTransaction("bhopal", "amitej", 3244.39);
    bank.addCustomerTransaction("bhopal", "chinmay", 6373.4);

    bank.listCoustomers("bhopal", true);
    bank.listCoustomers("Indore", true);

    bank.addBranch("Delhi");

    if(!bank.addCustomer("Delhi", "Modi", 2342.33)){
        System.out.println("Error Delhi branch does not Exist.");
    }

    if(!bank.addBranch("bhopal")){
        System.out.println("bhopal branch already exist.");
    }


    if(!bank.addCustomerTransaction("bhopal", "anupam", 785.6)){
        System.out.println("Customer  anupam does not exist.");
    }

    if(!bank.addCustomer("bhopal", "amitej", 1234.24 )){
        System.out.println("Customer amitej already exists");
    }





    }
}
