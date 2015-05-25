package example;

import org.apache.commons.logging.impl.SLF4JLogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MvcController {

	@RequestMapping(method = RequestMethod.GET)
	public String form(Model model) {
		return "form";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String upate(Model model, BindingResult bindingResult) {
		SLF4JLogFactory.getLog(MvcController.class).info("model = " + model);
		return "redirect:/";
	}
	
}
