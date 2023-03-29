package com.example.springboot;

import org.hibernate.validator.constraints.Length;

import javax.validation.Constraint;
import javax.validation.constraints.Size;
import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@VendorCode
@Size(min = 10, max = 16)
@Documented
@Constraint(validatedBy={ })
public @interface CombinedAnnotation {
    java.lang.String message() default "Артикул невалиден";

    java.lang.Class<?>[] groups() default {};

    java.lang.Class<? extends javax.validation.Payload>[] payload() default {};
}
