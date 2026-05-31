package DAY3;

import java.util.Scanner;

public class benjaminbulbs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();    // number of bulbs
        // only perfect square numbered bulbs would be left on after nth toggling
        //print all perfect squares

        for (int i = 1; i*i <= n; i++) {
            System.out.print(i*i+" ");
            
        }
        sc.close();
    }
}
