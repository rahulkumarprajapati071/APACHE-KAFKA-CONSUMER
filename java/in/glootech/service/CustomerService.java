package in.glootech.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import in.glootech.constaints.KafkaConstaints;
import in.glootech.entity.Customer;

@Service("customerService")
public class CustomerService {
	
	@KafkaListener(topics = KafkaConstaints.TOPIC,groupId = KafkaConstaints.GROUP_ID)
	public void listener(String c) {
		System.out.println("***Msg recieved from kafka topic:: "+c);
	}
}
