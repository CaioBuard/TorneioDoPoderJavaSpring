package br.com.unicuritiba.torneiodopoder;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TorneioDoPoderController {
	
	@GetMapping ("/Teste")
	public String home(){
		return "index";
	}

	
}
