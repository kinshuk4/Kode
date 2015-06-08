package org.convey.example.email;

import org.convey.example.model.EmailMessage;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

/**
 * $LastChangedDate:  $
 * $LastChangedBy:  $
 * $LastChangedRevision:  $
 */

public class EmailSender {


    private MailSender mailSender;

    public void setMailSender(MailSender mailSender) {
        this.mailSender = mailSender;
    }


    public void sendEmail(EmailMessage emailMessage){

        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(emailMessage.getReceiverEmailAddress());
        message.setSubject(emailMessage.getSubject());
        message.setText(emailMessage.getMessageBody());
        //sending the message
        mailSender.send(message);

    }


}
