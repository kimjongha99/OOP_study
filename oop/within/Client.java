package oop.within;

public class Client {

    private MessageSender messageSender;

    Client(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void someMethod() {
        messageSender.send();
    }
}