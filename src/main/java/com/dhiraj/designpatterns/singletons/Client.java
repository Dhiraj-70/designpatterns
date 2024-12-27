package com.dhiraj.designpatterns.singletons;

public class Client {
    public static void main(String[] args) {
        DatabaseConnection ins1 = DatabaseConnection.getInstance();
        DatabaseConnection ins2 = DatabaseConnection.getInstance();

        if (ins1.equals(ins2)) {
            System.out.println("Both instances are the same");
        }else {
            System.out.println("instances are not the same");
        }
    }
}
