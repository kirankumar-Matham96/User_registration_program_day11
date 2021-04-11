import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserEmailValidationParameterisedTest {
    private String email;
    private boolean expected;
    private UserRegistrationProgram userRegistrationProgram;
    
    @Before
    public static void initialize(){
        UserRegistrationProgram userRegistrationProgram = new UserRegistrationProgram();
    }
    
    @Test
    public void emailValidationTest(){
        Assert.assertEquals(expected,userRegistrationProgram.validateEmail(email));
    }
    
    @Test
    public void multipleEmailTest(String email, boolean expected) {
        this.email = email;
        this.expected = expected;
    }
    
    @Parameterized.Parameters
    public static Collection emails(){
        return Arrays.asList(new Object[][] {{"Rahul@gmail.com",true},
                                             {"Rahul-100@gmail.com",true},
                                             {"Rahul.100@gmail.com",true},
                                             {"Rahul-100@Rahul.com",true},
                                             {"Rahul-100@Rahul.net",true},
                                             {"Rahul.100@Rahul.com.au",true},
                                             {"Rahul@1.com",true},
                                             {"Rahul@gmail.com.com",true},
                                             {"Rahul+100@yahoo.com",true},
                                             {"Rahul@.com.my",false},
                                             {"Rahul123@gmail.a",false},
                                             {"Rahul123@.com",false},
                                             {"Rahul123@.com.com",false},
                                             {".Rahul@Rahul.com",false},
                                             {"Rahul()*@gmail.com",false},
                                             {"Rahul@%*.com",false},
                                             {"Rahul..2002@gmail.com",false},
                                             {"Rahul.@gmail.com",false},
                                             {"Rahul@Rahul@gmail.com",false},
                                             {"Rahul@gmail.com.1a",false},
                                             {"Rahul@gmail.com.aa.au",false}});
    }
}
