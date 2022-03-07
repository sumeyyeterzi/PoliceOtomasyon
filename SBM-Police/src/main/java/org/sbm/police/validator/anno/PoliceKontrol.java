package org.sbm.police.validator.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import org.sbm.police.validator.PoliceValidator;

@Target({ ElementType.FIELD })  //deðiþken üzerinde
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PoliceValidator.class)
public @interface PoliceKontrol {
	String message() default "Police zaten var";
	
	Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
