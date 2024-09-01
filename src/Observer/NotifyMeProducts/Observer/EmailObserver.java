package Observer.NotifyMeProducts.Observer;

import Observer.NotifyMeProducts.Subject.PhoneSubject;

public class EmailObserver implements IObserver {
    String email;
    PhoneSubject subject;
    public EmailObserver(String email, PhoneSubject subject) {
        this.email = email;
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("send email to " + email + " product is back in stock");
    }
}
