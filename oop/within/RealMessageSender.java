package oop.within;

public class RealMessageSender implements MessageSender{

    public void send() {
        System.out.println("RealMessageSender, 실제로 메시지 전송");
    }
}