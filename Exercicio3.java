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
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Coeficiente a: ");
        double a = entrada.nextDouble();
        
        System.out.print("Coeficiente b: ");
        double b = entrada.nextDouble();
        
        System.out.print("Coeficiente c: ");
        double c = entrada.nextDouble();
        
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if (a == 0 && b != 0) {
            System.out.println("Essa � uma equa�?o de primeiro grau.");
            double raiz = -c / b;
            System.out.println("Valor da raiz real da equa�?o: " + raiz);
        } else {
            double delta = b * b - 4 * a * c;
            
            if (delta < 0) {
                System.out.println("Esta equa�?o n?o possui ra�zes reais.");
            } else if (delta == 0) {
                double raiz = -b / (2 * a);
                System.out.println("Esta equa�?o possui duas ra�zes reais iguais.");
                System.out.println("Valor das ra�zes da equa�?o: " + raiz);
            } else {
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Esta equa�?o possui duas ra�zes reais diferentes.");
                System.out.println("Valor das ra�zes da equa�?o: " + raiz1 + " e " + raiz2);
            }
        }
        
        entrada.close();
    }
}
