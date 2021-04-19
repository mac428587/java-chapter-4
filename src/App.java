import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class Chapter2 {
    void milestone1(int num) {
        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    
    // Declare the Chapter 2 Milestone 2 method here
     void chapter2milestone2(double input ){
        System.out.print("The integer value is this: ");
        System.out.println((int) input);   
        System.out.print("The remainder value is: ");
        System.out.println(String.format("%.0f", (input % (int) input) * 100));
    }
    
    // Declare the Chapter 2 Milestone 3 method here
    void chapter2milestone3(){
    int i = 0;
    int num = 0;
    String primeNumbers = "1 2 ";
    System.out.println("Prime numbers from 1 to 100 are :");
        for (i = 3; i <= 100; i++) {

         boolean isprime = true;
            for (num = i-1; num > 1; num--) {
             if (i % num == 0) {
                 isprime = false;
                 break;
             }           
         }    
         if (isprime) {
            primeNumbers += i + " ";
       } 
     
      }  System.out.println(primeNumbers); 
     }
    // Declare the Chapter 2 Milestone 4 method here
    void chapter2milestone4(Scanner scanner, int seconds){
    int days = seconds / (24 * 3600);
    seconds = seconds % (24 * 3600);
    int hours = seconds / 3600;
    seconds %= 3600;
    int minutes = seconds / 60;
    seconds %= 60;
    System.out.println(days + "dd " + hours + "hh, " + minutes + "mm " + seconds + "ss ");
    }
}

public class App {
    static void chapter1milestone1(double num1, double num2) {
        System.out.print("Largest is: ");
        if (num1 > num2)
            System.out.println(num1);
        else
            System.out.println(num2);
    }
    
    // Declare the Chapter 1 Milestone 2 method here
    static void chapter1milestone2(double number1, double number2, Scanner sc){	

		System.out.println("Average of two numbers is:" + (number1 + number2) / 2);
    }
    // Declare the Chapter 1 Milestone 3 method here
    static void chapter1milestone3(double radius,Scanner sc){

		double area = Math.PI * (radius * radius);
		System.out.println(String.format("The area of circle is: %.4f", area));

		double circumference = Math.PI * 2 * radius;
		System.out.println(String.format("The circumference of the circle is: %.4f", circumference));
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("** CHAPTER 1 MILESTONE 1 **");
        System.out.println("Please enter two numbers:");
        double num1_1a = scanner.nextDouble();
        double num1_1b = scanner.nextDouble();
        // Call the Chapter 1 Milestone 1 method here
        chapter1milestone1(num1_1a, num1_1b);

        System.out.println("\n** CHAPTER 1 MILESTONE 2 **");
        System.out.println("Please enter two numbers:");
        double num1_2a = scanner.nextDouble();
        double num1_2b = scanner.nextDouble();
        // Call the Chapter 1 Milestone 2 method here
        chapter1milestone2(num1_2a, num1_2b, scanner);
        System.out.println("\n** CHAPTER 1 MILESTONE 3 **");
        System.out.print("Enter a radius: ");
        double radius = scanner.nextDouble();
        // Call the Chapter 1 Milestone 3 method here
        chapter1milestone3(radius, scanner);
        System.out.println("\n** CHAPTER 2 MILESTONE 1 **");
        System.out.println("Enter a Number:");
        int num2_1 = scanner.nextInt();
        // Call the Chapter 2 Milestone 1 method here
        Chapter2 chapter2 = new Chapter2();
        chapter2.milestone1(num2_1);

        System.out.println("\n** CHAPTER 2 MILESTONE 2 **");
        System.out.println("Please input a decimal number:");
        double num2_2 = scanner.nextDouble();
        // Call the Chapter 2 Milestone 2 method here
        chapter2.chapter2milestone2(num2_2);
        System.out.println("\n** CHAPTER 2 MILESTONE 3 **");
        // Call the Chapter 2 Milestone 3 method here

        chapter2.chapter2milestone3();

        System.out.println("\n** CHAPTER 2 MILESTONE 4 **");
        System.out.println("Enter a number for seconds:");
        int seconds = scanner.nextInt();
        // Call the Chapter 2 Milestone 4 method here
        chapter2.chapter2milestone4(scanner,seconds);
        System.out.println("\n** CHAPTER 3 MILESTONE 1 **");
        System.out.println("Enter two numbers:");
        int num3_1a = scanner.nextInt();
        int num3_1b = scanner.nextInt();
        // Call the Chapter 3 Milestone 1 method here
        Chapter3 chapter3 = new Chapter3();
        chapter3.chapter3milestone1(scanner, num3_1a,num3_1b );

        System.out.println("\n** CHAPTER 3 MILESTONE 2 **");
        // Call the Chapter 3 Milestone 2 method here, pass the scanner object
        chapter3.chapter3milestone2(scanner);
        System.out.println("\n** CHAPTER 3 MILESTONE 3 **");
        int min = 1;
        int max = 12;
        int randNum1 = ThreadLocalRandom.current().nextInt(min, max + 1);
        int randNum2 = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.println(randNum1);
        System.out.println(randNum2);
        System.out.println("What is the product of these two numbers?");
        int num3_3 = scanner.nextInt();
        // Call the Chapter 3 Milestone 3 method here
        
        chapter3.milestone3(randNum1, randNum2, num3_3);

        scanner.close();
    }

    
}
