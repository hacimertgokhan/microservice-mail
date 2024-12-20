package github.hacimertgokhan.mgmailservice.controller;

import github.hacimertgokhan.mgmailservice.service.MailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/mail")
public class MailController {

    private final MailService mailService;

    public MailController(MailService mailService) {
        this.mailService = mailService;
    }

    @PostMapping("/send")
    public String sendEmail(@RequestParam String email) {
        mailService.sendEmail(email);
        return "Email sent to: " + email;
    }

    @PostMapping("/sendById")
    public String sendEmailById(@RequestParam long id) {
        mailService.sendEmailById(id);
        return "Email sent to ID: " + id;
    }
}