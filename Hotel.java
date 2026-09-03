import java.util.Scanner;

class Room {

    // Private data members
    private int roomNumber;
    private String roomType;
    private String customerName;
    private int numberOfDays;
    private double pricePerDay;
    private boolean bookingStatus;

    // Static variable to count total bookings
    private static int totalBookings = 0;

    // Parameterized constructor
    public Room(int roomNumber, String roomType, double pricePerDay) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerDay = pricePerDay;
        this.customerName = "";
        this.numberOfDays = 0;
        this.bookingStatus = false;
    }

    // Getters
    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public boolean getBookingStatus() {
        return bookingStatus;
    }

    // Setters
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public void setBookingStatus(boolean bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    // Method to book room
    public void bookRoom(String customerName, int numberOfDays) {

        if (bookingStatus) {
            System.out.println("Room is already booked.");
        } else {
            this.customerName = customerName;
            this.numberOfDays = numberOfDays;
            this.bookingStatus = true;

            totalBookings++;

            System.out.println("\n===== Booking Confirmation =====");
            System.out.println("Room Number   : " + roomNumber);
            System.out.println("Room Type     : " + roomType);
            System.out.println("Customer Name : " + customerName);
            System.out.println("Number of Days: " + numberOfDays);
            System.out.println("Price Per Day : Rs." + pricePerDay);
            System.out.println();
            System.out.println("Total Bill    : Rs." + calculateBill());
            System.out.println();
            System.out.println("Room booked successfully.");
        }
    }

    // Method to display room details
    public void displayRoomDetails() {

        System.out.println("\n===== Room Details =====");
        System.out.println("Room Number   : " + roomNumber);
        System.out.println("Room Type     : " + roomType);

        if (bookingStatus) {
            System.out.println("Customer Name : " + customerName);
            System.out.println("Number of Days: " + numberOfDays);
            System.out.println("Price Per Day : Rs." + pricePerDay);
            System.out.println("Booking Status: Booked");
        } else {
            System.out.println("Customer Name : Not Booked");
            System.out.println("Number of Days: 0");
            System.out.println("Price Per Day : Rs." + pricePerDay);
            System.out.println("Booking Status: Available");
        }
    }

    // Method to calculate bill
    public double calculateBill() {
        return numberOfDays * pricePerDay;
    }

    // Method to cancel booking
    public void cancelBooking() {

        if (bookingStatus) {
            customerName = "";
            numberOfDays = 0;
            bookingStatus = false;

            System.out.println("\nBooking cancelled successfully.");
        } else {
            System.out.println("\nRoom is not booked.");
        }
    }

    // Static method to get total bookings
    public static int getTotalBookings() {
        return totalBookings;
    }
}

public class Hotel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating Room objects
        Room room1 = new Room(101, "Standard", 2000);
        Room room2 = new Room(205, "Deluxe", 3500);
        Room room3 = new Room(301, "Premium", 5000);

        while (true) {

            System.out.println("\n===== Hotel Room Booking System =====");
            System.out.println("1. Book Room");
            System.out.println("2. Display Room Details");
            System.out.println("3. Calculate Bill");
            System.out.println("4. Check Room Status");
            System.out.println("5. Cancel Booking");
            System.out.println("6. Display Total Bookings");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("\nAvailable Rooms:");
                    System.out.println("101 - Standard - Rs.2000 per day");
                    System.out.println("205 - Deluxe - Rs.3500 per day");
                    System.out.println("301 - Premium - Rs.5000 per day");

                    System.out.print("Enter Room Number: ");
                    int roomNumber = sc.nextInt();
                    sc.nextLine();

                    Room selectedRoom = null;

                    if (roomNumber == 101) {
                        selectedRoom = room1;
                    } else if (roomNumber == 205) {
                        selectedRoom = room2;
                    } else if (roomNumber == 301) {
                        selectedRoom = room3;
                    } else {
                        System.out.println("Invalid room number.");
                        break;
                    }

                    if (selectedRoom.getBookingStatus()) {
                        System.out.println("Room is already booked.");
                        break;
                    }

                    System.out.print("Enter Customer Name: ");
                    String customerName = sc.nextLine();

                    System.out.print("Enter Number of Days: ");
                    int days = sc.nextInt();

                    if (days <= 0) {
                        System.out.println("Number of days must be greater than 0.");
                        break;
                    }

                    selectedRoom.bookRoom(customerName, days);
                    break;

                case 2:

                    System.out.print("Enter Room Number: ");
                    roomNumber = sc.nextInt();

                    if (roomNumber == 101) {
                        room1.displayRoomDetails();
                    } else if (roomNumber == 205) {
                        room2.displayRoomDetails();
                    } else if (roomNumber == 301) {
                        room3.displayRoomDetails();
                    } else {
                        System.out.println("Invalid room number.");
                    }

                    break;

                case 3:

                    System.out.print("Enter Room Number: ");
                    roomNumber = sc.nextInt();

                    if (roomNumber == 101) {

                        if (room1.getBookingStatus()) {
                            System.out.println("\nTotal Bill: Rs."
                                    + room1.calculateBill());
                        } else {
                            System.out.println("Room is not booked.");
                        }

                    } else if (roomNumber == 205) {

                        if (room2.getBookingStatus()) {
                            System.out.println("\nTotal Bill: Rs."
                                    + room2.calculateBill());
                        } else {
                            System.out.println("Room is not booked.");
                        }

                    } else if (roomNumber == 301) {

                        if (room3.getBookingStatus()) {
                            System.out.println("\nTotal Bill: Rs."
                                    + room3.calculateBill());
                        } else {
                            System.out.println("Room is not booked.");
                        }

                    } else {
                        System.out.println("Invalid room number.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Room Number: ");
                    roomNumber = sc.nextInt();

                    if (roomNumber == 101) {

                        if (room1.getBookingStatus()) {
                            System.out.println("Room 101 Status: Booked");
                        } else {
                            System.out.println("Room 101 Status: Available");
                        }

                    } else if (roomNumber == 205) {

                        if (room2.getBookingStatus()) {
                            System.out.println("Room 205 Status: Booked");
                        } else {
                            System.out.println("Room 205 Status: Available");
                        }

                    } else if (roomNumber == 301) {

                        if (room3.getBookingStatus()) {
                            System.out.println("Room 301 Status: Booked");
                        } else {
                            System.out.println("Room 301 Status: Available");
                        }

                    } else {
                        System.out.println("Invalid room number.");
                    }

                    break;

                case 5:

                    System.out.print("Enter Room Number: ");
                    roomNumber = sc.nextInt();

                    if (roomNumber == 101) {
                        room1.cancelBooking();
                    } else if (roomNumber == 205) {
                        room2.cancelBooking();
                    } else if (roomNumber == 301) {
                        room3.cancelBooking();
                    } else {
                        System.out.println("Invalid room number.");
                    }

                    break;

                case 6:

                    System.out.println("\n===== Booking Information =====");
                    System.out.println("Total Bookings: "
                            + Room.getTotalBookings());

                    break;

                case 7:

                    System.out.println(
                            "\nThank you for using Hotel Room Booking System.");
                    System.out.println("Program exited successfully.");

                    sc.close();
                    return;

                default:

                    System.out.println(
                            "Invalid choice! Please select 1 to 7.");
            }
        }
    }
}