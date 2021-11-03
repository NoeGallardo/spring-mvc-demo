package validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordConstraintValidator implements ConstraintValidator<PasswordCode, String> {

	private String pass;
	
	
	public void initialize(PasswordCode pc) {
		this.pass = pc.value();
	}
	
	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext cvc) {
		boolean result;
		
		if(pass != null) {
			 if(pass.contains(pass)) {
				 return false;
			 }
		}
		return true;
	}

}
