package py.edu.facitec.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //


public class HomeControler {
	
	//mapea una url para gestionar
	@RequestMapping("/home")
	
	public String index(){
		
		System.out.println("pagina cargada");
			    //nombre del archivo
		return "hello-world";
							
	}

}
