package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
//        obj.name = "Mallesh";
//        System.out.println(obj.name);
//
//        java: name has private access in com.driver.RWOnly

        obj.setName("Mallesh");
        obj.getName();
    }
}