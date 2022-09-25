package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        /* First name starts with Cap and has
        minimum 3 characters*/
        boolean FirstName = Pattern.matches("^[A-Z][a-z]{3,}", "Sandeep");
        System.out.println("Result 1 = "+FirstName);
        /* Last name starts with Cap and has
        minimum 3 characters*/
        boolean LastName = Pattern.matches("^[A-Z][a-z]{3,}", "Pangare");
        System.out.println("Result 2 = "+LastName);
        /* E.g. abc.xyz@bl.co.in -
        Email has 3 mandatory parts (abc, bl& co) and 2 optional (xyz & in) with
        precise @ and . positions */
        boolean email = Pattern.matches("[abc]{1,3}"+"[.]"+"[a-z 0-9]{1,}"+"[@]"+"bl{1}"+"[.]"+"co{1}"+"[.]"+"[a-z]{1,}", "abc.xyz@bl.co.in");
        System.out.println("Result 3 = "+email );
        // E.g. 91 9919819801-Country code follow by space and 10digit number
        boolean PhoneNumber = Pattern.matches("^91{1}\s[0-9]{10}", "91 9917819801");
        System.out.println("Result 4 = "+PhoneNumber);
        //Predefined Password Rule-1 minimum 8 Characters
        boolean Password1 = Pattern.matches("^[A-Za-z1-9]{8}", "abcDef78");
        System.out.println("Result 5 = "+Password1);

    }
}
