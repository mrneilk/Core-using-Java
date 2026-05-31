package DAY3;

import java.util.Scanner;

public class pythatriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max;
        if(a>b){
            if(a>c){
                max=a;
                if((max*max)==(b*b)+(c*c)){
                    System.out.println("Pythagorean Triplet");
                }
                else
                    System.out.println("Not Pythagorean Triplet");
            }
            else{
                max=c;
                if((max*max)==(b*b)+(a*a)){
                    System.out.println("Pythagorean Triplet");
                }
                else
                    System.out.println("Not Pythagorean Triplet");
            }
        }
        else{
            if(b>c){
                max=b;
                if((max*max)==(a*a)+(c*c)){
                    System.out.println("Pythagorean Triplet");
                }
                else
                    System.out.println("Not Pythagorean Triplet");
            }
            else{
                max=c;
                if((max*max)==(a*a)+(b*b)){
                    System.out.println("Pythagorean Triplet");
                }
                else
                    System.out.println("Not Pythagorean Triplet");
            }
        }
        

        sc.close();
        
    }
}
