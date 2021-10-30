package aplicaciones.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Servicio {
	@RequestMapping("/producto")
	public String mostrar() {
		String cod="002";
		String des="Producto domestico";
		String pre="s/100.5";
		System.out.println("Codigo: 002");
		System.out.println("Descripción: producto domestico");
		System.out.println("Precio: s/100.5");
		return ("Codigo :"+cod +" | "+"Descripción: "+des+" | "+"Precio: "+pre);
		
	}
}
