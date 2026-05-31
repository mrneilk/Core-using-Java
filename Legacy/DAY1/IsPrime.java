package DAY1;

import java.util.Scanner;

public class IsPrime {
    public static void checkprime(int n){
        int count=0;
        for(int i=n;i>0;i--){
            if(n%i==0){
                count=count+1;
            }
        }
        if(count>2){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number t:");
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.print("Enter a Number n:");
            int n = sc.nextInt();
            checkprime(n);
        }
        sc.close();
    }
}
