package com.bl.addressbook.Addressbook;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class AddressbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressbookApplication.class, args);
		log.info("Logging is activated");
	}

}
