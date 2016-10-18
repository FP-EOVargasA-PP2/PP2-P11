/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p11;
import java.util.Scanner;

/**
 *
 * @author osiri
 */
public class PP2P11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, o;
        String [] r = new String [8000];
        n = pedir ();
        r = calcular (n);
        o = calcular2 (n);
        mostrar (r,o,n);
    }
    public static int pedir (){
        int n;
        Scanner teclado = new Scanner (System.in);
        System.out.println("*****   Romano   *****");
        System.out.println("Introduce un numero romano");
        n = teclado.nextInt();
        return n;
    }
    public static String [] calcular (int n){
        String [] r = new String[8000];
        int s, p, t, u, v, w, x;
        s = 0;
        p = 0;
        t = 0;
        u = 0;
        v = 0;
        w = 0;
        x = 0;
        for (int k = 0; k > n; k++){
            if (k >= 1 + s && k < 4 + s){
                r [p] = "I";
            }
            if (k == 4 + t){
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = "V";
            }
            if (k == 5 + t){
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = "V";
                s = s + 5;
            }
            if (k == 9 + t){
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = "I";
                p = p + 1;
                r [p] = "X";
            }
            if (k == 10 + t && k < 40 + u){
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = "X";
                t = t + 10;
                s = s + 5;
            }
            if (k == 40 + v){
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = "L";
                t = t + 10;
                s = s + 5;
            }
            if (k == 50 + v){
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = "L";
                t = t + 10;
                s = s + 5;
                u = u + 50;
            }
            if (k == 90 + v){
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = "X";
                p = p + 1;
                r [p] = "C";
                t = t + 10;
                s = s + 5;
            }
            if (k == 100 + v && k < 400 + w){
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = "C";
                t = t + 10;
                s = s + 5;
                u = u + 50;
                v = v + 100;
                
            }
            if (k == 400 + x){
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = "D";
                t = t + 10;
                s = s + 5;
                u = u + 50;
                v = v + 100;
            }
            if (k == 500 + x){
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = "D";
                s = s + 5;
                t = t + 10;
                u = u + 50;
                v = v + 100;
                w = w + 500;
            }
            if (k == 900 + x){
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = "C";
                p = p + 1;
                r [p] = "M";
                s = s + 5;
                t = t + 10;
                u = u + 50;
                v = v + 100;
            }
            if (k == 1000 + x){
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = "M";
                s = s + 5;
                t = t + 10;
                u = u + 50;
                v = v + 100;
                w = w + 500;
                x = x + 1000;
            }
            p = p + 1;
        }
        return r;
    }
    public static int calcular2 (int n){
        String [] r = new String[8000];
        int s, p, t, u, v, w, x;
        s = 0;
        p = 0;
        t = 0;
        u = 0;
        v = 0;
        w = 0;
        x = 0;
        for (int k = 0; k > n; k++){
            if (k >= 1 + s && k < 4 + s){
                r [p] = "I";
            }
            if (k == 4 + t){
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = "V";
            }
            if (k == 5 + t){
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = "V";
                s = s + 5;
            }
            if (k == 9 + t){
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = "I";
                p = p + 1;
                r [p] = "X";
            }
            if (k == 10 + t && k < 40 + u){
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = "X";
                t = t + 10;
                s = s + 5;
            }
            if (k == 40 + v){
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = "L";
                t = t + 10;
                s = s + 5;
            }
            if (k == 50 + v){
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = "L";
                t = t + 10;
                s = s + 5;
                u = u + 50;
            }
            if (k == 90 + v){
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = "X";
                p = p + 1;
                r [p] = "C";
                t = t + 10;
                s = s + 5;
            }
            if (k == 100 + v && k < 400 + w){
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = "C";
                t = t + 10;
                s = s + 5;
                u = u + 50;
                v = v + 100;
                
            }
            if (k == 400 + x){
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = "D";
                t = t + 10;
                s = s + 5;
                u = u + 50;
                v = v + 100;
            }
            if (k == 500 + x){
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = "D";
                s = s + 5;
                t = t + 10;
                u = u + 50;
                v = v + 100;
                w = w + 500;
            }
            if (k == 900 + x){
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = "C";
                p = p + 1;
                r [p] = "M";
                s = s + 5;
                t = t + 10;
                u = u + 50;
                v = v + 100;
            }
            if (k == 1000 + x){
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = " ";
                p = p - 1;
                r [p] = "M";
                s = s + 5;
                t = t + 10;
                u = u + 50;
                v = v + 100;
                w = w + 500;
                x = x + 1000;
            }
            p = p + 1;
        }
        return p;
    }
    public static void mostrar (String r [], int p, int n){
        System.out.println("el numero "+n+" en romano es");
        for (int k = 0; k < p; k++){
            System.out.println("["+r[k]+"]");
        }    
    }
}
