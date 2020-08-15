package br.com.banpara.producer.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Service;

import br.com.banpara.producer.model.Transacao;
import br.com.banpara.producer.model.domain.TipoTransacao;

@Service
public class TransacaoService {

	private static final DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	public Transacao criar() {
		Random r = new Random();
		int trans = r.nextInt(4) + 1;
		Double valor = Math.random() * 4000;
		String descricao = "";
		TipoTransacao tipo = TipoTransacao.TED;
		switch (trans) {
		case 1:
			descricao = "Pagamento de Boleto de Cobrança";
			break;
		case 2:
			descricao = "Pagamento de Boleto de Consumo";
			break;
		case 3:
			descricao = "TED";
			break;
		case 4:
			descricao = "Transferência entre Contas Banpará";
			break;
		}
		 Date data = new Date();
		return new Transacao(sdf.format(data), descricao, valor, System.nanoTime());
	}
}
