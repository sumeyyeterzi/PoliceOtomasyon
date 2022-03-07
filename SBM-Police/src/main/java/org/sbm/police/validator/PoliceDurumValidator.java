package org.sbm.police.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.sbm.police.validator.anno.PoliceDurumKontrol;

public class PoliceDurumValidator implements ConstraintValidator<PoliceDurumKontrol, Integer> {

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {

		switch (value) {
		case 1:
			return true;
		case 2:
			return true;
		case 3:
			return true;
		default:
			return false;
		}

	}

}
