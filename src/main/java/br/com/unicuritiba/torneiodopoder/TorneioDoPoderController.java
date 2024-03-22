package br.com.unicuritiba.torneiodopoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.unicuritiba.torneiodopoder.models.Lutador;
import br.com.unicuritiba.torneiodopoder.repositories.LutadorRepository;

@Controller
public class TorneioDoPoderController {
	
	@Autowired //Gestão automática da instância de um elemento pelo spring
	private LutadorRepository repositorio;
	
	@GetMapping ("/Teste")
	public String home(){
		Lutador lutador1 = new Lutador();
		repositorio.save(lutador1);
		return "index";
	}

	
}
