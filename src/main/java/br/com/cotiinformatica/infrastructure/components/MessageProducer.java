package br.com.cotiinformatica.infrastructure.components;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MessageProducer {

	// apache kafka
	private final KafkaTemplate<String, String> kafkaTemplate;

	// método para escrever mensagem na fila
	public void send(String message) {
		kafkaTemplate.send("pessoas", message);
	}
}
