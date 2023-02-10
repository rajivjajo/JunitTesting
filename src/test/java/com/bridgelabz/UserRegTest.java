package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class UserRegTest {
    static UserReg userReg = new UserReg();

    @Test
    void whenGivenValidFirstNameShouldReturnTrue() {
        boolean validName = userReg.validateFirstName("Rajiv");
        Assertions.assertEquals(true, validName);
    }

    @Test
    void whenGivenValidLastNameShouldReturnTrue() {
        boolean validName = userReg.validateLastName("Jajodia");
        Assertions.assertEquals(true, validName);
    }

    @Test
    void whenGivenValidEmailShouldReturnTrue() {
        boolean validateEmail = userReg.validateEmail("rajiv.jajodia82552@gmail.com");
        Assertions.assertEquals(true, validateEmail);
    }

    @Test
    void whenGivenValidPhoneNumberShouldReturnTrue() {
        boolean validatePhoneNumber = userReg.validatePhoneNumber("+91 9878690911");
        Assertions.assertEquals(true, validatePhoneNumber);
    }

    @Test
    void whenGivenValidPasswordShouldReturnTrue() {
        boolean validatePassword = userReg.validatePassword("Rj&123456");
        Assertions.assertEquals(true, validatePassword);

    }
}
