package com.example.assignmentqns4;

import java.util.Scanner;

public class AssignmentQns4 {
    public static int calculatePrice(int NumberOfIpads){
        int PriceOfIpads= NumberOfIpads*1000;
        return PriceOfIpads;

    }
    public static void main(String[] args) {
        System.out.println("Number of Ipads : ");
        Scanner keyboard = new Scanner(System.in);
        int NumberOfIpads = keyboard.nextInt();
        //to indicate that the number that is input is the NumberOfIpads//
        System.out.println("Cost of total Ipads = " + calculatePrice(NumberOfIpads));



    }
}
