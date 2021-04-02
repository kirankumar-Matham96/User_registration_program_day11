package com.userRegistrationSystem;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class UserRegistrationSystem
{
    //UC1: validating first name
    public  String validateFirstName(String first_name)
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
    public  String validateLastName(String last_name)
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
    public  String validateEmail(String email)
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
    public  String validateMobileNumber(String mobile_number)
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
    public  String validatingPassword(String password)
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
    public  void addToEmailList(String emailToAdd)
    {
        ArrayList<String> email = new ArrayList<String>();

        int i = 0;
        email.add(emailToAdd);
        System.out.println(email.get(i)+": "+validateEmail(email.get(i)));
        i++;
    }

    public static void main(String[] args)
    {
        UserRegistrationSystem userRegistrationSystem = new UserRegistrationSystem();
        System.out.println("first name: "+userRegistrationSystem.validateFirstName("Rahul"));
        System.out.println("last name: "+userRegistrationSystem.validateLastName("Guptha"));
        System.out.println("email: "+userRegistrationSystem.validateEmail("ab2c.cbd@gmail2.com.in"));
        System.out.println("mobile number: "+userRegistrationSystem.validateMobileNumber("91 8688332960"));
        System.out.println("password: "+userRegistrationSystem.validatingPassword("ut438fTg7239^%$"));

        //valid email
        userRegistrationSystem.addToEmailList("Rahul@gmail.com");
        userRegistrationSystem.addToEmailList("Rahul-100@gmail.com");
        userRegistrationSystem.addToEmailList("Rahul.100@gmail.com");
        userRegistrationSystem.addToEmailList("Rahul-100@Rahul.com");
        userRegistrationSystem.addToEmailList("Rahul-100@Rahul.net");
        userRegistrationSystem.addToEmailList("Rahul.100@Rahul.com.au");
        userRegistrationSystem.addToEmailList("Rahul@1.com");
        userRegistrationSystem.addToEmailList("Rahul@gmail.com.com");
        userRegistrationSystem.addToEmailList("Rahul+100@yahoo.com");

        //invalid email
        userRegistrationSystem.addToEmailList("Rahul@.com.my");
        userRegistrationSystem.addToEmailList("Rahul123@gmail.a");
        userRegistrationSystem.addToEmailList("Rahul123@.com");
        userRegistrationSystem.addToEmailList("Rahul123@.com.com");
        userRegistrationSystem.addToEmailList(".Rahul@Rahul.com");
        userRegistrationSystem.addToEmailList("Rahul()*@gmail.com");
        userRegistrationSystem.addToEmailList("Rahul@%*.com");
        userRegistrationSystem.addToEmailList("Rahul..2002@gmail.com");
        userRegistrationSystem.addToEmailList("Rahul.@gmail.com");
        userRegistrationSystem.addToEmailList("Rahul@Rahul@gmail.com");
        userRegistrationSystem.addToEmailList("Rahul@gmail.com.1a");
        userRegistrationSystem.addToEmailList("Rahul@gmail.com.aa.au");
    }
}
