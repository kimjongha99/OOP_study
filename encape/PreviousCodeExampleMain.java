package encape;

import static encape.CalculateType.ADD;

public class PreviousCodeExampleMain {
    public static void main(String[] args) {
        CalculateCommand calculateCommand = new CalculateCommand(
                ADD,
                100,
                2
        );

        Client client = new Client();
        int result = client.someMethod(calculateCommand);

        System.out.println(result);
    }
}
