package com.stepinfo.stepcamp.controller;

import com.stepinfo.stepcamp.model.Voiture;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import javax.validation.Validator;

public class VoitureValidator implements org.springframework.validation.Validator {

    public boolean supports(Class<?> clazz) {
        return clazz.equals(Voiture.class);
    }

    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "options", "options.vide", "L'option ne doit pas être vide");
    }
}
