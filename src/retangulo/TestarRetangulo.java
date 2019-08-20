package retangulo;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class TestarRetangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Retangulo r = new Retangulo();
        
        System.out.println("Digite a base do retangulo:");
        r.setBase(input.nextDouble());
        
        System.out.println("Digite a altura do retangulo:");
        r.setAltura(input.nextDouble());
        
        System.out.println("Area = "+r.calcularArea());
        
    }
}
