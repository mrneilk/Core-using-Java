package DAY2;

import java.util.Scanner;

public class primetilln {
    public static void checkprime(int n){
        int count=0;
        for(int i=n;i>0;i--){
            if(n%i==0){
                count=count+1;
            }
        }
        if(count>2){
            return;
        }
        else{
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int high = sc.nextInt();
    int low = sc.nextInt();
    for (int i=low; i <= high; i++)
    {
        checkprime(i);
    }
    sc.close();
}
}

