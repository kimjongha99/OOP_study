package bus_subway;

public class TakeTest {
    public static void main(String[] args) {

        Student st1 = new Student("jongha", 5000);
        Student st2 = new Student("oujo",10000);

        Bus bus1 = new Bus(100);

        Subway subwayGreen = new Subway(2);

        st1.takeSubway(subwayGreen);
        st2.takeBus(bus1);


        st1.showMoney();
        st2.showMoney();

        bus1.showBusInfo();

        subwayGreen.showSubwayInfo();
    }
}
