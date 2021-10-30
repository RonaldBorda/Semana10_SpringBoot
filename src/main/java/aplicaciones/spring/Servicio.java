package aplicaciones.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Servicio {
	@RequestMapping("/producto")
	public String mostrar() {
		String cod="001";
		String des="producto de construcción";
		String pre="s/700.5";
		System.out.println("Codigo: 001");
		System.out.println("Descripción: producto de construcción");
		System.out.println("Precio: s/700.5");
		return ("Codigo :"+cod +" | "+"Descripción: "+des+" | "+"Precio: "+pre);
		
	}
}
