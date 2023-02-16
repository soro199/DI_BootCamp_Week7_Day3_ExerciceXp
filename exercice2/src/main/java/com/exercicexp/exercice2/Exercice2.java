/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exercicexp.exercice2;

import static com.exercicexp.exercice2.Tri.selectionSort;

/**
 *
 * @author SORO
 */
public class Exercice2 {

    public static void main(String[] args) {
        
          Integer[] intArray = {2, 9, 5, 4, 8, 1, 6};

    System.out.println("Tableau non trié :");
    for (int i : intArray) {
        System.out.print(i + " ");
    }

    selectionSort(intArray);

    System.out.println("\n\nTableau trié :");
    for (int i : intArray) {
        System.out.print(i + " ");
    }
    }
}
