import java.util.Scanner;

public class Recursion_P1 {

    // Question-->1.find fibonacci number of nth term
    static int printFibonacci(int n)
    {
        //base case
        if(n==0 || n==1){
            return n;
        }
        return printFibonacci(n-1)+printFibonacci(n-2);
        // //recursiv work
        // int prev = printFibonacci(n-1);
        // int prevPrev = printFibonacci(n-2);

        // //self work
        // return prev+prevPrev;
    }

    //Question-->2.find factorial of nth term
    static int printFactorial(int n)
    {
        //base case
        if(n==0) {
          return 1;
        }
        int fact = printFactorial(n-1); //factorial of (n-1)
        return n*fact;  //factorial of n
    }

    //Question-->3.print natural number from n to 1
    static void printDecreasing(int n)
    {
        //base case
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);  //self work
        printDecreasing(n-1);   //recursiv work
        //print--> n,n-1,.....,4,3,2,1
    }

    //Question-->4.print natural number from 1 to n
    static void printIncreasing(int n)
    {
        //base case
        if(n==1){
            System.out.println(n);
            return;
        }
        printIncreasing(n-1);  //recursiv work
        System.out.println(n); //self work
        //print--> 1,2,3,4,......,n-1,n
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n : ");
        int n=sc.nextInt();

        //printIncreasing(n);

        //printDecreasing(n);

        //System.out.println(printFactorial(n));

        //System.out.println(printFibonacci(n));
        for(int i=0; i<=n; i++){
            System.out.println(printFibonacci(i));
        }
        
    }
}
