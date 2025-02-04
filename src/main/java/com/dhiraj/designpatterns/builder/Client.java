package com.dhiraj.designpatterns.builder;

public class Client {
    public static void main(String[] args) {
//        Builder builder = Student.builder();
//        builder.setName("Rupak");
//        builder.setAge(16);
//
//        Student student = builder.build();

        Student student = Student.builder().setName("Rohan").setBatch("4Feb2025").setAge(23).build();
        System.out.println(student);
    }
}
