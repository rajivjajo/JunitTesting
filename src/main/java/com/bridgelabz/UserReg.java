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

    public boolean validatePhoneNumber(String phoneNumber) {
        String phoneNum = "^[+][0-9]{2}+[ ]*[1-9]{1}[0-9]{9}$";
        Pattern pattern = Pattern.compile(phoneNum);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
    public boolean validatePassword(String passWord) {
        String passWordSet = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&])[A-Za-z0-9@$!%*?&]{8,}$";
        Pattern pattern = Pattern.compile(passWordSet);
        Matcher matcher = pattern.matcher(passWord);

            return matcher.matches();
        }
}


