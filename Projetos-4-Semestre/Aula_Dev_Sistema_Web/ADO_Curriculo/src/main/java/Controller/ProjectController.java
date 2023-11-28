package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import Model.Informacoes;

@Controller
@RequestMapping("/curriculo")
public class ProjectController {
	
	@GetMapping("/dados-pessoais")
	public ModelAndView dadosPessoais() {
	 ModelAndView mv = new ModelAndView("dados-pessoais");
	 mv.addObject("nome", "Nicollas Bruno Pires da Silva");
	 mv.addObject("telefone", "(11)98390-6553");
	 mv.addObject("dataNascimento", "01/05/2001");
	 mv.addObject("email", "Nicollasbrn614@gmail.com");
	 mv.addObject("github", "https://github.com/NicollasBPSilva");
	 return mv;
	}
	
	@GetMapping("/dados-pessoais-recriado")
	public ModelAndView dadosPessoaisRecriado() {
		ModelAndView mv = new ModelAndView("dados-pessoais-recriado");
		mv.addObject("nome", "Nicollas Bruno Pires da Silva");
		mv.addObject("telefone", "(11)98390-6553");
		mv.addObject("dataNascimento", "01/05/2001");
		mv.addObject("email", "Nicollasbrn614@gmail.com");
		mv.addObject("github", "https://github.com/NicollasBPSilva");
	 return mv;
	}
	
	@GetMapping("/formulario")
	public ModelAndView dadosFormulario() {
		Informacoes dados = new Informacoes();
		ModelAndView mv = new ModelAndView("formulario");
		mv.addObject("dados", dados);
		return mv;
	}

	@PostMapping("/salvar")
	public ModelAndView salvar(@ModelAttribute Informacoes dadosRecebidos, 
			RedirectAttributes redirAttr) {
	 
		ModelAndView mv = new ModelAndView("redirect:/curriculo/formulario");
		
		Informacoes dados = new Informacoes();
		dados.setNome(dadosRecebidos.getNome());
		dados.setNumero(dadosRecebidos.getNumero());
		dados.setEmail(dadosRecebidos.getEmail());

		mv.addObject("dados", dadosRecebidos);
		redirAttr.addFlashAttribute("dados", dadosRecebidos);
		
	 return mv;
	}
}
