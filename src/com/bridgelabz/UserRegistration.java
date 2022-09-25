package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        /* First name starts with Cap and has
        minimum 3 characters*/
        boolean FirstName = Pattern.matches("^[A-Z][a-z]{3,}", "Sandeep");
        System.out.println("Result = "+FirstName);
        /* Last name starts with Cap and has
        minimum 3 characters*/
        boolean LastName = Pattern.matches("^[A-Z][a-z]{3,}", "Pangare");
        System.out.println("Result = "+LastName);
        /* E.g. abc.xyz@bl.co.in -
        Email has 3 mandatory parts (abc, bl& co) and 2 optional (xyz & in) with
        precise @ and . positions */
        boolean email = Pattern.matches("[abc]{1,3}" + "[.]" + "[a-z 0-9]{1,}" + "[@]" + "bl{1}" + "[.]" + "co{1}" + "[.]" + "[a-z]{1,}", "abc.xyz@bl.co.in");
        System.out.println("Result = "+email );

    }
}
