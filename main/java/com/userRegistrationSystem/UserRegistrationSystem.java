package com.userRegistrationSystem;

import java.util.regex.Pattern;

public class UserRegistrationSystem
{
    //UC1: validating first name
    public static String validateFirstName(String first_name)
    {
        if(Pattern.matches("^[A-Z][a-z]{2,}",first_name))
        {
            return "valid";
        }
        else
        {
            return "invalid";
        }
    }

    //UC2: validating last name
    public static String validateLastName(String last_name)
    {
        if(Pattern.matches("^[A-Z][a-z]{2,}",last_name))
        {
            return "valid";
        }
        else
        {
            return "invalid";
        }
    }
    //UC3: validating email
    public static String validateEmail(String email)
    {
        if(Pattern.matches("^[a-z0-9A-Z-_]+.[a-z0-9A-Z]*@[a-z0-9A-Z]+.([a-z0-9A-Z]{2,})*.([a-z0-9A-Z]){2,}$",email))
        {
            return "valid";
        }
        else
        {
            return "invalid";
        }
    }

    public static void main(String[] args)
    {
        System.out.println("first name: "+UserRegistrationSystem.validateFirstName("Rahul"));
        System.out.println("last name: "+UserRegistrationSystem.validateLastName("Guptha"));
        System.out.println("email: "+UserRegistrationSystem.validateEmail("ab2c.cbd@gmail2.com.in"));
    }
}
