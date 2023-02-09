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
        boolean validName = userReg.validateFirstName("Jajodia");
        Assertions.assertEquals(true, validName);
    }
}
