/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author Pratama
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[100];
        int max = -999;
        int min = 999;
        for(int i=0;i<arr.length;i++){
            System.out.print("Masukkan Nilai [" + (i+1) + "] : ");
            arr[i] = in.nextInt();
            if(arr[i] != -1){
                if(arr[i] > max)
                    max = arr[i];
                if(arr[i] < min)
                    min = arr[i];
            }else
                break;
        }
        System.out.println("--------------------------------");
        System.out.println("Nilai Maksimal Adalah : " + max);
        System.out.println("Nilai Minimal Adalah : " + min);
    }
}
