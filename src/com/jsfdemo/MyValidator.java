package com.jsfdemo;


import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("myValidator")
public class MyValidator implements Validator {
	
	
	public void validate(FacesContext context, UIComponent component, java.lang.Object value)
			throws ValidatorException {
		 String name = value.toString();
		 if(name.length() <= 3){
			 FacesMessage msg =
			            new FacesMessage("Please enter Valid Name ");
			         msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			         throw new ValidatorException(msg);
		 }
		
	}

}
