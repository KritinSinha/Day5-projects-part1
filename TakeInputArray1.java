/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package takeinputarray;
import java.util.Scanner;
/**
 *
 * @author KIIT
 */
public class TakeInputArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       int n[]=new int[4];
       int i;
       
       for(i=0;i<=n.length-1;i++)
       {
           System.out.println("Enter the element");
           n[i]=sc.nextInt();
       }
       System.out.println("The elements entered are as follows\n");
       for(i=0;i<=n.length-1;i++)
       {
       System.out.println(n[i]);    
       }
       
    }
    
}
