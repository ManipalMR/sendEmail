package com.mouritech.email.sendemail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.email.sendemail.model.SendEmail;
import com.mouritech.email.sendemail.service.SendMailService;

@RestController
public class SendMailController {
	
	@Autowired
	private SendMailService sendMailService ;
	
	@PostMapping("/sendMail")
	public ResponseEntity<?> send(@RequestBody SendEmail sendEmail){
		Object response = sendMailService.SendMail(sendEmail);
		return new ResponseEntity<Object> (response,HttpStatus.OK);
		
		
	}

}
