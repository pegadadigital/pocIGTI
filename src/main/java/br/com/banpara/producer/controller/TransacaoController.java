
package br.com.banpara.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.banpara.producer.model.Transacao;
import br.com.banpara.producer.service.KafkaService;
import br.com.banpara.producer.service.TransacaoService;

@RestController
@RequestMapping(value = "/transacoes")
public class TransacaoController {

	@Autowired
	private TransacaoService transacaoService;
	
	@Autowired
	private KafkaService kafkaService;

	@PostMapping("/v1")
	public ResponseEntity<Transacao> criar() {
		Transacao transacao = transacaoService.criar();
		kafkaService.enviar(transacao);
		return ResponseEntity.ok().body(transacao);
	}
}
