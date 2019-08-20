package jogodado;

import java.util.Scanner;

public class Jogo {
        private Scanner input = new Scanner(System.in);
        private int resultado;
        private Dado dado1 = new Dado();
        private Dado dado2 = new Dado();
        private Jogador jogador1, jogador2;
    
    public void inserirJogadores(){
        System.out.println("Qual o nome do primeiro jogador?");
        jogador1 = new Jogador(input.next());
        System.out.println("Qual o nome do segundo jogador?");
        jogador2 = new Jogador(input.next());
    }
    
    public void inserirAposta(){
        int aposta = 0;
        do{
            System.out.println(jogador1.getName()+" informe sua aposta:");
            aposta = input.nextInt();
        }while(aposta < 2 || aposta > 12 );
        jogador1.setAposta(aposta);
        
        do{
            System.out.println(jogador2.getName()+" informe sua aposta:");
            aposta = input.nextInt();
            if(aposta == jogador1.getAposta()){
                System.out.println("valor inválido, informe outro:");
            };
        }while(aposta < 2  || aposta > 12 || aposta == jogador1.getAposta());
        jogador2.setAposta(aposta);
    }   
    
    public void lancarDado(){
        dado1.setValorFace();
        dado2.setValorFace();
    }
    
    public void mostrarResultado(){
        resultado = dado1.getValorFace() + dado2.getValorFace();
        System.out.println("Resultado: "+resultado);
    }
    
    public void mostrarVencedor(){
        if(resultado == jogador1.getAposta()){
            System.out.println(jogador1.getName()+" Venceu!!");
        }else if(resultado == jogador2.getAposta()){
            System.out.println(jogador2.getName()+" Venceu!!");
        }else{
            System.out.println("Computador venceu!!");
        }
    }
    
}
