package Observer.NotifyMeProducts;

import Observer.NotifyMeProducts.Observer.EmailObserver;
import Observer.NotifyMeProducts.Observer.SMSObserver;
import Observer.NotifyMeProducts.Subject.PhoneSubject;

import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        PhoneSubject subject = new PhoneSubject();

        EmailObserver emailObserver = new EmailObserver("abc@gmail.com", subject);
        EmailObserver emailObserver2 = new EmailObserver("xyz@gmail.com", subject);

        SMSObserver smsObserver = new SMSObserver("9911981199", subject);

        subject.registerObserver(emailObserver);
        subject.registerObserver(emailObserver2);
        subject.registerObserver(smsObserver);

        Scanner in = new Scanner(System.in);
        while(true) {
            int inputStocks = in.nextInt();
            subject.setStockCount(inputStocks);
        }



    }
}
