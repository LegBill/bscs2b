/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloop;


public class Triangle6_Legaspi {

    public static void main(String[] args) {
        int rows = 5;
        for(int i =0;i<rows;i++) {
            System.out.format("%"+4*(rows-i+1)+"s","");
            for(int j=i+1; j>1; j--)
                System.out.format("%4d", j);
            for(int j=1; j<=i+1; j++)
                System.out.format("%4d", j);

            System.out.println();
        }
    }
}