
package lesson2;

import java.util.Scanner;


public class prog3 {
    
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         int x,y;
      System.out.println("Enter number");
      x = in.nextInt();
      y = x*x;
      System.out.println("result is "+y);
    }
}


//
//package program5;
//import java.util.Scanner;
//public class Program5 {
//    
//    public static void main(String[] args) {
//        
//            
//                int n=0;
//                boolean flag;
//                
//    do
//    {
//      try
//      {
//                                Scanner sc = new Scanner(System.in);
//        System.out.println("Enter integer value only  ");
//        n=sc.nextInt();
//        flag=false;
//      }
//      catch(Exception e)
//      {
//        // accept integer only.
//        System.out.println("Enter only integer value.."+e);
//        flag=true;
//      }
//    }
//    while(flag);
//        
//        System.out.println("The Integer Value Entered is "+n);
//        
//    }
//}    