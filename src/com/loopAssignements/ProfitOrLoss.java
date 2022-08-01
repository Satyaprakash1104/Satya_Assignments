package com.loopAssignements;

import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {

        double SellingPrice , CostPrice  , amount ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Selling Price : ");
        SellingPrice = input.nextDouble();
        System.out.println("Enter the Cost Price : ");
        CostPrice = input.nextDouble();

        if (SellingPrice > CostPrice){
            amount = SellingPrice - CostPrice ;
            System.out.println("The Profit is : "+amount);
        }
        else if (CostPrice > SellingPrice){
            amount = CostPrice -  SellingPrice ;

        }
        else{
            System.out.println("NO Profit and Loss");
        }
    }
}
