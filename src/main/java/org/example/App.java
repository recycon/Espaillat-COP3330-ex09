package org.example;
import java.util.Scanner;
import java.lang.System;
/**
 * 1 gallon =350 sqft
 * round up to the whole gallon no partial of a gallon
 * gallons of paint needed to paint the ceiling of a room
 * Prompt for the length and width
 *
 * You will need to purchase 2 gallons of paint to cover 360 square feet.
 */
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mario Espaillat
 */
public class App 
{
    public static void main( String[] args )
    {
        double x;
        double L,W;
        Scanner in=new Scanner(System.in);

        System.out.print( "What is the length of the ceiling? " );
        L=in.nextDouble();
        System.out.print( "What is the width of the ceiling? " );
        W=in.nextDouble();
        x=L*W;
        double g=x/350;
        x=Math.round(x);
        g=Math.round(g);
        if(g==0){
            g=1.0;
        }
        int newX=(int)x;
        int newG=(int)g;
        System.out.println("You will need to purchase "+newG  +" gallons of paint to cover "+ newX+" square feet.");
    }
}
