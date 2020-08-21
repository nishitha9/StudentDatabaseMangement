package we.app.sdb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
@EnableWebMvc
public class ConfigClass {
	
	@Bean
	public MappingJackson2HttpMessageConverter converterMethod()
	{
		ObjectMapper objMapper=new ObjectMapper();
		
		MappingJackson2HttpMessageConverter converter =new MappingJackson2HttpMessageConverter();
		
		converter.setObjectMapper(objMapper);
		
		return converter;
	}

}
