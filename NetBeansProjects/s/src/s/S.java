
package s;

import java.util.Scanner;


public class S {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x,y;
        double avg;
        System.out.println("Enter first number");
        x=in.nextInt();
        System.out.println("Enter second number");
        y=in.nextInt();
        avg=(x+y)/2.0;
        System.out.println("The result is "+avg);
    }
    
}
