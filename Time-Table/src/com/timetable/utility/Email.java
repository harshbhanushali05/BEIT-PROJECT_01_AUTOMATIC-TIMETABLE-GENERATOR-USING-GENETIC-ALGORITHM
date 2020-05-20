package com.timetable.utility;



import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



public class Email {
	
	public static void sendEmail(String host, String port,
			final String userName, final String password,
			String emailId,String message,String subject,String loginId,String pass) throws AddressException,
			MessagingException {
		
		
		
		// sets SMTP server properties
		
		Properties properties = new Properties();
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", port);
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");

		// creates a new session with an authenticator
		 
		Authenticator authenticator=new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(userName, password);
				
			}
			
			
		};
		
		
	
		Session session = Session.getInstance(properties, authenticator);

		// creates a new e-mail message
		
		Message msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress());
		InternetAddress[] toAddresses = { new InternetAddress(emailId) };
		msg.setRecipients(Message.RecipientType.TO, toAddresses);
		msg.setSubject("Subject:-"+subject);
	
		//msg.setSentDate(new Date());
		msg.setText("Name :-    Email Id :-"+emailId+"    Message :-"+message );
		String code="your Login Id:  "+loginId+"       and your password:-  "+pass;
		//msg.setText("Email Id:+"+emailId);
	    msg.setText("Message:-"+message
			+"\n"+"\b"+
			
			"login details:-   "   +  code);
      
		
		Transport.send(msg);

	}

}
