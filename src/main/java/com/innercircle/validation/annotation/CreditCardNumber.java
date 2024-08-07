package com.innercircle.validation.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@BaseValidation(
        pattern = "^(\\d{4}-\\d{4}-\\d{4}-\\d{4}|\\d{16})$",
        message = "Invalid credit card number format"
)
public @interface CreditCardNumber {
}
