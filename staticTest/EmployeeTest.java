package staticTest;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employeeLee = new Employee();

        employeeLee.setEmployeeName("이신");
        System.out.println(employeeLee.serialNum); //static =1000


        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");
        employeeKim.serialNum++;


        System.out.println(employeeLee.serialNum);//static =1001
        System.out.println(employeeKim.serialNum);//static =1001

    }
}
