import java.util.Scanner;
public class Chapter3 {
    // Declare the Chapter 3 Milestone 1 method here
    public void chapter3milestone1(Scanner scanner,int first, int second) {  
        for(int i=first; i<=second; i++){
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
            if( i % first == 0 && i != first){
                break;
            }
        } 
    }

    
    // Declare the Chapter 3 Milestone 2 method here, get a Scanner object as a parameter

    public void chapter3milestone2(Scanner scanner) {

    double average = 0;
    int counter = 0;
    int sum =0;
    int number = 0;
    System.out.print("\n Enter a Series of Number then enter a negitive to stop.: ");
    number = scanner.nextInt();
        while(number>=0)
        {
            counter++;
            sum+=number;

            number = scanner.nextInt();
    
        }
        
        average = (double)sum/counter;
        
        System.out.printf("this is the average: %.2f",average);
    }

        // Declare the Chapter 3 Milestone 3 method here
    public void milestone3(int num1, int num2, int answer) {
        if (num1 * num2 == answer)
            System.out.println("Correct!");
        else
            System.out.println("Incorrect, the answer was " + (num1 * num2));
    }
}
