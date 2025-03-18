class PushNotification implements Notification {
    public void send(String message) {
        System.out.println("Enviando Push Notification: " + message);
    }
}