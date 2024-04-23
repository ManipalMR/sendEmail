package com.mouritech.email.sendemail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.mouritech.email.sendemail.model.SendEmail;

@Service
public class SendMailServiceImpl implements SendMailService{
	
	
	@Autowired
	private JavaMailSender  javaMailSender ; 

	@Override
	public Object SendMail(SendEmail sendEmail) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("reddym.in@mouritech.com");
		message.setTo(sendEmail.getEmail());
		message.setText(sendEmail.getBody());
		message.setSubject( sendEmail.getSubject());
		javaMailSender.send(message);
		return "sent Sucessfully";
	}

}
