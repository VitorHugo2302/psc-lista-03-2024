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
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o primeiro n�mero: ");
        double numero1 = entrada.nextDouble();
        
        System.out.print("Digite o segundo n�mero: ");
        double numero2 = entrada.nextDouble();
        
        System.out.print("Digite o terceiro n�mero: ");
        double numero3 = entrada.nextDouble();
        
        double maior = numero1;
        if (numero2 > maior) {
            maior = numero2;
        }
        if (numero3 > maior) {
            maior = numero3;
        }
        
        double menor = numero1;
        if (numero2 < menor) {
            menor = numero2;
        }
        if (numero3 < menor) {
            menor = numero3;
        }
        
        double media = (numero1 + numero2 + numero3) / 3;
        
        System.out.println("O maior n�mero �: " + maior);
        System.out.println("O menor n�mero �: " + menor);
        System.out.println("A m�dia aritm�tica dos n�meros �: " + media);
        
        entrada.close();
    }
}
