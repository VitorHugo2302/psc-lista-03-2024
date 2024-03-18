/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3;

import java.util.Scanner;

/**
 *
 * @author Vitor Hugo
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da compra:");
        double valorCompra = entrada.nextDouble();

        System.out.print("Digite o valor pago:");
        double valorPago = entrada.nextDouble();

        double troco = valorPago - valorCompra;

        if (troco < 0) {
            System.out.println("Quantia paga é insuficiente para realizar a compra.");
            entrada.close();
            return;
        }

        System.out.println("Troco: R$" + troco);

        int[] notas = {50, 20, 10, 5, 2, 1};

        for (int nota : notas) {
            int quantidadeNotas = (int) (troco / nota);
            troco %= nota;
            if (quantidadeNotas > 0) {
                System.out.println(quantidadeNotas + " nota(s) de R$" + nota + ",00");
            }
        }

        entrada.close();
    }
}
