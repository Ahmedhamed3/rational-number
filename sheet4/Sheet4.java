/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sheet4;
import java . util.Scanner ;    

/**
 *
 * @author Ahmad Hamed
 */
public class Sheet4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Rational r = new Rational(4,2);
        System.out.println("Numerator="+r.getNumerator());
        System.out.println("Denumerator="+r.getDenumerator());
        System.out.println("Add ratioanl="+r.addRational(4, 2, 10, 5));
        System.out.println("mutliplication="+r.multiplication(4, 6, 3, 2));
        System.out.println("enter first rationnal number");
        int n1=input.nextInt();
        int n2=input.nextInt();
        System.out.println("enter second rationnal number");
        int n3=input.nextInt();
        int n4=input.nextInt();
        System.out.println("multiplicatio="+r.multiplication(n1, n2, n3, n4));
        System.out.println("Add 2 Rational="+r.addRational(n1, n2, n3, n4));
                
                
    }
    
}
