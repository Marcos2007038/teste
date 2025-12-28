package TesteRender.TesteRender;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {
	
	
	@GetMapping("ola")
	public String Ola() {
		return "ola";
	}
}
