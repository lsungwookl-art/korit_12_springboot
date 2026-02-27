package test8;

interface Notification {
    void send(String message);
}

class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("이메일 발송:" + message);
    }
}

class SmsNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("SMS 발송:" + message);
    }
}

public class Notifier {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification sms = new SmsNotification();

        email.send("주문이 완료되었습니다.");
        sms.send("배송이 시작되었습니다.");
    }
}