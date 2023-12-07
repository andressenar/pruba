/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject10;

import java.util.Scanner;

/**
 *
 * @author felii_000
 */
public class Mavenproject10 {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         int guillermo$, luis$, juan$;
        System.out.println("valor del dienero de guillermo");
        guillermo$= entrada.nextInt();
        System.out.println("guillermo tiene: "+guillermo$);
        luis$=guillermo$/2;
        System.out.println("luis tiene: "+luis$);
        juan$=(guillermo$/2)+(luis$/2);
        System.out.println("luis tiene: "+juan$);
        
        
    }
}
