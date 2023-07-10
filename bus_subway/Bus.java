package bus_subway;

public class Bus {

    int busNumber;
    int passengerCount;
    int money;
    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take(int money) {
        this.money +=money;
        passengerCount++;
    }

    public void showBusInfo(){
        System.out.println(busNumber + "의 총탑승객은" + passengerCount + "이고 총수입은" + this.money + "원입니다.");
    }
}
