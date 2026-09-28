/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.number1electronics;

/**
 *
 * @author Student
 */
public class Number1Electronics {

    public static void main(String[] args) {
       
        String[] city = {"Cape Town","Port Elizabeth","Pretoria"};
        String[] gamingConsole = {"PS5","XBOX","SWITCH"};
        int[][] sales = {
            {1000,2000,3000},
            {2000,3000,4000},
            {1500,1100,1200}
        };
        int[] total = new int[city.length];
        
         System.out.println("-----------------------------------------------------------------");
         System.out.println("GAMING CONSOLE REPORT");
         System.out.println("-----------------------------------------------------------------");
         System.out.printf("%-20s%-20s%-20s%n", "", "PS5","XBOX", "SWITCH" );
         //Using a for loop to print the gaming report in a table FORM
         for (int row = 0; row < city.length; row++) {
            System.out.printf("%-20s%-20d%-20d%n",
                    city[row], sales[row][0], sales[row][1]);
         }
        
        System.out.println("-----------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTAL FOE EACH CITY");
        System.out.println("-----------------------------------------------------------------");
        //Using nested for loops to display the gaming console totals for each city
        for(int row =0; row<city.length; row++) {
            int totalSales = 0;
            for(int col=0; col<gamingConsole.length; col++) {
                totalSales = totalSales + sales[row][col]; 
            }
            total[row] = totalSales;
            System.out.printf("%-16s%d%n", city[row], total[row]);
        }
        //A for loop and an if statement necessary for printing City with highest sales
        int highestIndex = 0;
        for (int i = 1; i < total.length; i++) {
            if (total[i] > total[highestIndex]) {
                highestIndex = i;
            }
        }
        System.out.println("CITY WITH THE MOST SALES: " + city[highestIndex]);
    }
}
