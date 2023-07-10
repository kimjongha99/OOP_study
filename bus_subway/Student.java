package bus_subway;

public class Student {

    String StuName; //학생이름
    int grade;
    int money;

    public Student(String stuName, int money) {
        this.StuName = stuName;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;

    }
    public void takeSubway(Subway subway) {
        subway.take(1200);
        this.money -=1200;
    }

    public void showMoney() {
        System.out.println(StuName+"의 남은돈은"+money+"입니다.");
    }
}
