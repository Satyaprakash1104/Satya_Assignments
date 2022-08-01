package com.loopAssignements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NotesGivenAmount {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        int Rs[] ={2000 , 500 ,200 ,100 , 50 , 20 ,10 ,5 ,2 ,1};

        System.out.println("Enter the amount : ");
        int amount=Integer.parseInt(br.readLine());


        // create copy of the amount
        int copy=amount;
        int totalNotes=0,count=0;

        System.out.println("\nRs OMINATIONS : \n");

        // check for notes.
        for(int i=0;i<9;i++)
        {
            // count number of notes.
            count=amount/Rs[i];
            if(count!=0)
            {
                System.out.println(Rs[i]+"\tx\t"+count+"\t= "+Rs[i]*count);
            }
            totalNotes=totalNotes+count; //finding the total number of notes
            amount=amount%Rs[i]; //finding the remaining amount whose Rsomination is to be found
        }

        System.out.println("--------------------------------");

        // printing the total amount
        System.out.println("TOTAL\t\t\t= "+copy);
        System.out.println("--------------------------------");

        // printing the total number of notes
        System.out.println("Total Number of Notes\t= "+totalNotes);
    }
}
