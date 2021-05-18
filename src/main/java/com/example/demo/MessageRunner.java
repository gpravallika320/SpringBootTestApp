package com.example.demo;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class MessageRunner implements CommandLineRunner {
private static Logger log=LoggerFactory.getLogger(MessageRunner.class);
@Override
	public void run(String... args) throws Exception {
		int a=10;
		try {
			log.info("started");
		} catch (Exception e) {
			// TODO: handle exception
		}
        System.out.println("Hello Git code");
	}

}
