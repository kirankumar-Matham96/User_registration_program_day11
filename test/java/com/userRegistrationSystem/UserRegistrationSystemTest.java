package com.userRegistrationSystem;

import org.junit.Assert;
import org.junit.Test;

class UserRegistrationSystemTest
{
    @Test
    public void givenFirstNameProper_returnValid()
    {
        UserRegistrationSystem userRegistrationSystem = new UserRegistrationSystem();
        Assert.assertEquals("valid",userRegistrationSystem.validateFirstName("Rahul"));
    }

    @Test
    public void givenFirstNameNotProper_returnInvalid()
    {
        UserRegistrationSystem userRegistrationSystem = new UserRegistrationSystem();
        Assert.assertEquals("invalid",userRegistrationSystem.validateFirstName("rahul"));
        Assert.assertEquals("invalid",userRegistrationSystem.validateFirstName("Ra"));
    }

    @Test
    public void givanLastNameProper_returnValid()
    {
        UserRegistrationSystem userRegistrationSystem = new UserRegistrationSystem();
        Assert.assertEquals("valid",userRegistrationSystem.validateLastName("Guptha"));
    }

    @Test
    public void givanLastNameNotProper_returnInvalid()
    {
        UserRegistrationSystem userRegistrationSystem = new UserRegistrationSystem();
        Assert.assertEquals("invalid",userRegistrationSystem.validateLastName("guptha"));
        Assert.assertEquals("invalid",userRegistrationSystem.validateLastName("Gu"));
    }

    @Test
    public void givenMobileNumberProper_returnValid()
    {
        UserRegistrationSystem userRegistrationSystem = new UserRegistrationSystem();
        Assert.assertEquals("valid",userRegistrationSystem.validateMobileNumber("91 8956237410"));
    }

    @Test
    public void givenMobileNumberNotProper_returnInvalid()
    {
        UserRegistrationSystem userRegistrationSystem = new UserRegistrationSystem();
        Assert.assertEquals("invalid",userRegistrationSystem.validateMobileNumber("918956237410"));
        Assert.assertEquals("invalid",userRegistrationSystem.validateMobileNumber("8956237410"));
        Assert.assertEquals("invalid",userRegistrationSystem.validateMobileNumber("91 897410"));
        Assert.assertEquals("invalid",userRegistrationSystem.validateMobileNumber("91 8956237410ftfg"));
        Assert.assertEquals("invalid",userRegistrationSystem.validateMobileNumber("91 89562374108549"));
    }

    @Test
    public void givenEmailProper_returnValid()
    {
        UserRegistrationSystem userRegistrationSystem = new UserRegistrationSystem();
        Assert.assertEquals("valid",userRegistrationSystem.validateEmail("abc@gmail.com"));
        Assert.assertEquals("valid",userRegistrationSystem.validateEmail("Rahul@gmail.com"));
        Assert.assertEquals("valid",userRegistrationSystem.validateEmail("Rahul-100@gmail.com"));
        Assert.assertEquals("valid",userRegistrationSystem.validateEmail("Rahul.100@gmail.com"));
        Assert.assertEquals("valid",userRegistrationSystem.validateEmail("Rahul-100@Rahul.com"));
        Assert.assertEquals("valid",userRegistrationSystem.validateEmail("Rahul-100@Rahul.net"));
        Assert.assertEquals("valid",userRegistrationSystem.validateEmail("Rahul.100@Rahul.com.au"));
        Assert.assertEquals("valid",userRegistrationSystem.validateEmail("Rahul@1.com"));
        Assert.assertEquals("valid",userRegistrationSystem.validateEmail("Rahul@gmail.com.com"));
        Assert.assertEquals("valid",userRegistrationSystem.validateEmail("Rahul+100@yahoo.com"));
    }

    @Test
    public void givenEmailNotProper_returnInvalid()
    {
        UserRegistrationSystem userRegistrationSystem = new UserRegistrationSystem();
        Assert.assertEquals("invalid",userRegistrationSystem.validateEmail("Rahul@.com.my"));
        Assert.assertEquals("invalid",userRegistrationSystem.validateEmail("Rahul123@gmail.a"));
        Assert.assertEquals("invalid",userRegistrationSystem.validateEmail("Rahul123@.com"));
        Assert.assertEquals("invalid",userRegistrationSystem.validateEmail("Rahul123@.com.com"));
        Assert.assertEquals("invalid",userRegistrationSystem.validateEmail(".Rahul@Rahul.com"));
        Assert.assertEquals("invalid",userRegistrationSystem.validateEmail("Rahul()*@gmail.com"));
        Assert.assertEquals("invalid",userRegistrationSystem.validateEmail("Rahul@%*.com"));
        Assert.assertEquals("invalid",userRegistrationSystem.validateEmail("Rahul..2002@gmail.com"));
        Assert.assertEquals("invalid",userRegistrationSystem.validateEmail("Rahul.@gmail.com"));
        Assert.assertEquals("invalid",userRegistrationSystem.validateEmail("Rahul@Rahul@gmail.com"));
        Assert.assertEquals("invalid",userRegistrationSystem.validateEmail("Rahul@gmail.com.1a"));
        Assert.assertEquals("invalid",userRegistrationSystem.validateEmail("Rahul@gmail.com.aa.au"));
    }
}
