package DAY2;

import java.util.Scanner;

public class printfibbotilln {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fib1 = 0;
        int fib2 = 1;
        System.out.println(fib1+"\n"+fib2);
        for (int i = 2; i<n;i++){
            
            int fibn = fib1+fib2;
            System.out.println(fibn);
            fib1=fib2;
            fib2=fibn;
        }

        sc.close();

    }
    
}
