/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sheet4;

/**
 *
 * @author Ahmad Hamed
 */
public class Rational {
    private int numerator ;
    private int denumerator ;
 
   public Rational(){
       numerator=1;
       denumerator=1;
   }
   public Rational(int n ,int d){
       numerator=n;
       denumerator=d;
       
   } 
   public void setDenumerator(int d){
       denumerator=d;
   }
   public int getDenumerator(){
       return denumerator ;
   }
   public void setNumerator(int n) {
        numerator = n;
   }
   public int getNumerator(){
        return numerator ;
    }
   public double addRational(int a,int b,int c,int d){
        return((a/b)+(c/d));
    }
   public double multiplication (int a , int b, int c, int d){
       return((a/b)*(c/d));
   }
   public void display(){
       double rational = numerator/denumerator ;
       System.out.println(rational);
   }
}
