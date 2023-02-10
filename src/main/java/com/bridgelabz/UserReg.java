package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserReg {
    Pattern pattern;
    Matcher matcher;
    public static final String validName = "^[A-Z][a-zA-Z]{2,}";

    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(validName);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(validName);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    public boolean validateEmail(String email) {
        String ValidEmail = "^[a-z0-9]+[_+-.][a-z0-9]*[^_+-.]@([a-z0-9])+([.][a-z]{2,})(.[a-z]{2,3})?$";
        Pattern pattern = Pattern.compile(ValidEmail);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}


