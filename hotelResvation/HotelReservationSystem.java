package hotelResvation;

import java.util.Scanner;

public class HotelReservationSystem{
        public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Create a hotel with 10 rooms
    Hotel hotel = new Hotel(10);

    boolean running = true;
    while (running) {
        System.out.println("\n===== Hotel Reservation System =====");
        System.out.println("1. Display available rooms");
        System.out.println("2. Reserve a room");
        System.out.println("3. Cancel reservation");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                hotel.displayAvailableRooms();
                break;
            case 2:
                System.out.print("Enter the room number to reserve: ");
                int roomToReserve = scanner.nextInt();
                hotel.reserveRoom(roomToReserve);
                break;
            case 3:
                System.out.print("Enter the room number to cancel reservation: ");
                int roomToCancel = scanner.nextInt();
                hotel.cancelReservation(roomToCancel);
                break;
            case 4:
                running = false;
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
                break;
        }
    }

    System.out.println("Thank you for using the Hotel Reservation System!");
}
}

