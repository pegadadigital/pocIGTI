
package br.com.banpara.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

	@Autowired
	private Environment env;

	@RequestMapping(value = "/endpoint", method = RequestMethod.GET)
	public ResponseEntity<String> find() {
		String bootstrapServers = env.getProperty("spring.kafka.bootstrap-servers");
		return ResponseEntity.ok().body(bootstrapServers);
	}
}
