package github.hacimertgokhan.mgmailservice.service;

import github.hacimertgokhan.mgmailservice.repository.MailRepository;
import github.hacimertgokhan.mgmailservice.utils.SendMail;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    private final MailRepository mailRepository;

    public MailService(MailRepository mailRepository) {
        this.mailRepository = mailRepository;
    }

    public void sendEmail(String email) {
        new SendMail(mailRepository, email);
    }

    public void sendEmailById(long id) {
        new SendMail(mailRepository, id);
    }
}