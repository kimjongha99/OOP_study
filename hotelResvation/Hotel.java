package hotelResvation;

import java.util.ArrayList;
import java.util.List;


class Hotel {
    private Room[] rooms;

    public Hotel(int numRooms) {
        rooms = new Room[numRooms];
        for (int i = 0; i < numRooms; i++) {
            rooms[i] = new Room(i + 1);
        }
    }

    public void displayAvailableRooms() {
        System.out.println("Available Rooms:");
        for (Room room : rooms) {
            if (!room.isReserved()) {
                System.out.println("Room " + room.getRoomNumber());
            }
        }
    }

    public void reserveRoom(int roomNumber) {
        if (roomNumber < 1 || roomNumber > rooms.length) {
            System.out.println("Invalid room number!");
            return;
        }

        Room room = rooms[roomNumber - 1];
        if (room.isReserved()) {
            System.out.println("Room " + roomNumber + " is already reserved.");
        } else {
            room.reserveRoom();
            System.out.println("Room " + roomNumber + " has been reserved.");
        }
    }
    public void cancelReservation(int roomNumber) {
        if (roomNumber < 1 || roomNumber > rooms.length) {
            System.out.println("Invalid room number!");
            return;
        }

        Room room = rooms[roomNumber - 1];
        if (room.isReserved()) {
            room.cancelReservation();
            System.out.println("Reservation for Room " + roomNumber + " has been canceled.");
        } else {
            System.out.println("Room " + roomNumber + " is not reserved.");
        }
    }
}
