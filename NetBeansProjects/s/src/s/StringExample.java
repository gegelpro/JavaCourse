/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s;

import java.util.Scanner;

/**
 *
 * @author Gal
 */
public class StringExample {
    public static void main(String[] args) {
    
    String str; // ="asdf";
    char str1;
    char ch = 'G';
    Scanner sc=new Scanner(System.in);
    str = sc.next();
    char ch1[] = str.toCharArray();
    int  str1_value = ch1[2];
    System.out.println("ascii of 3nd char: " + str1_value);
//    if (str1.isEmpty() or str1.){
//        System.out.println("ERROR");
//    }
    
    
    
    }
}
