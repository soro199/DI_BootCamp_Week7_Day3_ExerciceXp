/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exercicexp.exercice2;

/**
 *
 * @author SORO
 */
public class Tri {
    
    public static <E extends Comparable<E>> void selectionSort(E[] list) {
    for (int i = 0; i < list.length - 1; i++) {
        // trouver le minimum
        int minIndex = i;
        for (int j = i + 1; j < list.length; j++) {
            if (list[j].compareTo(list[minIndex]) < 0) {
                minIndex = j;
            }
        }

        // échanger avec l'élément courant si nécessaire
        if (minIndex != i) {
            E temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
        }
    }
}
    
}
