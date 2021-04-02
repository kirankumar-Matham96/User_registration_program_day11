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

    public static void main(String[] args)
    {
        UserRegistrationSystem.validateFirstName("Rahul");
    }
}
