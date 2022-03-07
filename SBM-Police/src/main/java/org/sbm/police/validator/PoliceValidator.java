package org.sbm.police.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.sbm.police.domain.Policelerim;
import org.sbm.police.repository.PoliceRepository;
import org.sbm.police.validator.anno.PoliceKontrol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PoliceValidator implements ConstraintValidator<PoliceKontrol, String> {

	@Autowired
	PoliceRepository policerepository;

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {

		Policelerim police = policerepository.findFirstByPoliceTipi(value);
		if (police == null)
			return true;
		else
			return false;

	}
	

}
