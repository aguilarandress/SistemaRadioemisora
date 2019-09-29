package mailer;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * Clase para enviar correos electronicos a otros usuarios
 *
 * @author Andres
 */
public class Correo {

    final String username;
    final String password;

    private static final String host = "smtp.gmail.com";
    private static final String port = "587";

    private Properties props;

    private String subject;
    private String emailBody;

    public Correo(String subject, String emailBody) {
        this.username = "tp1.radioemisora@gmail.com";
        this.password = "progra1poo";
        this.subject = subject;
        this.emailBody = emailBody;

        this.setPropiedades();
    }

    /**
     * Configura las propiedades del correo como host y puerto
     */
    public void setPropiedades() {
        this.props = new Properties();
        this.props.put("mail.smtp.host", host);
        this.props.put("mail.smtp.port", port);
        this.props.put("mail.smtp.auth", "true");
        this.props.put("mail.smtp.starttls.enable", "true");
    }

    /**
     * Envia el correo a la direccion deseada
     *
     * @param toAddress La direccion de correo que recibe el email
     * @return Un valor booleano que determina si el correo se envio con exito
     */
    public boolean enviarCorreo(String toAddress) {
        // Obtener datos del correo cliente
        String fromUsername = this.username;
        String fromPassword = this.password;
        // Crear sesion
        Session session = Session.getInstance(this.props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromUsername, fromPassword);
            }
        });

        try {
            // Crear mensaje
            Message newMessage = new MimeMessage(session);
            newMessage.setFrom(new InternetAddress(this.username));
            newMessage.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(toAddress)
            );
            newMessage.setSubject(this.subject);
            newMessage.setContent(this.emailBody, "text/html");
            Transport.send(newMessage);
            System.out.println("Mensaje enviado");
            return true;
        } catch (MessagingException e) {
            return false;
        }
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getEmailBody() {
        return emailBody;
    }

    public void setEmailBody(String emailBody) {
        this.emailBody = emailBody;
    }
}
