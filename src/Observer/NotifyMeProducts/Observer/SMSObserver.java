package Observer.NotifyMeProducts.Observer;

import Observer.NotifyMeProducts.Subject.PhoneSubject;

public class SMSObserver implements IObserver {
    String phoneNumber;
    PhoneSubject subject;
    public SMSObserver(String phoneNumber, PhoneSubject subject) {
        this.phoneNumber = phoneNumber;
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("send sms to " + phoneNumber + " product is back in stock");
    }
}
