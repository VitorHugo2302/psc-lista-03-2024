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
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o c�digo da opera�?o (1 - Per�metro do c�rculo, 2 - �rea do c�rculo, 3 - Volume da esfera):");
        int codigoOperacao = entrada.nextInt();

        System.out.print("Digite o raio:");
        double raio = entrada.nextDouble();

        switch (codigoOperacao) {
            case 1:
                calcularPerimetroCirculo(raio);
                break;
            case 2:
                calcularAreaCirculo(raio);
                break;
            case 3:
                calcularVolumeEsfera(raio);
                break;
            default:
                System.out.println("Erro: C�digo de opera�?o inv�lido.");
        }

        entrada.close();
    }

    public static void calcularPerimetroCirculo(double raio) {
        double perimetro = 2 * Math.PI * raio;
        System.out.println("Per�metro do c�rculo: " + perimetro);
    }

    public static void calcularAreaCirculo(double raio) {
        double area = Math.PI * raio * raio;
        System.out.println("�rea do c�rculo: " + area);
    }

    public static void calcularVolumeEsfera(double raio) {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        System.out.println("Volume da esfera: " + volume);
    }
}
