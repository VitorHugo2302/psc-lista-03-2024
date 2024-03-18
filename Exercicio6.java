/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Vitor Hugo
 */
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro n�mero inteiro: ");
        int numero1 = entrada.nextInt();

        System.out.print("Digite o segundo n�mero inteiro: ");
        int numero2 = entrada.nextInt();

        int menorNumero, maiorNumero;

        if (numero1 < numero2) {
            menorNumero = numero1;
            maiorNumero = numero2;
        } else {
            menorNumero = numero2;
            maiorNumero = numero1;
        }

        Random random = new Random();
        int numeroSorteado = random.nextInt(maiorNumero - menorNumero + 1) + menorNumero;

        System.out.println("N�mero sorteado: " + numeroSorteado);

        if (numeroSorteado % 2 == 0) {
            System.out.println("O n�mero sorteado � par.");
        } else {
            System.out.println("O n�mero sorteado � �mpar.");
        }

        entrada.close();
    }
}
