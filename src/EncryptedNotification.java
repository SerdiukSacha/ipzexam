// ConcreteDecorator
class EncryptedNotification extends NotificationDecorator {
    public EncryptedNotification(Notification notification) {
        super(notification);
    }

    @Override
    public String getContent() {
        return "Encrypted: " + notification.getContent();
    }
}


