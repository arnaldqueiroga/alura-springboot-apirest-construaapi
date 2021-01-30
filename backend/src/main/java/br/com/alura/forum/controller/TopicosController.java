package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.dto.TopicoDTO;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@RestController
public class TopicosController {
	
	@RequestMapping("/topicos")
	public List<TopicoDTO> lista(){
		// vamos carregar a lista com todos os tópicos, e devolver ela 
		Topico topico = new Topico("DUvida", "Duvida com Sprint", new Curso("Spring", "Programação"));		
		
		// devolvendo a lista de tópicos dto e criando método para encapsular a conversão de topico para topicoDTO dentro da classe DTO
	
		return TopicoDTO.converter(Arrays.asList(topico, topico, topico));
		
	}

}
