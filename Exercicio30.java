/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio30;

/**
 *
 * @author 1072514795
 */

import java.util.Scanner;

public class Exercicio30 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o valor da base do triângulo: ");
            double base = scanner.nextDouble();
            
            System.out.print("Digite o valor da altura do triângulo: ");
            double altura = scanner.nextDouble();
            
            double area = (base * altura) / 2;
            
            System.out.println("A área do triângulo é: " + area);
        }
    }
}