package force.backend.tutorialmicroservicio.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EjemploController {
	
	@RequestMapping(value="/sayHello",method=RequestMethod.GET)
	public String sayHello(){
		return "Hola mundo";
	}

}
