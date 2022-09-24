package com.bridgelabz;
public class UserRegistration {
    public static void main(String[] args) {
        /*First name starts with Cap and has
        minimum 3 characters*/
        System.out.println("Sandeep".matches("^[A-Z]"+"[a-z]{3,}"));
    }
}
