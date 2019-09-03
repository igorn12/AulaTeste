package jogodado;

import java.util.Scanner;

public class Jogo {
        private Scanner input = new Scanner(System.in);
        private int resultado;
        private Dado dado1 = new Dado();
        private Dado dado2 = new Dado();
        private Jogador[] jogadores;
    
    public void inserirJogadores(){
        int qtd;
        System.out.println("Informe o numero de jogadores:");
        do{
            System.out.println("Maximo 11");
            qtd = input.nextInt();
        }while(qtd > 11);
        
        jogadores = new Jogador[qtd];
        
        for (int i = 0; i < 11; i++) {
            System.out.println("Qual o nome do "+(i+1)+" jogador?");
            jogadores[i]  = new Jogador(input.next());
        }

    }
    
    public void inserirAposta(){
        int aposta = 0;
        for (Jogador j : jogadores) {
            do{
            System.out.println(j.getName()+" informe sua aposta:");
            aposta = input.nextInt();
            }while(aposta < 2 || aposta > 12 );
            j.setAposta(aposta);
        
        }   
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
        boolean ganhou = false;
        for(Jogador j : jogadores){
            if(resultado == j.getAposta()){
                System.out.println(j.getName()+" Venceu!!");
                ganhou = true;
            }
        }
        if(!ganhou){
            System.out.println("Computador venceu!");
        }
    }
}
