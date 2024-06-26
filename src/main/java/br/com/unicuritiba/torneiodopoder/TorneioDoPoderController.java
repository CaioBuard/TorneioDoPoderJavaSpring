package br.com.unicuritiba.torneiodopoder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.unicuritiba.torneiodopoder.models.Lutador;
import br.com.unicuritiba.torneiodopoder.repositories.LutadorRepository;

@Controller
public class TorneioDoPoderController {
	
	@Autowired //Gestão automática da instância de um elemento pelo spring
	private LutadorRepository repositorio;
	
	@GetMapping ("/")
	public ModelAndView home() {		
		List<Lutador> lutadores = repositorio.findAll();
		ModelAndView view = new ModelAndView("index");
		view.addObject ("lutadores", lutadores);
		return view;
	}
	
	@GetMapping("/cadastro")
	public ModelAndView create() {		
		ModelAndView view = new ModelAndView("create");
		view.addObject("lutador", new Lutador());
		return view;
	}

	@PostMapping ("/cadastro")
	public String createFighter(Lutador lutador, Model model, BindingResult result) {
		repositorio.save(lutador);
		return "redirect:/";
	}
	
}
