package DAY3;

import java.util.Scanner;

public class rotateanum {
    public static void main(String[] args) {
        //take input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        //find number of digits
        int temp = n;
        int nod=0;
        while(temp>0){
            temp=temp/10;
            nod++;            
        }
        //check fo negative or more than number of digits
        r=r%nod;
        if(r<0){
            r=r+nod;
        }
        //rotation
        int div=1;
        int mul=1;
        for (int i = 1; i <= nod; i++) {
            if(i<=r){
                div=div*10;
            }
            else
                mul=mul*10;
        }
        int q= n/div;
        int rem= n%div;
        int ans = rem*mul + q;
        System.out.println(ans);
        sc.close();
    }
    
}
