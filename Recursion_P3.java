import java.util.Scanner;

public class Recursion_P3 {

    //sum of natural numbers till n with alternate signs
    static int printSum(int n)
    {
        //base case
        if(n==0) return 0;
        if(n%2!=0){
            return printSum(n-1)+n;
        }else{
            return printSum(n-1)-n;
        }
        
    }
    //print k multiples of n
    static void printmultiples(int n,int k)
    {
        //base case
        if(k==1){
            System.out.println(n);
            return;
        }
        printmultiples(n, k-1);
        System.out.println(n*k);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter numbers n & k : ");
        //int n=scn.nextInt();
        //int k=scn.nextInt();
        //printmultiples(n, k);
        System.out.println(printSum(10));
    }
    
}
