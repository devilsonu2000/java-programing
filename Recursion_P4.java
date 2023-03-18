import java.util.Scanner;

public class Recursion_P4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter numbers x & y : ");
        int x =scn.nextInt();
        int y =scn.nextInt();

        System.out.println(gcd(x, y));
        System.out.println(iGCD(x, y));
        System.out.println(LCM(x, y));
    }
    static int gcd(int x, int y){
        if(y==0){
            return x;
        }
        return gcd(y,x%y);
    } 
    static int iGCD(int x, int y){
        while(x%y!=0){
            int rem = x%y;
            y=x;
            x=rem;
        }
        return y;
    } 

    static int LCM(int x, int y){ 
        return (x*y)/gcd(y, x%y);
    }
}
