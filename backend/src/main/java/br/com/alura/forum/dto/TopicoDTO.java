package br.com.alura.forum.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.Topico;

public class TopicoDTO {
	
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	
	public TopicoDTO(Topico topico) {
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.dataCriacao = topico.getDataCriacao();
	}
	
	
	public Long getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}


	public static List<TopicoDTO> converter(List<Topico> topicos) {
		
		// esse método recebe a lista de tópicos e devolve a lista de tópicosDTO (fazendo a conversão)
		// vamos usar a API de Stream do Java8 pra não ter que fazer um loop manualmente
		return topicos.stream().map(TopicoDTO::new).collect(Collectors.toList());
		
		// esse new chama o construtor que recebe o próprio tópico como parâmetro.
		
		// e para transformar isso em uma lista, chamamos o collect
	}
	
	
	

}
