/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typecasting;

/**
 *
 * @author KIIT
 */
public class TypeCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     int arr[]={2,5,6};
     int i;
     int sum=0;
     for(i=0;i<=arr.length-1;i++)
     {
         sum=sum+arr[i];
     }
     System.out.println(sum);
     int avg=0;
     for(i=0;i<arr.length;i++)
     {
         avg=sum/arr.length;
     }
    System.out.println(avg);
    }
    
    
}
