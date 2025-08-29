package Basics;

import java.util.Scanner;

public class countno {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int countdigit=0;
        while(n!=0){
            n=n/10;
            countdigit++;
        }
        System.out.println(countdigit);
    }
}
