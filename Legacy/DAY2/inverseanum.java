package DAY2;

import java.util.Scanner;
import java.lang.Math;

public class inverseanum {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
   
        int inverted=0;
        int power = 1;
        

        while(n>0){
            int digit=n%10;
            n=n/10;
            inverted+=power*Math.pow(10, digit-1);
            power++;
        }
        System.out.println(inverted);
         sc.close();
    }
}
