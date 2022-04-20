package ribhiansyah.springbootforgotpasswordmain.service.framework;

import ribhiansyah.springbootforgotpasswordmain.entity.Mail;

public interface EmailService {
    void send(Mail mail);
}
