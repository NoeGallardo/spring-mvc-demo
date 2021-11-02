package validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ClientConstraintValidator implements ConstraintValidator<ClientCode, String> {

	private String clientPrefix;
	
	@Override
	public void initialize(ClientCode cc) {
		this.clientPrefix = cc.value();
	}
	
	@Override
	public boolean isValid(String code, ConstraintValidatorContext cvc) {
		// TODO Auto-generated method stub
		boolean result; 
		
		if(code != null) { result = code.startsWith(this.clientPrefix);}
		else {result = true;} 
		
		return result;
	}
	
}
