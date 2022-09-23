package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    public static void main(String[] args) {
        /*First name starts with Cap and has
        minimum 3 characters*/

        Pattern pattern = Pattern.compile("^[A-Z]"+"[a-z]{3,}");
        Matcher matcher = pattern.matcher("Sandeep");
        boolean result = matcher.matches();

        System.out.println("Result = " +result);
    }
}
