// 1. Create an abstract class called Bird with an abstract method called fly().
//  Implement two subclasses called Eagle and Penguin that inherit from Bird. Override the fly() method in both subclasses, ensuring Eagle can fly while Penguin cannot. 
// Implement the Java code for this scenario.
// abstract class Bird {
//     abstract void fly();
// }

// class Eagle extends Bird {
//     @Override
//     void fly() {
//         System.out.println("Eagle flies high in the sky.");
//     }
// }

// class Penguin extends Bird {
//     @Override
//     void fly() {
//         System.out.println("Penguins cannot fly.");
//     }
// }

// public class TestBird {
//     public static void main(String[] args) {
//         Bird eagle = new Eagle();
//         Bird penguin = new Penguin();
//         eagle.fly();
//         penguin.fly();
//     }
// }

// 2. Create an abstract class called Shape with an abstract method called calculateArea(). 
// Implement two subclasses called Rectangle and Circle that inherit from Shape. Override the calculateArea() method in both subclasses to calculate and return the area of a rectangle and a circle, respectively.
//  Write the Java code to implement this scenario with Scanner Input.
// import java.util.Scanner;

// abstract class Shape {
//     abstract double calculateArea();
// }

// class Rectangle extends Shape {
//     double length, width;

//     Rectangle(double l, double w) {
//         length = l;
//         width = w;
//     }

//     @Override
//     double calculateArea() {
//         return length * width;
//     }
// }

// class Circle extends Shape {
//     double radius;

//     Circle(double r) {
//         radius = r;
//     }

//     @Override
//     double calculateArea() {
//         return Math.PI * radius * radius;
//     }
// }

// public class TestShape {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter length and width of Rectangle: ");
//         double l = sc.nextDouble();
//         double w = sc.nextDouble();
//         Shape rectangle = new Rectangle(l, w);
//         System.out.println("Rectangle Area: " + rectangle.calculateArea());

//         System.out.print("Enter radius of Circle: ");
//         double r = sc.nextDouble();
//         Shape circle = new Circle(r);
//         System.out.println("Circle Area: " + circle.calculateArea());

//         sc.close();
//     }
// }

// 3. Create an abstract class called Vehicle with abstract methods startEngine() and stopEngine(). Implement two subclasses called Car and Motorcycle that inherit from Vehicle. Implement the startEngine() and stopEngine() methods in both subclasses to start and stop the engines of a car and a motorcycle, respectively. 
// abstract class Vehicle {
//     abstract void startEngine();
//     abstract void stopEngine();
// }

// class Car extends Vehicle {
//     public void startEngine() {
//         System.out.println("Car engine started.");
//     }
//     public void stopEngine() {
//         System.out.println("Car engine stopped.");
//     }
// }

// class Motorcycle extends Vehicle {
//     public void startEngine() {
//         System.out.println("Motorcycle engine started.");
//     }
//     public void stopEngine() {
//         System.out.println("Motorcycle engine stopped.");
//     }
// }

// public class TestVehicle {
//     public static void main(String[] args) {
//         Vehicle car = new Car();
//         Vehicle bike = new Motorcycle();
//         car.startEngine();
//         car.stopEngine();
//         bike.startEngine();
//         bike.stopEngine();
//     }
// }

// 4. You are building a shape hierarchy for a drawing application. Design an abstract class named "Shape" with the following abstract methods:

// calculateArea(): This method should calculate and return the area of the shape.

// calculatePerimeter(): This method should calculate and return the perimeter of the shape.

// Implement the abstract class and provide concrete implementations for the abstract methods. 
// Create subclasses for different shapes such as "Circle," "Rectangle," and "Triangle." Each subclass should provide specific implementations for calculating the area and perimeter of that shape. 
// Create instances of each shape class and demonstrate how you can calculate their respective areas and perimeters.
// abstract class Shape {
//     abstract double calculateArea();
//     abstract double calculatePerimeter();
// }

// class Circle extends Shape {
//     double radius;

//     Circle(double r) {
//         radius = r;
//     }

