/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingcosolereport;

/**
 *
 * @author Student
 */
public class GamingCosoleReport {

    public static void main(String[] args) {
        
        
        String [] cities  = { "Capetwon", " PortElizabeth", " Pretoria"};
        
        int [][] numberOfSales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };
        
        int [] totals = new int[cities.length];
        
        for(int row =0; row < cities.length; row++){
	    
	    int total = 0;
	    for (int col =0; col < 2; col++){
	        total = total + numberOfSales[row][col];
	    }
	    
	    totals[row] = total;
	}
        
        int highest = total[0];
	String highestcities = cities[0];
	
	for(int row = 1, row < totals.length; row++){
	    
	    if (total[row] > highest) {
	        highest = total[row];
	        highestcities = cities[row];
	    }
	}
        
        for ( int row = 0; row < cities.length; row++){
	    
	    System.out.println("\n" + cities[row]);
            System.out.println("total number of PS5: " + numberOfSales[row][0]);
            System.out.println("Motor number of XBOX: " + numberOfSales[row][1]);
            System.out.println("Motor number of  Switch: " + numberOfSales[row][2]);
            System.out.println("Total numberOfBooks: " + totals[row]);
        }
	    System.out.println("\nCity with the highest number of cosole: " + highestcities);
        System.out.println("Highest number of cosole: " + highest);

        
	}
}


    

