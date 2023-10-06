package oop.withoutinterface;


public class Client {

    public void someMethod() {
        FakeMessageSender messageSender = new FakeMessageSender();
        messageSender.send();
    }
}