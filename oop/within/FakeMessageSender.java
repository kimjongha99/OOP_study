package oop.within;

public class FakeMessageSender implements MessageSender {
    public void send() {
        System.out.println("FakeMessageSender,  실제로 메시지 전송되지 않음");
    }
}