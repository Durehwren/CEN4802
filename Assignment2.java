import java.util.Scanner;

/**
 * Assignment2
 */
public class Assignment2 {
static int fib(int n)
        {
        
        if (n <= 1)
            return (n);

        return fib(n - 1) + fib(n - 2);
        }




    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter the number.");
        int n = sc.nextInt();

        System.out.println("The " + n + " fibonacci number is - " + fib(n));

    }
}