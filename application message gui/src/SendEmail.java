
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {  
	public void MailSend(String recepteur,String contenu,String object) {
		 final String username = "ensate.apoge@gmail.com";
	        final String password = "passwordEnsateApoge";

	        Properties prop = new Properties();
	        prop.put("mail.smtp.host", "smtp.gmail.com");
	        prop.put("mail.smtp.port", "465");
	        prop.put("mail.smtp.auth", "true");
	        prop.put("mail.smtp.socketFactory.port", "465");
	        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	        
	        Session session = Session.getInstance(prop,
	                new javax.mail.Authenticator() {
	                    protected PasswordAuthentication getPasswordAuthentication() {
	                        return new PasswordAuthentication(username, password);
	                    }
	                });
	        try {
	            Message message = new MimeMessage(session);
	            message.setFrom(new InternetAddress("ensate.apoge@gmail.com"));
	            message.setRecipients(
	                    Message.RecipientType.TO,
	                    InternetAddress.parse(recepteur)
	            );
	            message.setSubject(object);
	            message.setText(contenu);
	            Transport.send(message);
	        } catch (MessagingException e) {
	            e.printStackTrace();
	        }
	}
}