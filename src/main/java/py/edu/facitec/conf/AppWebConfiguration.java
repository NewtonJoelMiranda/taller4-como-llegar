package py.edu.facitec.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//antes se configuraba en xml
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import py.edu.facitec.controler.HomeControler;
@EnableWebMvc // trabajar con la libreria MVC de springt

@ComponentScan(basePackageClasses={HomeControler.class})

public class AppWebConfiguration extends WebMvcConfigurerAdapter{

	public InternalResourceViewResolver internalResourceViewResolver(){

		InternalResourceViewResolver resolver=new InternalResourceViewResolver();
		//prefijo
		resolver.setSuffix("/WEB-INF/VIEWS/");

		//sufijo
		resolver.setSuffix(".jsp");

		return resolver;

	}

}
