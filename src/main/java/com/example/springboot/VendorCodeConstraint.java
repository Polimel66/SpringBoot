package com.example.springboot;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class VendorCodeConstraint implements ConstraintValidator<VendorCode, String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (s.length() == 12) {
            var alphabeticSymCounter = 0;
            var numericalSymCounter = 0;
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) {
                    numericalSymCounter += 1;
                } else if (Character.isLetter(s.charAt(i)) && Character.isUpperCase(s.charAt(i))) {
                    alphabeticSymCounter += 1;
                } else {
                    return false;
                }
            }
            return alphabeticSymCounter == numericalSymCounter;
        }
        return false;
    }
}
