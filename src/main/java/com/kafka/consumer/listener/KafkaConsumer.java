package com.kafka.consumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafka.consumer.module.Message;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class KafkaConsumer {
	
	  @KafkaListener(topics = "DATABUS", groupId="group_json",
	            containerFactory = "userKafkaListenerFactory")
	    public void consumeOne(Message msg) {
		  log.debug("consumeOne :: Consumed JSON Message: " + msg);
	        System.out.println("Consumed JSON Message: " + msg);
	    }
	  @KafkaListener(topics = "DATABUS", groupId="group_json",
	            containerFactory = "userKafkaListenerFactory")
	    public void consumeTwo(Message msg) {
	        System.out.println("Consumed JSON Message: " + msg);
	        log.debug("consumeTwo :: Consumed JSON Message: " + msg);
	    }
	  @KafkaListener(topics = "DATABUS", groupId="group_json",
	            containerFactory = "userKafkaListenerFactory")
	    public void consumeThree(Message msg) {
	        System.out.println("Consumed JSON Message: " + msg);
	        log.debug("consumeTwo :: Consumed JSON Message: " + msg);
	    }

}
