/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.ruanmattos.parouimpar;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ParOuImpar {

    /**
     * Programa que verifica se o número digitado pelo usuário é par ou impar
     * @param args 
     */
    public static void main(String[] args) {
        System.out.println("Bom vindo(a) ao programa que irá lhe 'dizer' se o número digitado por vossa pessoa é positivo ou negativo");
        System.out.print("Digite o número que deseja verificar: ");
        Scanner s = new Scanner(System.in);
        double verificar = s.nextDouble();
        if ((verificar % 2) == 0) {
            System.out.println("O número digitado é par");
        }else{
            System.out.println("O número digitado é impar");
        }
    }
}
