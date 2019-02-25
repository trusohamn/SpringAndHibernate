package com.trusohamn.my_spring_mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomConstraintValidator implements ConstraintValidator<CustomValidation, String>{

	private String myPrefix;
	
	@Override
	public void initialize(CustomValidation cv) {
		myPrefix = cv.value();
	}
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		boolean result = true;
		if (theCode != null) {
				result = theCode.startsWith(myPrefix);
		}
		
		return result;
	}

}
