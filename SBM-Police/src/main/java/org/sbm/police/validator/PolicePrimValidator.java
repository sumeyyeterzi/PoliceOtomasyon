package org.sbm.police.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.sbm.police.repository.PoliceRepository;
import org.sbm.police.validator.anno.PolicePrimKontrol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PolicePrimValidator implements ConstraintValidator<PolicePrimKontrol, Integer> {
	
	@Autowired
	PoliceRepository policerepository;

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		
		Integer police = policerepository.sumInteger();
		if(police < 10000000)
			
			return true;
		else
			return false;

	}
	
}
