import java.util.Scanner;

public class Recursion_P2 {

    //Question-->1.Find vale of P^q
    static int power(int p,int q)
    {
        //base case
        if(q==0) return 1;
        int pow = power(p, q/2);
        if(q%2==0){
            return pow*pow;
        }else{
            return p*pow*pow;
        }
        //return power(p, q-1)*p;
    }

    //Question-->2.Digits count of given number n
    static int digitCount(int n)
    {
        //base case
        if((n>0)&&(n<=9)) return 1;
        return digitCount(n/10)+1;
    }

    //Question-->3.Digits sum of given number n
    static int digitSum(int n)
    {
        //base case
        if((n/10)==0) return n;
        //recursiv work
        //int sum =digitSum(n/10);
        //self work
        return digitSum(n/10)+(n%10);
    }

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.print("Enter number n : ");
        //int n = sc.nextInt();
        //System.out.println(digitSum(n));
        //System.out.println(digitCount(n));
        System.out.println(power(3, 4));
    }
}
