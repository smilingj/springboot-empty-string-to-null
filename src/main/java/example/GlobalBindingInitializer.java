package example;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice
public class GlobalBindingInitializer {

	/*
	 * For explanation see
	 * 
	 * http://stackoverflow.com/questions/1268021/how-can-i-register-a-global-custom-editor-in-spring-mvc
	 * http://stackoverflow.com/questions/30437639/spring-boot-thymeleaf-bind-empty-form-input-to-null-string
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	    binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	}
	
}
