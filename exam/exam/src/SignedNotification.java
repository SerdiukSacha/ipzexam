// ConcreteDecorator
class SignedNotification extends NotificationDecorator {
    public SignedNotification(Notification notification) {
        super(notification);
    }

    @Override
    public String getContent() {
        return notification.getContent() + " [Signed]";
    }
}
