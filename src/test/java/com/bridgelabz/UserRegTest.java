package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class UserRegTest {
    static UserReg userReg = new UserReg();

    @Test
     void whenGivenValidFirstShouldReturnTrue() {
        boolean validName = userReg.validateFirstName("Rajiv");
        Assertions.assertEquals(true,validName );
    }
}
