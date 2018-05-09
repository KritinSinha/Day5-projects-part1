/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

/**
 *
 * @author KIIT
 */
public class Array1 {

    
    public static void main(String[] args) 
    {
      //how to find prime number by divided by 2 logic. Covert it into square root logic.
        
        int n=15;
        int i;
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                System.out.println("Not prime");
                break;
            }
        }
        if(n%i!=0)
        {
            System.out.println("It is prime");
        }
    }
    
}
