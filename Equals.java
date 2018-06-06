/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasequals;

/**
 *
 * @author Pratama
 */
public class Equals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Perbedaan antara pemakaian == dengan equals");
        System.out.println("");
        
        String st1 = "elko selalu bersama dengan dedy";
        String st2 = "elko selalu bersama dengan dedy";
        String st3 = "elko selalu";
        String st4 = " bersama";
        String st5 = " dengan dedy";
        String st6 = st3 + st4 + st5 ;
        
        System.out.println("Pernyataan 1 adalah : " + st1);
        System.out.println("Pernyataan 2 adalah : " + st2);
        System.out.println("Pernyataan 3 adalah : " + st3);
        System.out.println("Pernyataan 4 adalah : " + st4);
        System.out.println("Pernyataan 5 adalah : " + st5);
        System.out.println("Pernyataan 6 adalah : " + st6);
        System.out.println("");
        System.out.println("--------------------------------------------------------------");
        System.out.println("");
        System.out.println("Pernyataan 1 Equals Pernyataan 2 : " + (st1.equals(st1)));
        System.out.println("Pernyataan 1 == Pernyataan 2     : " + (st1==st2));
        System.out.println("Pernyataan 6 Equals Pernyataan 1 : " + (st6.equals(st1)));
        System.out.println("Pernyataan 6 == Pernyataa 1      : " + (st6==st1));
        System.out.println("Pernyataan 6 Equals Pernyataan 2 : " + (st6.equals(st2)));
        System.out.println("Pernyataan 6 == Pernyataan 2     : " + (st6==st2));
    }
}
