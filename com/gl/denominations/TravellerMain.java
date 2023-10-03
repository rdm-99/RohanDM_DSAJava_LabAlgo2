package com.gl.denominations;
import java.util.*;

public class TravellerMain {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size of currency denominations");
        int size=sc.nextInt();

        int[] currency =new int[size];
        System.out.println("enter the currency denominations value");
        for (int i = 0; i < currency.length; i++) {
            currency[i]=sc.nextInt();
        }

        MergeSort ms=new MergeSort();
        ms.sort(currency, 0, size-1);

        System.out.println("enter the amount you want to pay");
        int amount=sc.nextInt();

        System.out.println("Your payment approach in order to give min no of notes will be");
        NoteCounter nc=new NoteCounter();
        nc.counting(currency,amount);

    }
}
