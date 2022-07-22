package FactoryPattern;

public class NotificationFactory {
    public Notification createNotification(String channel){
        if (channel == null || channel.isEmpty())
            return null;
        switch (channel){
            case "sms":
                return new SmsNotification();
            case "email":
                return new EmailNotification();

            case "push":
                return new PushNotification();

            default:
                throw new IllegalArgumentException("unknown channel"+channel);
        }
    }
}
