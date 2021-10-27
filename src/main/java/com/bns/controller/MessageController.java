package com.bns.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	Logger logger = LoggerFactory.getLogger(MessageController.class);

	@GetMapping("/message")
	public String gerMessage() {

		logger.trace("[getMessage()] trace message");
		logger.debug("[getMessage()] debug message");
		logger.info("[getMessage()] info message");
		logger.warn("[getMessage()] warn message");
		logger.error("[getMessage()] error message");
        System.out.println(1/0);
		return "Welcome to Spring Boot Loogers open console to check logs";
	}

}
