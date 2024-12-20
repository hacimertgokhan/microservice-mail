package github.hacimertgokhan.mgmailservice.repository;

public interface MailRepository {
    void sendByMail(String email);
    void sendById(long id);
}
