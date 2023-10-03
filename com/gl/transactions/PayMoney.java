package com.gl.transactions;
import java.util.*;

public class PayMoney {
    public static void main(String[] args) {

        int size;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of transaction array");
        size = sc.nextInt();

        System.out.println("enter the values of array");
        int[] trans = new int[size];
        for(int i = 0; i<trans.length; i++) {
            trans[i] = sc.nextInt();
        }

        System.out.println("enter the total no of targets that needs to be achieved");
        int targets = sc.nextInt();

        int sum,flag;
        for(int j = 1; j <= targets;j++) {
            System.out.println("enter the value of target");
            int indTargets = sc.nextInt();
            flag = sum = 0;

            for(int k = 0; k < trans.length; k++) {
                sum = sum + trans[k];
                if(sum >= indTargets) {
                    flag = 1;
                    System.out.println("Target achieved after "+ (k+1)+ " transactions");
                    System.out.println();
                    break;
                }
            }
            if(flag==0) {
                System.out.println("Given target is not achieved");
            }
        }
        sc.close();
    }

}
