import java.util.Scanner;

/**
 * Assignment2
 */

public class Assignment2 {
    
/* method: fib
* parameters: an integer
* return: and integer
method to recursivley generate a Fibonacci sequence */

static int fib(int n)
        {
        
        if (n <= 1)
            return (n);

        return fib(n - 1) + fib(n - 2);
        }




    public static void main(String[] args) {
       
        // creates scanner
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter the number.");
        int n = sc.nextInt();

        // uses the fibonacci method to print the nth number
        System.out.println("The " + n + " fibonacci number is - " + fib(n));

    }
}