import java.util.List;

// Singleton
class NotificationService {
    private static NotificationService instance;

    private NotificationService() {}

    public static NotificationService getInstance() {
        if (instance == null) {
            instance = new NotificationService();
        }
        return instance;
    }

    public void sendMessage(Notification notification, List<User> users) {
        for (User user : users) {
            user.update(notification);
        }
    }
}