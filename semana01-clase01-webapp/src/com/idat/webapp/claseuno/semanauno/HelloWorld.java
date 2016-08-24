package com.idat.webapp.claseuno.semanauno;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloWorld {
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String messageShow = "<br><div style='text-align:center;'>"
				+ "<h3>********** Testeando Spring MVC **********</h3> Este mensaje fue generado por: HelloWorld.java.</div><br><br>";
		//enviando el mensaje a mostrar en welcome.html
		return new ModelAndView("welcome", "message", messageShow);
	}
}
