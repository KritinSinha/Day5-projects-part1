/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication37;

/**
 *
 * @author KIIT
 */
public class JavaApplication37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     int n[]={4,6,7,8,12};
     int i;
     int sum=0;
     float avg;
     for(i=0;i<=n.length-1;i++)
     {
         System.out.println(n[i]);
         
     }
     for(i=0;i<=n.length-1;i++)
     {
         sum+=n[i];
         System.out.println(sum);
               
     }
     for(i=0;i<=n.length-1;i++)
     {
         avg=sum/n.length;
         System.out .println(avg);
         
     }
    }
}   
    
    

