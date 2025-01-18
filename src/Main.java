import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створення користувачів
        User user1 = new User("User 1");
        User user2 = new User("User 2");

        // Створення видавця новин
        NewsPublisher newsPublisher = new NewsPublisher();
        newsPublisher.registerObserver(user1);
        newsPublisher.registerObserver(user2);

        // Створення повідомлення
        Notification notification = new SimpleNotification("New products available!");

        // Додавання декораторів до повідомлення
        notification = new EncryptedNotification(notification);
        notification = new SignedNotification(notification);

        // Відправка повідомлення
        newsPublisher.sendNews(notification);

        // Використання Singleton
        NotificationService service = NotificationService.getInstance();
        service.sendMessage(notification, List.of(user1, user2));

        // Використання State
        Message message = new Message();
        System.out.println("Initial state: " + message.getStateName());
        message.updateState();
        System.out.println("State after update: " + message.getStateName());
    }
}