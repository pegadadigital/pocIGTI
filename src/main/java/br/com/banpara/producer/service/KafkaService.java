package br.com.banpara.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import br.com.banpara.producer.model.Transacao;

@Service
public class KafkaService {
	@Autowired
	private KafkaTemplate<String, Transacao> template;

	public void enviar(Transacao transacao) {
		String key = transacao.getData();
		ListenableFuture<SendResult<String, Transacao>> listenableFuture = template.sendDefault(key, transacao);

		listenableFuture.addCallback(new ListenableFutureCallback<SendResult<String, Transacao>>() {
			@Override
			public void onFailure(Throwable ex) {
				handleFailure(key, transacao, ex);
			}

			@Override
			public void onSuccess(SendResult<String, Transacao> result) {
				handleSuccess(key, transacao, result);
			}
		});

	}

	private void handleFailure(String key, Transacao transacao, Throwable ex) {
		System.err.println("Erro ao enviar mensagem e a exceção é " + ex.getMessage());
		try {
			throw ex;
		} catch (Throwable throwable) {
			System.err.println("Erro no OnFailure " + ex.getMessage());
		}

	}

	private void handleSuccess(String key, Transacao transacao, SendResult<String, Transacao> result) {
		System.out.println("Mensagem enviada com sucesso para a chave " + key + " e o valor é " + transacao.toString()
				+ " e a particao é " + result.getRecordMetadata().partition());
	}

}