//     public double calculateArea() {
//         return Math.PI * radius * radius;
//     }

//     public double calculatePerimeter() {
//         return 2 * Math.PI * radius;
//     }
// }

// class Rectangle extends Shape {
//     double length, width;

//     Rectangle(double l, double w) {
//         length = l;
//         width = w;
//     }

//     public double calculateArea() {
//         return length * width;
//     }

//     public double calculatePerimeter() {
//         return 2 * (length + width);
//     }
// }

// class Triangle extends Shape {
//     double a, b, c;

//     Triangle(double a, double b, double c) {
//         this.a = a;
//         this.b = b;
//         this.c = c;
//     }

//     public double calculateArea() {
//         double s = (a + b + c) / 2;
//         return Math.sqrt(s * (s - a) * (s - b) * (s - c));
//     }

//     public double calculatePerimeter() {
//         return a + b + c;
//     }
// }

// public class TestShape2 {
//     public static void main(String[] args) {
//         Shape circle = new Circle(7);
//         Shape rect = new Rectangle(10, 5);
//         Shape triangle = new Triangle(3, 4, 5);

//         System.out.println("Circle - Area: " + circle.calculateArea() + ", Perimeter: " + circle.calculatePerimeter());
//         System.out.println("Rectangle - Area: " + rect.calculateArea() + ", Perimeter: " + rect.calculatePerimeter());
//         System.out.println("Triangle - Area: " + triangle.calculateArea() + ", Perimeter: " + triangle.calculatePerimeter());
//     }
// }

// 5. You are building a shape hierarchy for a drawing application. Design an abstract class named "Draw" with the following abstract methods:

// calculateVolume(): This method should calculate and return the area of the shape

// calculateArea(): This method should calculate and return the area of the shape.

// calculatePerimeter(): This method should calculate and return the perimeter of the shape.

// Implement the abstract class and provide concrete implementations for the abstract methods.
//  Create subclasses for different shapes such as "Cube," "Cuboid," and "Cylinder." 
// Each subclass should provide specific implementations for calculating the volume, area and perimeter of that shape. 
// Create instances of each shape class and demonstrate how you can calculate their respective volume, areas and perimeters.
//  abstract class Draw {
//     abstract double calculateVolume();
//     abstract double calculateArea();
//     abstract double calculatePerimeter();
// }

// class Cube extends Draw {
//     double side;

//     Cube(double s) {
//         side = s;
//     }

//     public double calculateVolume() {
//         return side * side * side;
//     }

//     public double calculateArea() {
//         return 6 * side * side;
//     }

//     public double calculatePerimeter() {
//         return 12 * side;
//     }
// }

// class Cuboid extends Draw {
//     double l, b, h;

//     Cuboid(double l, double b, double h) {
//         this.l = l;
//         this.b = b;
//         this.h = h;
//     }

//     public double calculateVolume() {
//         return l * b * h;
//     }

//     public double calculateArea() {
//         return 2 * (l * b + b * h + h * l);
//     }

//     public double calculatePerimeter() {
//         return 4 * (l + b + h);
//     }
// }

// class Cylinder extends Draw {
//     double r, h;

//     Cylinder(double r, double h) {
//         this.r = r;
//         this.h = h;
//     }

//     public double calculateVolume() {
//         return Math.PI * r * r * h;
//     }

//     public double calculateArea() {
//         return 2 * Math.PI * r * (r + h);
//     }

//     public double calculatePerimeter() {
//         return 2 * Math.PI * r; // Circumference
//     }
// }

// public class TestDraw {
//     public static void main(String[] args) {
//         Draw cube = new Cube(4);
//         Draw cuboid = new Cuboid(2, 3, 4);
//         Draw cylinder = new Cylinder(5, 7);

//         System.out.println("Cube: Volume = " + cube.calculateVolume() + ", Area = " + cube.calculateArea() + ", Perimeter = " + cube.calculatePerimeter());
//         System.out.println("Cuboid: Volume = " + cuboid.calculateVolume() + ", Area = " + cuboid.calculateArea() + ", Perimeter = " + cuboid.calculatePerimeter());
//         System.out.println("Cylinder: Volume = " + cylinder.calculateVolume() + ", Area = " + cylinder.calculateArea() + ", Perimeter = " + cylinder.calculatePerimeter());
//     }
// }

