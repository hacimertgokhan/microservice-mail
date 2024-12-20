package github.hacimertgokhan.mgmailservice.utils;

import github.hacimertgokhan.mgmailservice.repository.MailRepository;

public class SendMail {

    public SendMail(MailRepository mailRepository, String email) {
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email cannot be empty.");
        }
        mailRepository.sendByMail(email);
    }

    public SendMail(MailRepository mailRepository, long email) {
        if (email <= 0) {
            throw new IllegalArgumentException("Email cannot be empty.");
        }
        mailRepository.sendById(email);
    }

}
