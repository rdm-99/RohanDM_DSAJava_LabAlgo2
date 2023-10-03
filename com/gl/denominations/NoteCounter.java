package com.gl.denominations;
import java.util.*;

public class NoteCounter {
    public void counting(int[] currency, int amount) {
        int[] notes =new int[currency.length];
        int sumOfNotes=0;

        for (int i = 0; i < currency.length; i++) {
            notes[i] = amount / currency[i];
            sumOfNotes = sumOfNotes + notes[i];
            amount = amount % currency[i];
        }

        for (int i = 0; i < currency.length; i++) {
            if(notes[i]!=0){
                System.out.println(currency[i]+":"+notes[i]);
            }
        }

        //System.out.println("Total Number of Notes "+sumOfNotes);

    }
}
