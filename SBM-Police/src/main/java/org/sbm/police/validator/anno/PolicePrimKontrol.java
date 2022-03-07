package org.sbm.police.validator.anno;

import java.lang.annotation.ElementType;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import org.sbm.police.validator.PolicePrimValidator;

@Target({ ElementType.FIELD }) //deðiþken üzerinde
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PolicePrimValidator.class)
public @interface PolicePrimKontrol {
	
	String message() default "Police prim degeri aþýldý";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
