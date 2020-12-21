package com.astronomy.controller.web;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MailerController {
	
	@Autowired
	private JavaMailSender mailSender;
	
	@PostMapping(value = "/send")
	public String send(Model model, @RequestParam("from") String from,
			@RequestParam("to") String to, @RequestParam("subject") String subject,
			@RequestParam("body") String body) {
		System.out.println("mail");
		try {
			MimeMessage mail = mailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(mail);
			helper.setFrom(from, from);
			helper.setTo(to);
			helper.setReplyTo(from, from);
			helper.setSubject(subject);
			helper.setText(body, true);
			mailSender.send(mail);
			model.addAttribute("message", "Gửi email thành công");
			System.out.println("successful");
		} catch (Exception e) {
			System.out.println("failer");
			model.addAttribute("message", "Gửi thất bại");
		}
		return "redirect:/contact";
	}
}
