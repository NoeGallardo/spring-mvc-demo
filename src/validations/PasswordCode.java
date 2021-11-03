package validations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = PasswordConstraintValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordCode {

	public String value() default "password";
	public String message() default "El password no debe contener la palabra password";
	public Class<?>[] groups() default {};						//Define default groups
	public Class<? extends Payload>[] payload() default {};	
}
