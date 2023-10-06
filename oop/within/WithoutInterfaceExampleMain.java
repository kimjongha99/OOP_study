package oop.within;

public class WithoutInterfaceExampleMain {

    public static void main(String[] args) {
        MessageSender messageSender = new FakeMessageSender();
        Client client = new Client(messageSender);
        client.someMethod();


        MessageSender messageSender1 = new RealMessageSender();
        Client client1 = new Client(messageSender1);
        client1.someMethod();
    }
}