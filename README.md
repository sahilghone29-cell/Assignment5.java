# Hotel Room Booking System

## Project Overview

**Hotel Room Booking System** is a Java-based console application that allows users to manage hotel room bookings.

The program provides options to book a room, display room details, calculate the total bill, check room availability, cancel a booking, and display the total number of bookings.

The project demonstrates important Object-Oriented Programming concepts in Java, including classes, objects, constructors, encapsulation, getters, setters, instance methods, and static members.

## Student Details

| Detail                   | Information               |
| ------------------------ | ------------------------- |
| **Student Name**         | Sahil Ghone               |
| **Roll No.**             | 150096725002              |
| **Cohort**               | Demis Hassbais            |
| **Project Name**         | Hotel Room Booking System |
| **Programming Language** | Java                      |

## Features

The program provides the following features:

* Book a hotel room.
* Display room details.
* Calculate the total booking bill.
* Check room booking status.
* Cancel an existing booking.
* Display the total number of bookings.
* Validate room numbers.
* Validate the number of booking days.
* Menu-driven interface.

## Available Rooms

The system contains three rooms:

| Room Number | Room Type | Price Per Day |
| ----------- | --------- | ------------: |
| 101         | Standard  |      Rs. 2000 |
| 205         | Deluxe    |      Rs. 3500 |
| 301         | Premium   |      Rs. 5000 |

These three `Room` objects are created in the `Hotel` class.

## Menu Options

```text id="p3l3tq"
===== Hotel Room Booking System =====

1. Book Room
2. Display Room Details
3. Calculate Bill
4. Check Room Status
5. Cancel Booking
6. Display Total Bookings
7. Exit
```

The application provides seven menu options for managing hotel room bookings.

## Concepts Used

* Classes and Objects
* Encapsulation
* Private Data Members
* Constructors
* Getters and Setters
* Instance Methods
* Static Variable
* Static Method
* `Scanner` Class
* `if-else` Statements
* `switch-case`
* `while` Loop
* Input Validation
* Console Input and Output

## Room Class

The `Room` class contains private data members such as:

```java id="5o9r4g"
private int roomNumber;
private String roomType;
private String customerName;
private int numberOfDays;
private double pricePerDay;
private boolean bookingStatus;
```

These private variables demonstrate **encapsulation**.

## Constructor

A parameterized constructor is used to initialize the room number, room type, and price per day.

```java id="v7z0cy"
public Room(int roomNumber, String roomType, double pricePerDay)
```

The booking status is initially set to false, meaning the room is available.

## Getters and Setters

Getter and setter methods are used to access and modify the private data members of the `Room` class.

Examples include:

```java id="3ec2as"
getRoomNumber()
getRoomType()
getCustomerName()
getNumberOfDays()
getPricePerDay()
getBookingStatus()
```

and corresponding setter methods.

## Booking a Room

The `bookRoom()` method stores the customer name and number of days, changes the booking status to booked, and calculates the total bill.

The program also prevents a room from being booked if it is already booked.

## Bill Calculation

The total bill is calculated using:

```java id="8y2p3b"
return numberOfDays * pricePerDay;
```

This calculates the total cost based on the number of booked days and the room's price per day.

## Booking Cancellation

The `cancelBooking()` method cancels an existing booking and resets the customer name, number of days, and booking status.

## Static Variable

The program uses a static variable to keep track of the total number of bookings:

```java id="x1g0ph"
private static int totalBookings = 0;
```

Every successful booking increases this counter. A static method is used to retrieve the total booking count.

## Input Validation

The program validates the entered room number and checks that the number of booking days is greater than zero.

## Sample Output

```text id="8m5zbf"
===== Hotel Room Booking System =====

1. Book Room
2. Display Room Details
3. Calculate Bill
4. Check Room Status
5. Cancel Booking
6. Display Total Bookings
7. Exit

Enter your choice: 1

Available Rooms:
101 - Standard - Rs.2000 per day
205 - Deluxe - Rs.3500 per day
301 - Premium - Rs.5000 per day

Enter Room Number: 101
Enter Customer Name: Sahil
Enter Number of Days: 3

===== Booking Confirmation =====
Room Number   : 101
Room Type     : Standard
Customer Name : Sahil
Number of Days: 3
Price Per Day : Rs.2000.0

Total Bill    : Rs.6000.0

Room booked successfully.
```

## Project Structure

```text id="v5kq8h"
Hotel/
│
├── Hotel.java
├── Hotel.class
├── Room.class
└── README.md
```

## How to Run the Program

### Step 1: Compile the Java File

```bash id="l1t1qf"
javac Hotel.java
```

### Step 2: Run the Program

```bash id="9d8n7h"
java Hotel
```

### Step 3: Select an Option

Enter a number from **1 to 7** according to the required operation.

## Learning Objectives

The main objectives of this project are:

1. To understand classes and objects in Java.
2. To implement encapsulation using private data members.
3. To use constructors for object initialization.
4. To implement getters and setters.
5. To understand instance methods.
6. To understand static variables and static methods.
7. To implement a menu-driven program using `switch-case`.
8. To perform input validation.
9. To calculate a hotel booking bill.
10. To apply Object-Oriented Programming concepts to a real-world problem.

## Screenshots

### Program Output

<img width="652" height="191" alt="Screenshot 2026-09-03 at 3 14 36 PM" src="https://github.com/user-attachments/assets/b23acf67-0ef1-4b3c-88f1-24dd6adb683f" />
<img width="652" height="185" alt="Screenshot 2026-09-03 at 3 14 10 PM" src="https://github.com/user-attachments/assets/63a75226-694e-44da-9e1b-501834363aa8" />
<img width="652" height="185" alt="Screenshot 2026-09-03 at 3 14 00 PM" src="https://github.com/user-attachments/assets/ad489027-8647-472f-b402-6244d28d570f" />
<img width="652" height="166" alt="Screenshot 2026-09-03 at 3 13 18 PM" src="https://github.com/user-attachments/assets/cfe3737c-5f2c-447f-af76-6a29014fc701" />
<img width="652" height="182" alt="Screenshot 2026-09-03 at 3 12 50 PM" src="https://github.com/user-attachments/assets/fee3636f-6587-43c3-8acb-6adb1bbadabe" />
<img width="652" height="270" alt="Screenshot 2026-09-03 at 3 12 26 PM" src="https://github.com/user-attachments/assets/93f400c1-6ddd-4039-8883-b517a7e94b95" />
<img width="652" height="406" alt="Screenshot 2026-09-03 at 3 11 53 PM" src="https://github.com/user-attachments/assets/c25c924d-f058-4ea8-a9c4-9fc1e0df29bb" />


## Author

**Sahil Ghone**
**Roll No.:** 150096725002
**Cohort:** Demis Hassbais

---

**Hotel Room Booking System — Java Assignment**
