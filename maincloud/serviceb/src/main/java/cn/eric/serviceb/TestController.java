package cn.eric.serviceb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Value("${service.name}")
	private String name;
	@GetMapping("/hello")
	public String test(){
		
		return "Hello this from  "+name;
	}

}
