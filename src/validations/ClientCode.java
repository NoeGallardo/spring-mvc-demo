package validations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = ClientConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ClientCode {

	public String value() default "LUV";						//Define default course Code
	public String message() default "Must start with LUV";		//Define default Error MEssage
	public Class<?>[] groups() default {};						//Define default groups
	public Class<? extends Payload>[] payload() default {};		//Define default payload
}
