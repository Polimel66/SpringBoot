package com.example.springboot;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = VendorCodeConstraint.class)
public @interface VendorCode {
    java.lang.String message() default "Артикул невалиден (Артикул не " +
            "может содержать строчные буквы, при этом количество букв и цифр должно быть одинаково.)";

    java.lang.Class<?>[] groups() default {};

    java.lang.Class<? extends javax.validation.Payload>[] payload() default {};
}
