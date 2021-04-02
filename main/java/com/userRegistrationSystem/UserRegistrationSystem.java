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

    public static void main(String[] args)
    {
        System.out.println("first name: "+UserRegistrationSystem.validateFirstName("Rahul"));
        System.out.println("last name: "+UserRegistrationSystem.validateLastName("Guptha"));
    }
}
