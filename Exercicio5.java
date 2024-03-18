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
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número:");
        double numero1 = entrada.nextDouble();

        System.out.print("Digite o segundo número:");
        double numero2 = entrada.nextDouble();

        System.out.print("Digite o símbolo da operaç?o (+, -, *, /, ^):");
        char operacao = entrada.next().charAt(0);

        double resultado = 0;

        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                resultado = numero1 / numero2;
                break;
            case '^':
                resultado = Math.pow(numero1, numero2);
                break;
            default:
                System.out.println("Erro: Símbolo de operaç?o inválido.");
                return;
        }

        System.out.println("Resultado da operaç?o: " + resultado);

        entrada.close();
    }
}
