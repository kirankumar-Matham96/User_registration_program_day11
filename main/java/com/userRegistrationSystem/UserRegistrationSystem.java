package com.userRegistrationSystem;

import java.util.ArrayList;
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
        if(Pattern.matches("^[a-z0-9A-Z-_]+(\\.[a-z0-9A-Z])*@[a-z0-9A-Z]+\\.([a-z0-9A-Z]{2,})?\\.([a-zA-Z]){2,}$",email))
//        if(Pattern.matches("^(?!\\.)[A-Za-z0-9]+([._%+-]?[0-9])*@[A-Za-z0-9-]+\\.[a-zA-Z]{2,}(\\.[A-Za-z]{2,})?$",email))
        {
            return "valid";
        }
        else
        {
            return "invalid";
        }
    }

    //UC4: validating mobile number
    public static String validateMobileNumber(String mobile_number)
    {
        if(Pattern.matches("^[0-9]{1,2}\\s[0-9]{10}",mobile_number))
        {
            return "valid";
        }
        else
        {
            return "invalid";
        }
    }

    //UC5: validating password
    /*
    Rule1: contains minimum 8 characters
    Rule2: contains minimum 1 uppercase letter
     */
    public static String validatingPassword(String password)
    {
        if(Pattern.matches("(?=.*[A-Z])(?=.*[0-9]).{8,}",password))
        {
            return "valid";
        }
        else
        {
            return "invalid";
        }
    }

    /*
     * UC-9: All types of email
     */
    //adding email to array-list and calling validateEmail method
    public static void addToEmailList(String emailToAdd)
    {
        ArrayList<String> email = new ArrayList<String>();

        int i = 0;
        email.add(emailToAdd);
        System.out.println(email.get(i)+": "+validateEmail(email.get(i)));
        i++;
    }

    public static void main(String[] args)
    {
        System.out.println("first name: "+UserRegistrationSystem.validateFirstName("Rahul"));
        System.out.println("last name: "+UserRegistrationSystem.validateLastName("Guptha"));
        System.out.println("email: "+UserRegistrationSystem.validateEmail("ab2c.cbd@gmail2.com.in"));
        System.out.println("mobile number: "+UserRegistrationSystem.validateMobileNumber("91 8688332960"));
        System.out.println("password: "+UserRegistrationSystem.validatingPassword("ut438fTg7239^%$"));

        //valid email
        addToEmailList("Rahul@gmail.com");
        addToEmailList("Rahul-100@gmail.com");
        addToEmailList("Rahul.100@gmail.com");
        addToEmailList("Rahul-100@Rahul.com");
        addToEmailList("Rahul-100@Rahul.net");
        addToEmailList("Rahul.100@Rahul.com.au");
        addToEmailList("Rahul@1.com");
        addToEmailList("Rahul@gmail.com.com");
        addToEmailList("Rahul+100@yahoo.com");

        //invalid email
        addToEmailList("Rahul@.com.my");
        addToEmailList("Rahul123@gmail.a");
        addToEmailList("Rahul123@.com");
        addToEmailList("Rahul123@.com.com");
        addToEmailList(".Rahul@Rahul.com");
        addToEmailList("Rahul()*@gmail.com");
        addToEmailList("Rahul@%*.com");
        addToEmailList("Rahul..2002@gmail.com");
        addToEmailList("Rahul.@gmail.com");
        addToEmailList("Rahul@Rahul@gmail.com");
        addToEmailList("Rahul@gmail.com.1a");
        addToEmailList("Rahul@gmail.com.aa.au");
    }
}
