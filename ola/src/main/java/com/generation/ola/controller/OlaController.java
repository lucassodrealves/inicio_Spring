package com.generation.ola.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/oi")

public class OlaController {
		@GetMapping
		public String opa() {
			return "chegou,malandro";
	}
		
	@RequestMapping("/bsm's")
	@GetMapping
	public String bsm(){
		return "Mentalidades\n.Persistência\n.Orientação ao futuro\n.Orientação ao detalhe\n.Comunicação\n\nHabilidades\n.Gestão de tempo\n.Proatividade\n.Trabalho em equipe";
		
	}

	@RequestMapping("/ob")
	@GetMapping
	public String alcances(){
		return "Ficar com o banco de dados SQL afinado\nComunicar-se sempre que sentir necessário\nEnfrentar as atividades e desafios com calma e precisão";
		
	}

	}


