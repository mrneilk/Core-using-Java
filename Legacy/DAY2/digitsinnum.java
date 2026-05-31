package DAY2;

import java.util.Scanner;

public class digitsinnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        do{
            count++;
            n=n/10;
        }while(n%10!=0);
        System.out.println("digits="+count);
        sc.close();
    }
    
}
