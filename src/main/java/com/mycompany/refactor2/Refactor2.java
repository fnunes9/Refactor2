/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.refactor2;

/**
 *
 * @author fernanda.nunes
 */
public class Refactor2 {

    public static void main(String[] args) {
        double[] vet1 = {90, 88, 78, 76};
        double[] vet2 = {865, 564, 43, 12, 13};

        double mediaVet1 = calcularMedia(vet1);
        System.out.println("Média do vetor 1: " + mediaVet1);

        double mediaVet2 = calcularMedia(vet2);
        System.out.println("Média do vetor 2: " + mediaVet2);
    }

    public static double calcularMedia(double[] vetor) {
        double soma = 0;
        for (double num : vetor) {
            soma += num;
        }
        return soma / vetor.length;
    }
}
