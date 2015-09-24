/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uva;

import java.util.Scanner;

/**
 *
 * @author xyang23
 */
public class Q102 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[], min;
        a = new int[6];
        while(in.hasNext()){
            int b1 = in.nextInt();
            int g1 = in.nextInt();
            int c1 = in.nextInt();
            int b2 = in.nextInt();
            int g2 = in.nextInt();
            int c2 = in.nextInt();
            int b3 = in.nextInt();
            int g3 = in.nextInt();
            int c3 = in.nextInt();
            a[0] = b2 + b3 + c1 + c3 + g1 + g2;
            a[1] = b2 + b3 + g1 + g3 + c1 + c2;
            a[2] = c2 + c3 + b1 + b3 + g1 + g2;
            a[3] = c2 + c3 + g1 + g3 + b1 + b2;
            a[4] = g2 + g3 + b1 + b3 + c1 + c2;
            a[5] = g2 + g3 + c1 + c3 + b1 + b2;
            min = a[0];
            for (int i = 1; i < a.length; i++) {
                if (a[i] < min) {
                    min = a[i];
                }
            }
            if (min == a[0])
                System.out.print("BCG ");
            else if (min == a[1])
                System.out.print("BGC ");
            else if (min == a[2])
                System.out.print("CBG ");
            else if (min == a[3])
                System.out.print("CGB ");
            else if (min == a[4])
                System.out.print("GBC ");
            else
                System.out.print("GCB ");
            System.out.println(min);
        }
        in.close();
    }
    
}