// 6. You are developing a media player application. There is a base class called MediaPlayer, which has methods like play(), pause(), and stop().
//  The VideoPlayer class inherits from MediaPlayer and adds methods like rewind() and fastForward(). Additionally, there is an interface called Playlist, which defines methods like addSong() and removeSong(). 
// The VideoPlayer class implements the Playlist interface.
//  Implement the classes and demonstrate inheritance with interface by creating objects of the VideoPlayer class and calling its methods as well as the interface methods.
// interface Playlist {
//     void addSong(String song);
//     void removeSong(String song);
// }

// class MediaPlayer {
//     public void play() {
//         System.out.println("Playing media...");
//     }

//     public void pause() {
//         System.out.println("Media paused.");
//     }

//     public void stop() {
//         System.out.println("Media stopped.");
//     }
// }

// class VideoPlayer extends MediaPlayer implements Playlist {
//     public void rewind() {
//         System.out.println("Video rewinded .");
//     }

//     public void fastForward() {
//         System.out.println("Video fast-forwarded.");
//     }

//     public void addSong(String song) {
//         System.out.println("Added: " + song);
//     }

//     public void removeSong(String song) {
//         System.out.println("Removed: " + song);
//     }
// }

// public class TestMedia {
//     public static void main(String[] args) {
//         VideoPlayer player = new VideoPlayer();
//         player.play();
//         player.pause();
//         player.rewind();
//         player.fastForward();
//         player.addSong("Song 1");
//         player.removeSong("Song 1");
//     }
// }

// 7. You are developing a restaurant management system that handles different types of employees, such as chefs and waiters. Design an interface named "Employee" with the following methods:

// work(): This method should define the work responsibilities of the employee.

// getSalary(): This method should return the salary of the employee.
// interface Employee {
//     void work();
//     double getSalary();
// }

// class Chef implements Employee {
//     public void work() {
//         System.out.println("Chef cooks food.");
//     }

//     public double getSalary() {
//         return 30000.0;
//     }
// }

// class Waiter implements Employee {
//     public void work() {
//         System.out.println("Waiter serves customers.");
//     }

//     public double getSalary() {
//         return 20000.0;
//     }
// }

// public class TestEmployee {
//     public static void main(String[] args) {
//         Employee chef = new Chef();
//         Employee waiter = new Waiter();
//         chef.work();
//         System.out.println("Chef Salary: " + chef.getSalary());
//         waiter.work();
//         System.out.println("Waiter Salary: " + waiter.getSalary());
//     }
// }

// 8. You are building a library management system. Design an interface named "LibraryItem" with the following methods:

// String getTitle() to retrieve the title of the library item

// String getAuthor() to retrieve the author of the library item

// int getYear() to retrieve the publication year of the library item

// boolean isAvailable() to check if the library item is currently available for borrowing.
// interface LibraryItem {
//     String getTitle();
//     String getAuthor();
//     int getYear();
//     boolean isAvailable();
// }

// class Book implements LibraryItem {
//     private String title, author;
//     private int year;
//     private boolean available;

//     public Book(String title, String author, int year, boolean available) {
//         this.title = title;
//         this.author = author;
//         this.year = year;
//         this.available = available;
//     }

//     public String getTitle() {
//         return title;
//     }

//     public String getAuthor() {
//         return author;
//     }

//     public int getYear() {
//         return year;
//     }

//     public boolean isAvailable() {
//         return available;
//     }
// }

// public class TestLibrary {
//     public static void main(String[] args) {
//         LibraryItem book = new Book("Java Programming", "James Gosling", 1995, true);
//         System.out.println("Title: " + book.getTitle());
//         System.out.println("Author: " + book.getAuthor());
//         System.out.println("Year: " + book.getYear());
//         System.out.println("Available: " + book.isAvailable());
//     }
// }
